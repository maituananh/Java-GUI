package SmartHF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PnlRowBody extends JPanel{
	private JPanel panel1;
	private JComboBox<String> comboBox;
	private JTextField field;
	private JPanel panel2;
	private JComboBox<String> comboBox1;
	private JTextField field1;
	private JPanel panel3;
	private JComboBox<String> comboBox2;
	private JTextField field2;
	private JButton mButtonAdd;
	private JButton mButtonRemove;
	
	private PnlRowBody me;
	
	private void init() {
		comboBox = new JComboBox<>();
		field = new JTextField();
		comboBox1 = new JComboBox<>();
		field1 = new JTextField();
		comboBox2 = new JComboBox<>();
		field2 = new JTextField();
		mButtonAdd = new JButton("ADD");
		mButtonRemove = new JButton("Remove");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
	}
	
	public PnlRowBody() {
		init();
		setLayout();
		addComponent();
		action();
	}
	
	private void setLayout() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	private void addComponent() {
		panel1.add(comboBox);
		panel1.add(field);
		panel1.add(mButtonRemove);
		
		panel2.add(comboBox1);
		panel2.add(field1);
		panel2.add(mButtonRemove);
		
		panel3.add(comboBox2);
		panel3.add(field2);
		panel3.add(mButtonAdd);
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
	}
	
	private void action() {
		me = this;
		mButtonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dynamic dynamic = new Dynamic(me);
				me.add(dynamic.getDynamicPnl());
				panel3.remove(mButtonAdd);
				JButton buttonRemove = new JButton("new remove");
				panel3.add(buttonRemove);
				me.repaint(); 
				me.revalidate();
			}
		});
	}
	
	public JPanel getPnlBodyRow() {
		return this;
	}
}
