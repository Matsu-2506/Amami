import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CaptureAndDraw {

    private Robot robot; 

    public CaptureAndDraw() {
        try {
            robot = new Robot();
        } catch (AWTException ex) {
            ex.printStackTrace();
            return;
        }

        // 範囲を指定してキャプチャ
        Rectangle bounds = new Rectangle(100, 100, 400, 400);
        BufferedImage image = robot.createScreenCapture(bounds);

        JFrame frame = new JFrame("Capture Test");
        frame.setBounds(bounds);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label);

        frame.setUndecorated(true);
        frame.setVisible(true);
    }
}