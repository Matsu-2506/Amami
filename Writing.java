import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

public class Writing{
  static int w = 600;
  static int h = 400;

  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setTitle("DrawToolWindow");
    // Close the window and exit the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // JPanel panel = new JPanel();
    // panel.setOpaque(false)

    // size,position
    frame.setSize(600, 400);
    // frame.setLocation(100, 100);

    PaintCanvas canvas = new PaintCanvas();
    // add frame
    JPanel pane = new JPanel();
    frame.getContentPane().add(pane, BorderLayout.CENTER);
    JPanel paneB = new JPanel();
    frame.getContentPane().add(paneB, BorderLayout.NORTH);

    canvas.setPreferredSize(new Dimension(w, h));
    pane.add(canvas);


    /* Additional Features */
    // complete elimination
    JButton clear = new JButton("CLEAR");
    clear.addActionListener(new ClearListener(canvas));
    paneB.add(clear);

    // line thickness
    JSlider slider = new JSlider(1, 50, 1); 
    slider.addChangeListener(new SliderListener(canvas));
    paneB.add(slider);

    // line color
    String[] combodata = { "BLACK", "RED", "BLUE", "GREEN" };
    JComboBox combo = new JComboBox(combodata);
    combo.addActionListener(new ComboListener(canvas));
    paneB.add(combo);


    // Show Window
    frame.setVisible(true);
  }

  static class PaintCanvas extends JPanel implements MouseListener, MouseMotionListener {
    // retain the contents of the drawing
    private BufferedImage cImage = null;
    // Instances for drawing in cImage
    private Graphics2D g2d;  
    
    private int x, y, xx, yy;

    // mode selection / drawing or eraser
    private int type;
    // line thickness
    public int width = 1;
    // line color
    public Color c = Color.black;

    public PaintCanvas() {
      x = -1;
      y = -1;
      xx = -1;
      yy = -1;
      type = 0;
      
      addMouseListener(this);
      addMouseMotionListener(this);
      //setSize(600, 400);
    
      // Canvas Color
      setBackground(Color.white);

      // make BufferedImage
      cImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
      g2d = (Graphics2D) cImage.getGraphics();
      g2d.setColor(Color.WHITE);
      g2d.fillRect(0, 0, w, h);

      repaint();
    }

    // Clear Canvas
    public void clear() {
      g2d.setColor(Color.WHITE);
      g2d.fillRect(0, 0, w, h);
      repaint();
    }

    // line thickness
    public void setStroke(int n) {
      width = n;
    }

    // line color
    public void setColorCombo(String color) {
      if (color.equals("BLACK")) {
          c = Color.black;
      } else if (color.equals("RED")) {
          c = Color.red;
      } else if (color.equals("BLUE")) {
          c = Color.blue;
      } else if (color.equals("GREEN")) {
          c = Color.green;
      }
    }

    // mode selection / drawing or eraser
    public void paint(Graphics g) {
      // drawing mode
      if (type == 1) {
        if (x >= 0 && y >= 0 && xx >= 0 && yy >= 0) {
          BasicStroke stroke = new BasicStroke(width,
              BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
          g2d.setStroke(stroke);
          g2d.setColor(c);
          g2d.drawLine(xx, yy, x, y);
        }
          
      // eraser mode
      } else if (type == 2) {
        if (x >= 0 && y >= 0 && xx >= 0 && yy >= 0) {
          BasicStroke stroke = new BasicStroke(50.0f,
              BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
          g2d.setStroke(stroke);
          g2d.setColor(Color.white);
          g2d.drawLine(xx, yy, x, y);
        }
      }

      // Plot content on canvas
      g.drawImage(cImage, 0, 0, null);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
      // Detects pressed buttons
      if ((e.getModifiers() & MouseEvent.BUTTON1_MASK) != 0) {
          // left button click / drowing
          type = 1;
      }
      if ((e.getModifiers() & MouseEvent.BUTTON2_MASK) != 0) {
          // center button click
      }
      if ((e.getModifiers() & MouseEvent.BUTTON3_MASK) != 0) {
          // right button click / eraser
          type = 2;
      }
      xx = x;
      yy = y;

      Point point = e.getPoint();
      x = point.x;
      y = point.y;

      repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
      x = -1;
      y = -1;
      xx = -1;
      yy = -1;
      type = 0;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
      Point point = e.getPoint();
      x = point.x;
      y = point.y;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
  }


  //clear button
  static class ClearListener implements ActionListener {

    PaintCanvas canvas;

    public ClearListener(PaintCanvas canvas) {
      super();
      this.canvas = canvas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      canvas.clear();
    }
  }

  // slider
  static class SliderListener implements ChangeListener {

    PaintCanvas canvas;
    
    public SliderListener(PaintCanvas canvas) {
      super();
      this.canvas = canvas;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
      JSlider source = (JSlider) e.getSource();
      int fps = (int) source.getValue();
      canvas.setStroke(fps);
    }
  }

  // combo box
  static class ComboListener implements ActionListener {

    PaintCanvas canvas;

    public ComboListener(PaintCanvas canvas) {
      super();
      this.canvas = canvas;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      JComboBox source = (JComboBox) e.getSource();
      String color = (String) source.getSelectedItem();
      canvas.setColorCombo(color);
    }
  }
}
