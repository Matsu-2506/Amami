
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


class MainWindow {
  public static void main(String args[]) {

    // OSのウィンドウ装飾を無くして、Look&Feelの装飾にしておきます。
		JFrame.setDefaultLookAndFeelDecorated(true);

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				WindowRerefaction wr = new WindowRerefaction();
				wr.setVisible(true);


        // Writing write = new Writing();
				
			}
		});
 
    // WindowRerefaction cad = new WindowRerefaction();
    // WindowCapture wc = new WindowCapture(cad);

  }
}
