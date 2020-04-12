package SmartHF;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Footer extends JPanel{
	private JButton button1;
	private JButton button2;
	
	public Footer() {
		init();
	}

	private void init() {
		button1 = new JButton("OK");
		button2 = new JButton("Cancle");
	}

	public JPanel getPnlFooter() {
		return this;
	}
}
