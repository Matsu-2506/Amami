import javax.swing.*;
import java.awt.BorderLayout;
import java.io.*;
import java.util.*;

public class TestPicture extends JFrame{

  TestPicture(){
    File dir = new File("./MyNotebook");  //Fileクラスのオブジェクトを生成し対象のディレクトリを指定
    File[] list = dir.listFiles();   
    ArrayList<JLabel> l = new ArrayList<JLabel>();       //listFilesを使用してファイル一覧を取得
    for(int i=0; i<list.length; i++) {
      // System.out.println(list[i].toString());     //フルパス
      System.out.println(list[i].getName());
      ImageIcon icon = new ImageIcon("./MyNotebook/"+list[i].getName());
      JLabel label = new JLabel(icon);
      l.add(label);
    }
    JPanel p = new JPanel();
    for(int i=0; i<list.length; i++) {
       p.add(l.get(i));
    }

    getContentPane().add(p, BorderLayout.CENTER);
  }
}