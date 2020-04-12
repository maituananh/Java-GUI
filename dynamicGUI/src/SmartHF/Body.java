package SmartHF;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Body extends JPanel{
	private PnlRowBody mPnlRowBody;
	
	public Body() {
		init();
		setLayout();
		addComponent();
	}

	private void init() {
		mPnlRowBody = new PnlRowBody();
	}
	
	private void setLayout() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	public JPanel getPnlBody() {
		return this;
	}
	
	private void addComponent() {
		this.add(mPnlRowBody.getPnlBodyRow());
	}
}
