import javax.swing.JFrame;
import javax.swing.JPanel;

class MainWindow{
  public static void main(String args[]){
    JFrame frame = new JFrame();
    frame.setTitle("DrawToolWindow");

    //Window�̓����� �ł��Ȃ�?
    //JPanel panel = new JPanel();
    //panel.setOpaque(false);
    //�~�[�e�B���O�A�v��window�̈ʒu���擾

    //window�̃T�C�Y�A�ʒu�̐ݒ�
    frame.setSize(600, 400);
    //frame.setLocation(100, 100);

    //window�̕\��
    frame.setVisible(true);
  }
}
