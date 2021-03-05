import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FirstWindow extends JFrame implements ActionListener{
  JPanel cardPanel;
  CardLayout layout;
  public static void main(String args[]){
    FirstWindow frame = new FirstWindow();
    frame.setTitle("ツール名");
    frame.setBounds(100, 100, 600, 400);
    frame.setLocationRelativeTo(null);//中央に持ってくる
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  FirstWindow(){

    JButton button1 = new JButton("スタート");
    button1.setForeground(Color.BLUE);
    button1.setPreferredSize(new Dimension(200, 40));
    JPanel p1 = new JPanel();
    p1.add(button1);

    JButton button2 = new JButton();
    button2.setText("ノート（フォルダを開く）");
    JPanel p2 = new JPanel();
    p2.add(button2);
    button2.setForeground(Color.RED);
    button2.setPreferredSize(new Dimension(200, 40));

    cardPanel = new JPanel();
    layout = new CardLayout();
    cardPanel.setLayout(layout);

    cardPanel.add(p1, "panel01");
    cardPanel.add(p2, "panel02");

    JButton firstButton = new JButton("panel01");
    firstButton.addActionListener(this);
    firstButton.setActionCommand("panel01");

    JButton secondButton = new JButton("panel02");
    secondButton.addActionListener(this);
    secondButton.setActionCommand("panel02");

    JPanel btnPanel = new JPanel();
    btnPanel.add(firstButton);
    btnPanel.add(secondButton);

    Container contentPane = getContentPane();
    contentPane.add(cardPanel, BorderLayout.CENTER);
    contentPane.add(btnPanel, BorderLayout.PAGE_END);

  }

  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();

    layout.show(cardPanel, cmd);
}
}