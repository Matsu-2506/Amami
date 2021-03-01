import javax.swing.JFrame;
import javax.swing.JPanel;

class MainWindow{
  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setTitle("DrawToolWindow");

    //Windowの透明化 できない?
    //JPanel panel = new JPanel();
    //panel.setOpaque(false);
    //ミーティングアプリwindowの位置を取得

    //windowのサイズ、位置の設定
    frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //windowの表示
    frame.setVisible(true);
  }
}
