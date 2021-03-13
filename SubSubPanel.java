import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class SubSubPanel extends JFrame {
	JButton b,f,test;
	MainFrame mf;
	String str;
	JPanel pl,npl;
	File defFile = new File("MyNotebook(default)");
	static JFrame frame;
	TestPicture t;

	public SubSubPanel(){
		frame = new JFrame("WindowNotebook");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("menu");
        
        JMenuItem item1 = new JMenuItem("新規ファイル作成");
        JMenuItem item2 = new JMenuItem("編集");

        menu.add(item1);
        menu.add(item2);
        
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 250);
        frame.setVisible(true);

		pl = new JPanel();
		// pl.setBackground(Color.getHSBColor(65, 0.7f, 0.9f));
		frame.add(pl);
		pl.setVisible(true);

		//MyNotebook(default)ボタン
		f = new JButton(defFile.getName());
		f.setPreferredSize(new Dimension(150,40));
		f.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				t = new TestPicture();

				t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				t.setBounds(100, 100, 1200, 800);
				t.setTitle("タイトル");
				t.setVisible(true);
			}
		});
		pl.add(f);

		for(int i=0;i<MainPanel.files.size();i++){
			b = new JButton(MainPanel.files.get(i).getName());
			b.setPreferredSize(new Dimension(150,40));
			// b.addActionListener(new ActionListener(){
			// 	public void actionPerformed(ActionEvent e){

					
			// 	}
			// });
			MainPanel.buttons.add(b);
			pl.add(b);
			System.out.println(MainPanel.files.get(i));

		}
		
		item1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Getname g = new Getname("WindowNotebook");
			
		    }
		});
	}
	// public void PanelChange(JPanel jp){
	// 	ImageIcon icon = new ImageIcon("/Users/aikosuzuki/Amami/cat.jpeg");
    //     JLabel label = new JLabel(icon);
	// 	npl = new JPanel();
		
	// 	//label.setIcon(icon);
		
	// 	//label.setSize(500, 500);
	// 	npl.add(label);
	// 	npl.setVisible(true);

	// 	getContentPane().add(npl, BorderLayout.CENTER);
	
	// 	// Container contentPane = getContentPane();
	// 	// contentPane.add(p, BorderLayout.CENTER);

	// 	// if(jp==pl){
	// 	// 	pl.setVisible(false);
	// 	// 	npl.setVisible(true);
	// 	// }
	// 	// if(jp==npl){
	// 	// 	npl.setVisible(false);
	// 	// 	pl.setVisible(true);
	// 	// }
			
		
	}
