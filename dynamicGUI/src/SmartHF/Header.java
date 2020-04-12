package SmartHF;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Header extends JPanel{
	private JLabel label;
	private JTextField textField;
	
	public Header() {
		init();
		setLayout();
		addComponent();
	}

	private void init() {
		label = new JLabel("HF Name");
		textField = new JTextField();
	}
	
	private void setLayout() {
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));;
	}
	
	private void addComponent() {
		this.add(label);
		this.add(textField);
	}
	
	public JPanel getPnlHeader() {
		return this;
	}
}
