// import javax.swing.JFrame;

// import java.awt.AWTException;
// import java.awt.FlowLayout;
// import java.awt.Graphics;
// import java.awt.Rectangle;
// import java.awt.Robot;
// import java.awt.image.BufferedImage;
// import javax.swing.ImageIcon;
// import javax.swing.JButton;
// import javax.swing.JComponent;
// import javax.swing.JFrame;
// import javax.swing.JLabel;

// public class CaptureAndDraw extends JFrame{

//     private Robot robot;
//     private BufferedImage image; 

//     public CaptureAndDraw(String title) {

//         try {
//             robot = new Robot();
//         } catch (AWTException ex) {
//             ex.printStackTrace();
//             return;
//         }

//         // 範囲を指定してキャプチャ
//         Rectangle bounds = new Rectangle(100, 100, 400, 400);
//         image = robot.createScreenCapture(bounds);

//         JFrame frame = new JFrame("Capture Test");
//         frame.setBounds(bounds);


//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         JLabel label = new JLabel(new ImageIcon(image));
//         frame.getContentPane().add(label);

//         frame.setUndecorated(true);
//         frame.setVisible(true);

//         // setContentPane(new ImageComponent());




//         // super(title);
 
//         // try {
//         //     robot = new Robot();
//         // } catch (AWTException ex) {
//         //     ex.printStackTrace();
//         //     return;
//         // }
 
//         // Rectangle bounds = new Rectangle(100, 100, 400, 400);
//         // image = robot.createScreenCapture(bounds);
//         // setBounds(bounds);
 
//         // setContentPane(new ImageComponent());
//     }

//     class ImageComponent extends JComponent {
//         public void paintComponent(Graphics g) {
//             g.drawImage(image, 0, 0, this);
//         }
//     }
// }


// import java.awt.AWTException;
// import java.awt.FlowLayout;
// import java.awt.Graphics;
// import java.awt.Rectangle;
// import java.awt.Robot;
// import java.awt.image.BufferedImage;
// import javax.swing.JButton;
// import javax.swing.JComponent;
// import javax.swing.JFrame;



// import java.awt.Color;

// import javax.swing.SwingUtilities;
 
// public class CaptureAndDraw extends JFrame {
//     // private Robot robot; 
//     // private BufferedImage image;
 
//     // public CaptureAndDraw(String title) {
//     //     super(title);
 
//     //     try {
//     //         robot = new Robot();
//     //     } catch (AWTException ex) {
//     //         ex.printStackTrace();
//     //         return;
//     //     }
 
//     //     Rectangle bounds = new Rectangle(0, 0, 400, 400);
//     //     image = robot.createScreenCapture(bounds);
//     //     setBounds(bounds);
 
//     //     setContentPane(new ImageComponent());
//     // }
 
//     // class ImageComponent extends JComponent {
//     //     public void paintComponent(Graphics g) {
//     //         g.drawImage(image, 0, 0, this);
//     //     }
//     // }
 
    
//     // public static void main(String[] args) {
//     //     JFrame frame = new CaptureTest3("Capture Test");
//     //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     //     frame.getContentPane().setLayout(new FlowLayout());
//     //     frame.getContentPane().add(new JButton("Button"));
//     //     frame.setVisible(true);
//     // }



// }


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class WindowRerefaction extends JFrame{

    public static void main(final String[] args) {
		// OSのウィンドウ装飾を無くして、Look&Feelの装飾にしておきます。
		JFrame.setDefaultLookAndFeelDecorated(true);
        

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WindowRerefaction t = new WindowRerefaction();
				t.setVisible(true);
			}
		});
	}
    public WindowRerefaction(){
        super();
        setUndecorated(true);
        setBackground(new Color(0,0,0,10));
        setBounds(500,200,400,400);
    }
}