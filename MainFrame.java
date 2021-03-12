import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame{
	// static ArrayList<File> files = new ArrayList<File>();
	// static ArrayList<JButton> buttons = new ArrayList<JButton>();
	// File mnb = new File("MyNotebook(default)");
	
	public String[] PanelNames = {"mp","Sub1","Sub2","Sub3"};
	MainPanel mp = new MainPanel(this,PanelNames[0]);

	public MainFrame(){
		this.add(mp);mp.setVisible(true);
		this.setBounds(100, 100, 400, 200);

	}
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mf.setVisible(true);


	}
	
}