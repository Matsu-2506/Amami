import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MainWindow {
  public static void main(String args[]) {

    // OSのウィンドウ装飾を無くして、Look&Feelの装飾にしておきます。
		JFrame.setDefaultLookAndFeelDecorated(true);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WindowRerefaction t = new WindowRerefaction();
				// t.setVisible(true);
				
			}
		});
 
    // WindowRerefaction cad = new WindowRerefaction();
    // WindowCapture wc = new WindowCapture(cad);

  }
}
