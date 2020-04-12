package SmartHF;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class ManagePnl extends JPanel{
	private Header header;
	private Footer footer;
	private Body body;
	
	public ManagePnl() {
		init();
		setLayout();
		addComponent();
	}

	private void init() {
		header = new Header();
		body = new Body();
		footer = new Footer();
	}

	private void addComponent() {
		this.add(header.getPnlHeader(), BorderLayout.PAGE_START);
		this.add(body.getPnlBody(), BorderLayout.CENTER);
		this.add(footer.getPnlFooter(), BorderLayout.PAGE_END);
	}
	
	private void setLayout() {
		this.setLayout(new BorderLayout());
	}
	
	public JPanel getManagePnl() {
		return this;
	}
}
