package UI;

 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

 

public class demo {
    private JFrame mFrame;
    
    private JPanel mPanelFrame;
    private JPanel mPanelHeadFrame;
    
    private JPanel mPanelBodyFrame;
    private JPanel mPanelGroupBody;
    private JPanel mPanelRowGridLine1;
    private JPanel mPanelRowGridLine2;
    private JPanel mPanelRowGridLine3;
    private JPanel mPanelRowGridLine4;
    
    private JPanel mPanelFooterFrame;
    private JPanel mPanelFooterTitle;
    private JPanel mPanelFooterButton;
    
    private JButton mButtonOK;
    private JButton mButtonCancle;
    private JButton mButtonAdd;
    private JButton mButtonRemove;
    private JButton mButtonRemove1;
    
    private JTextField mTextFieldFileName;
    private JTextField mTextFieldFileName1;
    private JTextField mTextFieldFileName2;
    private JTextField mTextFieldTopSeparator;
    private JTextField mTextFieldFileName3;
    
    private JLabel mLabelHFName;
    private JLabel mLabelHeadOfFooter;
    
    private JComboBox<String> mComboBox1;
    private JComboBox<String> mComboBox2;
    private JComboBox<String> mComboBox3;
    
    private Icon mIconAdd = new ImageIcon("image.png");
    private Icon mIconRemove = new ImageIcon("eimage.png");
    
    public static final int PADDING_BODY = 9;
    
    String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
    
    public static void main(String[] args) {new demo();}
    
    public demo() {
        init();
        setLayout();
        setProperties();
        setBorder();
        setSize();
        addPanel();
        action();
        mFrame.setVisible(true);
    }

    public void init() {
        mFrame = new JFrame();
        
        // panel
        mPanelFrame = new JPanel();
        //    // panel header
        mPanelHeadFrame = new JPanel();
        //    // panel body
        mPanelBodyFrame = new JPanel();
        mPanelGroupBody = new JPanel();
        mPanelRowGridLine1 = new JPanel();
        mPanelRowGridLine2 = new JPanel();
        mPanelRowGridLine3 = new JPanel();
        mPanelRowGridLine4 = new JPanel();
        //    // panel footer
        mPanelFooterFrame = new JPanel();
        mPanelFooterTitle = new JPanel();
        mPanelFooterButton = new JPanel();
        // end panel
        
        // button
        mButtonCancle = new JButton("Cancle");
        mButtonOK = new JButton("OK");
        

        mButtonAdd = new JButton(mIconAdd);
        mButtonRemove = new JButton(mIconRemove);
        mButtonRemove1 = new JButton(mIconRemove);
        // end button
        
        // textField
        mTextFieldFileName = new JTextField();
        mTextFieldFileName1 = new JTextField();
        mTextFieldFileName2 = new JTextField();
        mTextFieldTopSeparator = new JTextField();
        mTextFieldFileName3 = new JTextField();
        // end textField
        
        // label
        mLabelHFName = new JLabel("HF Name:");
        mLabelHeadOfFooter = new JLabel("File Name Rule:");
        //end label
        
        // combobox
        mComboBox1 = new JComboBox<>(petStrings);
        mComboBox2 = new JComboBox<>(petStrings);
        mComboBox3 = new JComboBox<>(petStrings);
        // end combobox
        
        // frame
        mFrame.setSize(700, 650);
        mFrame.setLocationRelativeTo(null);
        mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mFrame.setTitle("Smart HF Property");
    }
    
    public void setLayout() {
        mPanelFrame.setLayout(new BorderLayout());
        mPanelHeadFrame.setLayout(new FlowLayout(FlowLayout.LEFT, PADDING_BODY, 9));

        mPanelBodyFrame.setLayout(new GridLayout(1, 1));
        mPanelGroupBody.setLayout(new BoxLayout(mPanelGroupBody, BoxLayout.Y_AXIS));
        
        mPanelRowGridLine1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        mPanelRowGridLine2.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        mPanelRowGridLine3.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        mPanelRowGridLine4.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
        
        mPanelFooterFrame.setLayout(new GridLayout(2, 1));
        mPanelFooterTitle.setLayout(new FlowLayout(FlowLayout.LEFT, PADDING_BODY, 9));
        mPanelFooterButton.setLayout(new FlowLayout(FlowLayout.RIGHT, PADDING_BODY, 5));
    }
    
    public void setProperties() {
        // header
        mPanelHeadFrame.add(mLabelHFName);
        mPanelHeadFrame.add(mTextFieldFileName);
        // end header
        
        // body
        mPanelRowGridLine1.add(mTextFieldTopSeparator);
        
        mPanelRowGridLine2.add(mComboBox1);
        mPanelRowGridLine2.add(mTextFieldFileName1);
        mPanelRowGridLine2.add(mButtonRemove1);
        
        mPanelRowGridLine3.add(mComboBox2);
        mPanelRowGridLine3.add(mTextFieldFileName2);
        mPanelRowGridLine3.add(mButtonRemove);
        
        mPanelRowGridLine4.add(mComboBox3);
        mPanelRowGridLine4.add(mTextFieldFileName3);
        mPanelRowGridLine4.add(mButtonAdd);
        
        mPanelGroupBody.add(mPanelRowGridLine1);
        mPanelGroupBody.add(mPanelRowGridLine2);
        mPanelGroupBody.add(mPanelRowGridLine3);
        mPanelGroupBody.add(mPanelRowGridLine4);
        // end body
        
        // Footer
        mPanelFooterTitle.add(mLabelHeadOfFooter);
        mPanelFooterButton.add(mButtonCancle);
        mPanelFooterButton.add(mButtonOK);
        // end Footer
    }
    
    public void addPanel() {
        mPanelFrame.add(mPanelHeadFrame, BorderLayout.PAGE_START);
        
        mPanelBodyFrame.add(mPanelGroupBody);
        mPanelFrame.add(mPanelBodyFrame, BorderLayout.CENTER);
        
        mPanelFooterFrame.add(mPanelFooterTitle);
        mPanelFooterFrame.add(mPanelFooterButton);
        mPanelFrame.add(mPanelFooterFrame, BorderLayout.PAGE_END);
        
        mFrame.add(mPanelFrame);
    }
    
    public void setBorder() {
        Border borderBody = BorderFactory.createTitledBorder("File Name Rule Setting: ");
        mPanelBodyFrame.setBorder(borderBody);
    }
    
    public void setSize() {
        mButtonAdd.setPreferredSize(new Dimension(50, 30));
        mButtonRemove.setPreferredSize(new Dimension(50, 30));
        mButtonRemove1.setPreferredSize(new Dimension(50, 30));
        
        mButtonOK.setPreferredSize(new Dimension(90, 26));
        mButtonCancle.setPreferredSize(new Dimension(90, 26));
        
        mComboBox1.setPreferredSize(new Dimension(170, 30));
        mComboBox2.setPreferredSize(new Dimension(170, 30));
        mComboBox3.setPreferredSize(new Dimension(170, 30));
        
        mTextFieldFileName2.setPreferredSize(new Dimension(170, 30));
        mTextFieldFileName1.setPreferredSize(new Dimension(170, 30));
        mTextFieldTopSeparator.setPreferredSize(new Dimension(100, 30));
        mTextFieldFileName.setPreferredSize(new Dimension(170, 30));
        mTextFieldFileName3.setPreferredSize(new Dimension(170, 30));
        
//        mPanelRowGridLine1.setBackground(Color.RED);
//        mPanelRowGridLine2.setBackground(Color.CYAN);
//        mPanelRowGridLine3.setBackground(Color.GRAY);
//        mPanelRowGridLine4.setBackground(Color.BLUE);
//        mPanelGroupBody.setBackground(Color.YELLOW);
//        mPanelBodyFrame.setBackground(Color.BLACK);
    }
    int i = 1;
    List<JPanel> fields= new ArrayList<JPanel>(); 

    public void action() {
    	mButtonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			    JButton newButtonRemove = new JButton(mIconRemove);
			    JPanel newPanel = new JPanel();
				JButton jButtonRemove4 = new JButton(mIconRemove);
	    		if (mPanelRowGridLine4.isDisplayable() && i == 1) {
	    			mPanelRowGridLine4.add(jButtonRemove4);
	    			jButtonRemove4.setPreferredSize(new Dimension(50, 30));
	    			i --;
	    		}
				JComboBox<String> newComboBox = new JComboBox<>(petStrings);
				JTextField newTextField = new JTextField();
				newPanel.add(newComboBox);
				newPanel.add(newTextField);
				newPanel.add(newButtonRemove);
				newPanel.add(mButtonAdd);
//				((JButton)e.getSource()).getParent().remove(mButtonAdd);
				newPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 5));
				//System.out.println("The current panel is " + ((JButton)e.getSource()).getParent().remove(newButtonRemove));
				newComboBox.setPreferredSize(new Dimension(170, 30));
				newTextField.setPreferredSize(new Dimension(170, 30));
				newButtonRemove.setPreferredSize(new Dimension(50, 30));
				mPanelGroupBody.add(newPanel);
				mPanelBodyFrame.add(mPanelGroupBody);
				System.out.println(mPanelGroupBody.getComponentCount());
				mPanelGroupBody.getComponent(mPanelGroupBody.getComponentCount() - 1).setBackground(Color.BLUE);
				System.out.println(mPanelGroupBody.getComponent(mPanelGroupBody.getComponentCount() - 1).getTreeLock());
				mPanelGroupBody.repaint();
				mPanelGroupBody.revalidate();
			}
		});
    	
//    	newButtonRemove.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				newPanel.getParent().remove(newPanel);
//				mPanelGroupBody.repaint();
//				mPanelGroupBody.revalidate();
//			}
//		});
    }
}