import java.awt.AWTException;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CaptureAndDraw extends JFrame{

    private Robot robot;
    private BufferedImage image; 

    public CaptureAndDraw(String title) {

        try {
            robot = new Robot();
        } catch (AWTException ex) {
            ex.printStackTrace();
            return;
        }

        // 範囲を指定してキャプチャ
        Rectangle bounds = new Rectangle(100, 100, 400, 400);
        image = robot.createScreenCapture(bounds);

        JFrame frame = new JFrame("Capture Test");
        frame.setBounds(bounds);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label);

        frame.setUndecorated(true);
        frame.setVisible(true);

        // setContentPane(new ImageComponent());




        // super(title);
 
        // try {
        //     robot = new Robot();
        // } catch (AWTException ex) {
        //     ex.printStackTrace();
        //     return;
        // }
 
        // Rectangle bounds = new Rectangle(100, 100, 400, 400);
        // image = robot.createScreenCapture(bounds);
        // setBounds(bounds);
 
        // setContentPane(new ImageComponent());
    }

    class ImageComponent extends JComponent {
        public void paintComponent(Graphics g) {
            g.drawImage(image, 0, 0, this);
        }
    }
}