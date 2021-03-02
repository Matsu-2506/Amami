import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

class MainWindow{
  public static void main(String args[]){
    JFrame frame = new JFrame();
    

    //Windowの透明化 できない?
    //JPanel panel = new JPanel();
    //panel.setOpaque(false);
    //ミーティングアプリwindowの位置を取得

    //windowのサイズ、位置の設定
    //frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //windowの表示
    //frame.setVisible(true);

    CaptureAndDraw cad = new CaptureAndDraw("Capture Test");
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.getContentPane().setLayout(new FlowLayout());
    // frame.setVisible(true);
   
    // frame.setSize(600, 400);
    //frame.setLocation(100, 100);


    // frame.setVisible(true);
  }
}
