package SmartHF;

import javax.swing.JFrame;

public class ManageFrame extends JFrame{
	private ManagePnl managePnl;
	
	public ManageFrame() {
		init();
		addComponent();
		this.setSize(500, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void init() {
		managePnl = new ManagePnl();
		this.setTitle("Smart HF");
	}
	
	private void addComponent() {
		this.add(managePnl.getManagePnl());
	}
	
	public static void main(String[] args) {
		new ManageFrame();
	}
}
