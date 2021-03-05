import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class WindowRerefaction extends JFrame{
	static Point mouseDownCompCoords = null;
    public static void main(final String[] args) {

		// OSのウィンドウ装飾を無くして、Look&Feelの装飾にしておきます。
		JFrame.setDefaultLookAndFeelDecorated(true);       

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WindowRerefaction t = new WindowRerefaction();
				t.setVisible(true);
			}
		});

	}

    public WindowRerefaction(){
        super();
		
        setUndecorated(true);
        setBackground(new Color(0,0,0,10));

		// getContentPane().setBackground( new Color(0,0,255,0) );
        setBounds(500,200,400,400);


		addMouseListener(new MouseListener(){
            public void mouseReleased(MouseEvent e) {
                mouseDownCompCoords = null;
            }
            public void mousePressed(MouseEvent e) {
                mouseDownCompCoords = e.getPoint();
            }
            public void mouseExited(MouseEvent e) {
            }
            public void mouseEntered(MouseEvent e) {
            }
            public void mouseClicked(MouseEvent e) {
            }
        });

        addMouseMotionListener(new MouseMotionListener(){
            public void mouseMoved(MouseEvent e) {
            }

            public void mouseDragged(MouseEvent e) {
                Point currCoords = e.getLocationOnScreen();
                setLocation(currCoords.x - mouseDownCompCoords.x, currCoords.y - mouseDownCompCoords.y);
            }
        });
    }
}



