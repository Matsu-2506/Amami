import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.io.*;

class Getname extends JFrame implements ActionListener{
  JTextField textf;
  String s;
  MainFrame mf = new MainFrame();
  Getname(String title){
    setTitle(title);
    setBounds(100, 100, 600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    textf = new JTextField(20);
    JButton button = new JButton("make");
    button.addActionListener(this);

    JPanel p = new JPanel();
    p.add(textf);
    p.add(button);


    Container contentPane = getContentPane();
    contentPane.add(p, BorderLayout.CENTER);

    setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
      s=textf.getText();
      makeFile();
  }
  public void makeFile(){
    File newfile = new File(s);
		newfile.mkdir();
    MainPanel.files.add(newfile);
    System.out.println(MainPanel.files.get(0));
    SubSubPanel sb = new SubSubPanel();
  }
}