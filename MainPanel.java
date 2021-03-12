import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.*;
import java.io.*;

public class MainPanel extends JPanel {
    SubSubPanel sp3;
	JButton btn2,btn3;
	JLabel paneltitle;
	MainFrame mf;
	String str;
	static ArrayList<File> files = new ArrayList<File>();
	static ArrayList<JButton> buttons = new ArrayList<JButton>();
	//File mnb = new File("MyNotebook(default)");

	public MainPanel(MainFrame m,String s){
		//files.add(mnb);

		mf = m;
		str = s;
		this.setName("mp");
		this.setLayout(null);
		this.setSize(400, 200);
		paneltitle = new JLabel("説明？");
		paneltitle.setBounds(0, 5, 400, 40);
		this.add(paneltitle);
		
		btn2 = new JButton("起動");
		btn2.setBounds(20, 100, 150, 40);
		// btn2.addActionListener(new ActionListener(){
		// 	public void actionPerformed(ActionEvent e){
		// 		pc(mf.PanelNames[2]);
		// 	}
		// });
		this.add(btn2);
		btn3 = new JButton("ノート閲覧");
		btn3.setBounds(200, 100, 150, 40);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
                sp3= new SubSubPanel();
			}
		});
		this.add(btn3);
	}
	// public void pc(String str){
	// 	mf.PanelChange((JPanel)this, str);
	// }
}