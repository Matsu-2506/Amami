import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;

class MainWindow{
  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setTitle("DrawToolWindow");

    //Windowの透明化 できない?
    //Window�̓����� �ł��Ȃ�?
    //JPanel panel = new JPanel();
    //panel.setOpaque(false);
    //ミーティングアプリwindowの位置を取得
    //�~�[�e�B���O�A�v��window�̈ʒu���擾

<<<<<<< HEAD
    //windowのサイズ、位置の設定
    //frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //windowの表示
    //frame.setVisible(true);

    CaptureAndDraw cad = new CaptureAndDraw("Capture Test");
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.getContentPane().setLayout(new FlowLayout());
    // frame.setVisible(true);
=======
    //window�̃T�C�Y�A�ʒu�̐ݒ�
    frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //window�̕\��
    frame.setVisible(true);
>>>>>>> master
  }
}
