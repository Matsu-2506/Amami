import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Writing{
  /*

  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setTitle("DrawToolWindow");

    //JPanel panel = new JPanel();
    //panel.setOpaque(false)

    //size,position
    frame.setSize(600, 400);
    //frame.setLocation(100, 100);
    frame.setVisible(true);
  }
*/

  public static void main(String[] args) {
    JFrame frame = new JFrame("SimplePainter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 400);
    frame.setLocationRelativeTo(null);

    Canvas canvas = new Canvas();
    frame.add(canvas);

    frame.setVisible(true);
  }
}

class Canvas extends JPanel implements MouseListener, MouseMotionListener {
    private int x = -100;
    private int y = -100;

    public Canvas() {
      addMouseListener(this);
      addMouseMotionListener(this);
      setSize(600, 400);
    }

    //Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(x-5, y-5, 10, 10);
    }

    public void mouseDragged(MouseEvent e){
      x = e.getX();
      y = e.getY();
      repaint();
    }

    public void mouseMoved(MouseEvent e){
    }

    //Override
    public void mouseClicked(MouseEvent e) {
    }

    //Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
    }

    //Override
    public void mouseReleased(MouseEvent e) {
    }

    //Override
    public void mouseEntered(MouseEvent e) {
    }

    //Override
    public void mouseExited(MouseEvent e) {
    }
  
}