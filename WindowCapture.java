
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class WindowCapture {

    private int windowWidth;
    private int windowHeight;
    private int windowX;
    private int windowY;

    private static SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd_HHmmss");

    public WindowCapture() {

    }

    public WindowCapture(WindowRerefaction wr) {
        try {
            // キャプチャの範囲
            readPositionFromComponent(wr);
            Rectangle bounds = new Rectangle(windowX, windowY, windowWidth, windowHeight);

            // これで画面キャプチャ
            Robot robot = new Robot();
            BufferedImage image = robot.createScreenCapture(bounds);

            // 以下、出力処理
            // String dirName = "../images";
            String fileName = "test_" + format.format(new Date()) + ".jpg";
            ImageIO.write(image, "jpg", new File("./MyNotebook/"+fileName));

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readPositionFromComponent(Component component) {
        windowWidth = component.getWidth();
        windowHeight = component.getHeight();
        windowX = component.getX();
        windowY = component.getY();
    }

    public int getWidthFromComponent(Component component) {
        return windowWidth;
    }

    public int getHeightFromComponent(Component component) {
        return windowHeight;
    }

    public int getPositionXFromComponent(Component component) {
        return windowX;
    }

    public int getPositionYFromComponent(Component component) {
        return windowY;
    }
}
