import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.SwingUtilities;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JRootPane;

public class WindowRerefaction extends JFrame implements KeyListener{

	public static Point mouseDownCompCoords = null;



	 
	 

	public WindowRerefaction(){

        super();

		setDefaultLookAndFeelDecorated(true);
	
		ComponentResizer cr = new ComponentResizer();
		cr.registerComponent(this);
		cr.setSnapSize(new Dimension(10, 10));

		setUndecorated(true);
		setBackground(new Color(0,0,0,5));
		getRootPane().setWindowDecorationStyle(JRootPane.NONE);

		// getContentPane().setBackground( new Color(0,0,255,0) );
        setBounds(200,200,800,600);

		addKeyListener(this);
		requestFocus();
    }


	@Override
	public void keyTyped(KeyEvent e) {
		//使用しないので空にしておきます。
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			WindowCapture wc = new WindowCapture(this);
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			// do nothing
		}
	}


}

