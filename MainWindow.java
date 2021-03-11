
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


class MainWindow {
  public static void main(String args[]) {

    // OSのウィンドウ装飾を無くして、Look&Feelの装飾にしておきます。
		JFrame.setDefaultLookAndFeelDecorated(true);

		SwingUtilities.invokeLater(new Runnable() {

			public void run() {		
        		Writing write = new Writing();				
			}
		});
  }
}
