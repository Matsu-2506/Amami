import javax.swing.*;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.io.*;
import java.util.*;

public class TestPicture extends JFrame{

  TestPicture(){
    // JScrollBar scroll = new JScrollBar();

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

    JScrollPane scrollpane = new JScrollPane(p);
    scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    // getContentPane().add(p, BorderLayout.CENTER);
    // p.add(scrollpane);
    // scrollpane.setVisible(true);
    getContentPane().add(scrollpane, BorderLayout.CENTER);

  }
}

