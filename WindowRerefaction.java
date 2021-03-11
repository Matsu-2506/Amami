import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JRootPane;

public class WindowRerefaction extends JFrame implements KeyListener{

	public static Point mouseDownCompCoords = null;

	public WindowRerefaction(){

        super();
	
		ComponentResizer cr = new ComponentResizer();
		cr.registerComponent(this);
		cr.setSnapSize(new Dimension(10, 10));

		setUndecorated(true);
		setBackground(new Color(0,0,0,10));
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);

		// getContentPane().setBackground( new Color(0,0,255,0) );
        setBounds(200,200,800,600);

		addKeyListener(this);

		// addMouseListener(new MouseListener(){
        //     public void mouseReleased(MouseEvent e) {
        //         mouseDownCompCoords = null;
        //     }
        //     public void mousePressed(MouseEvent e) {
        //         mouseDownCompCoords = e.getPoint();
        //     }
        //     public void mouseExited(MouseEvent e) {
        //     }
        //     public void mouseEntered(MouseEvent e) {
        //     }
        //     public void mouseClicked(MouseEvent e) {
        //     }
        // });

        // addMouseMotionListener(new MouseMotionListener(){
        //     public void mouseMoved(MouseEvent e) {
        //     }

        //     public void mouseDragged(MouseEvent e) {
        //         Point currCoords = e.getLocationOnScreen();
        //         setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
        //     }
        // });

		// setVisible(true);
    }


	@Override
	public void keyTyped(KeyEvent e) {
		//使用しないので空にしておきます。
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			WindowCapture wc = new WindowCapture(this);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			// do nothing
		}
	}
}


// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;
// import javax.swing.border.LineBorder;

// public class WindowRerefaction {

//     private JFrame frame = new JFrame();

//     class MainPanel extends JPanel {

//         public MainPanel() {
//             setBackground(new Color(0,0,0,0));
//         }

//         @Override
//         public Dimension getPreferredSize() {
//             return new Dimension(400, 400);
//         }
//     }

//     class BorderPanel extends JPanel {

//         private JLabel label;
//         int pX, pY;

//         public BorderPanel() {
//             label = new JLabel(" X ");
//             label.setOpaque(true);
//             label.setBackground(Color.RED);
//             label.setForeground(Color.white);

//             setBackground(Color.black);
// 			// setBackground(new Color(0,0,0,0));
//             setLayout(new FlowLayout(FlowLayout.RIGHT));

//             add(label);

//             label.addMouseListener(new MouseAdapter() {
//                 public void mouseReleased(MouseEvent e) {
//                     System.exit(0);
//                 }
//             });
//             addMouseListener(new MouseAdapter() {
//                 public void mousePressed(MouseEvent me) {
//                     // Get x,y and store them
//                     pX = me.getX();
//                     pY = me.getY();

//                 }

//                  public void mouseDragged(MouseEvent me) {

//                     frame.setLocation(frame.getLocation().x + me.getX() - pX,
//                             frame.getLocation().y + me.getY() - pY);
//                 }
//             });

//             addMouseMotionListener(new MouseMotionAdapter() {
//                 public void mouseDragged(MouseEvent me) {

//                     frame.setLocation(frame.getLocation().x + me.getX() - pX,
//                             frame.getLocation().y + me.getY() - pY);
//                 }
//             });
//         }
//     }

//     class OutsidePanel extends JPanel {

//         public OutsidePanel() {
//             setLayout(new BorderLayout());
// 			setBackground(new Color(0,0,0,0));
//             add(new MainPanel(), BorderLayout.CENTER);
//             add(new BorderPanel(), BorderLayout.PAGE_START);
//             setBorder(new LineBorder(Color.BLACK, 5));
//         }
//     }

//     private void createAnsShowGui() {
//         ComponentResizer cr = new ComponentResizer();
//         cr.setMinimumSize(new Dimension(300, 300));
//         cr.setMaximumSize(new Dimension(800, 600));
//         cr.registerComponent(frame);
//         cr.setSnapSize(new Dimension(10, 10));
//         frame.setUndecorated(true);
//         frame.add(new OutsidePanel());
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.pack();
//         frame.setLocationRelativeTo(null);
//         frame.setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(new Runnable() {
//             public void run() {
//                 new WindowRerefaction().createAnsShowGui();
//             }
//         });
//     }
// }
