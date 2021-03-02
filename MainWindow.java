import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

class MainWindow{
  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setTitle("DrawToolWindow");

    //Windowã®é€æ˜åŒ– ã§ããªã„?
    //Window‚Ì“§–¾‰» ‚Å‚«‚È‚¢?
    //JPanel panel = new JPanel();
    //panel.setOpaque(false);
    //ãƒŸãƒ¼ãƒ†ã‚£ãƒ³ã‚°ã‚¢ãƒ—ãƒªwindowã®ä½ç½®ã‚’å–å¾—
    //ƒ~[ƒeƒBƒ“ƒOƒAƒvƒŠwindow‚ÌˆÊ’u‚ğæ“¾

<<<<<<< HEAD
    //windowã®ã‚µã‚¤ã‚ºã€ä½ç½®ã®è¨­å®š
    //frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //windowã®è¡¨ç¤º
    //frame.setVisible(true);

    CaptureAndDraw cad = new CaptureAndDraw("Capture Test");
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.getContentPane().setLayout(new FlowLayout());
    // frame.setVisible(true);
=======
    //window‚ÌƒTƒCƒYAˆÊ’u‚Ìİ’è
    frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //window‚Ì•\¦
    frame.setVisible(true);
>>>>>>> master
  }
}
