package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class demo {
	private JFrame mFrame;
	
	private JPanel mPanelFrame;
	private JPanel mPanelHeadFrame;
	private JPanel mPanelBodyFrame;
	private JPanel mPanelFooterFrame;
	private JPanel mPanelRowGrid;
	
	private JButton mFileName;
	private JButton mFileName1;
	private JButton mFileName2;
	private JButton mFileName3;
	private JButton mButtonAdd;
	private JButton mButtonRemove;
	
	private JTextField mTextFieldFileName;
	private JTextField mTextFieldFileName1;
	private JTextField mTextFieldFileName2;
	private JTextField mTextFieldFileName3;
	
	public static void main(String[] args) {new demo();}
	
	public demo() {
		init();
		setLayout();
		setProperties();
		setColumnForFlowLayout();
		addPanel();
	}

	public void init() {
		mFrame = new JFrame();
		
		mPanelFrame = new JPanel();
		mPanelHeadFrame = new JPanel();
		mPanelBodyFrame = new JPanel();
		mPanelFooterFrame = new JPanel();
		mPanelRowGrid = new JPanel();
		
		mFileName = new JButton("Button Head");
		mFileName1 = new JButton("Button Body 1");
		mFileName2 = new JButton("Button Body 2");
		mFileName3 = new JButton("Button Footer");
		mButtonAdd = new JButton("+");
		mButtonRemove = new JButton("-");
		
		mTextFieldFileName = new JTextField("Button Head ");
		mTextFieldFileName1 = new JTextField();
		mTextFieldFileName2 = new JTextField();
		mTextFieldFileName3 = new JTextField("Button Footer ");
		
		mFrame.setVisible(true);
		mFrame.setSize(600, 600);
		mFrame.setLocationRelativeTo(null);
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mFrame.setTitle("DEMO GUI");
	}
	
	public void setLayout() {
		mPanelFrame.setLayout(new BorderLayout());
		mPanelHeadFrame.setLayout(new FlowLayout());
		mPanelBodyFrame.setLayout(new GridLayout(2, 2, 20, 20));
		mPanelRowGrid.setLayout(new FlowLayout());
		mPanelFooterFrame.setLayout(new FlowLayout());
	}
	
	public void setProperties() {
		// header
		mPanelHeadFrame.add(mFileName);
		mPanelHeadFrame.add(mTextFieldFileName);
		// end header

		// body
		mPanelRowGrid.add(mFileName1);
		mPanelRowGrid.add(mTextFieldFileName1);
		mPanelRowGrid.add(mFileName2);
		mPanelRowGrid.add(mTextFieldFileName2);
		// end body
		
		// header
		mPanelFooterFrame.add(mFileName3);
		mPanelFooterFrame.add(mTextFieldFileName3);
		// end header
	}
	
	public void setColumnForFlowLayout() {
		mTextFieldFileName.setColumns(20);
		mTextFieldFileName1.setColumns(20);
		mTextFieldFileName2.setColumns(20);
		mTextFieldFileName3.setColumns(20);
	}
	
	public void addPanel() {
		mPanelFrame.add(mPanelHeadFrame, BorderLayout.NORTH);
		mPanelBodyFrame.add(mPanelRowGrid);
		mPanelFrame.add(mPanelBodyFrame, BorderLayout.CENTER);
		mPanelFrame.add(mPanelFooterFrame, BorderLayout.PAGE_END);
		mFrame.add(mPanelFrame);
	}
}
