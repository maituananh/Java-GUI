package SmartHF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Dynamic extends JPanel{
	private JComboBox<String> comboBox;
	private JTextField field;
	private JButton mButtonAdd;
	private JButton mButtonRemove;
	private Dynamic dynamic;
	private PnlRowBody mParent;
	
	private void init() {
		comboBox = new JComboBox<String>();
		field = new JTextField();
		mButtonAdd = new JButton("new ADD");
		mButtonRemove = new JButton("NEW REMOVE");
	}
	
	private void addComponent() {
		this.add(comboBox);
		this.add(field);
		this.add(mButtonAdd);
	}
	
	private void action() {
		dynamic = this;
		mButtonAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dynamic.remove(mButtonAdd);
				dynamic.add(mButtonRemove);
				Dynamic dynamic1 = new Dynamic(mParent);
				dynamic1.getDynamicPnl();
				mParent.add(dynamic1);
				dynamic.repaint(); 
				dynamic.revalidate();
			}
		});
	}

	public Dynamic(PnlRowBody inParent) {
		mParent = inParent;
		init();
		addComponent();
		action();
	}
	
	public JPanel getDynamicPnl() {
		return this;
	}
}
