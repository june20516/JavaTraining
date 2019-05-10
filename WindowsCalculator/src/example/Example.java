package example;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Example extends JFrame {

		private JPanel contentPane;
		private JTextField resultTx = new JTextField();
		private JTextField processtArea = new JTextField();

		private JButton btnDot = new JButton(".");
			
		private List<JButton> numBtns;
		private List<JButton> opBtns;
		private List<JButton> delBtns;
		
		private ActionListener numActon;
		private ActionListener opActon;
		private ActionListener delActon;
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Example frame = new Example();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public Example() {
			super("Calculator");
			setType(Type.POPUP);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 0, 5, 0));
			setContentPane(contentPane);
			GridBagLayout gbl_contentPane = new GridBagLayout();
			contentPane.setLayout(gbl_contentPane);
			
			numBtns = new ArrayList<JButton>();
			opBtns = new ArrayList<JButton>();
			delBtns = new ArrayList<JButton>();
			String [] opStrs = {"=","+","-","x","÷","%"};
			String [] dels= {"C","BS"};
			
			for(int i=0; i<= 9 ; i++) {
				numBtns.add(new JButton(i+""));
			}
			for(int i=0; i< opStrs.length ; i++) {
				opBtns.add(new JButton(opStrs[i]));
			}
			for(int i=0; i< dels.length ; i++) {
				delBtns.add(new JButton(dels[i]));
			}

			init();
		}
		private void init() {
			setEditable();
			addLayout();
			addListener();
		}
		private void setEditable() {
			processtArea.setEditable(false);
			resultTx.setEditable(false);
		}
		private void addLayout() {
			GridBagConstraints gbc_text = new GridBagConstraints();
				gbc_text.gridwidth = 4;
				gbc_text.fill = GridBagConstraints.BOTH;
				gbc_text.gridx = 0;
				gbc_text.gridy = 0;
				contentPane.add(processtArea, gbc_text);
				gbc_text.gridy = 1;
				contentPane.add(resultTx, gbc_text);
			
			GridBagConstraints gbc_delBtns = new GridBagConstraints();
				gbc_delBtns.fill = GridBagConstraints.BOTH;
				gbc_delBtns.insets = new Insets(0, 0, 5, 5);
				for(int x=0;  x< delBtns.size() ; x ++) {
					gbc_delBtns.gridx = x;
					gbc_delBtns.gridy = 2;
					contentPane.add(delBtns.get(x), gbc_delBtns);
				}
			
			GridBagConstraints gbc_opBtns = new GridBagConstraints();
				gbc_opBtns.fill = GridBagConstraints.BOTH;
				gbc_opBtns.insets = new Insets(0, 0, 5, 5);
				gbc_opBtns.gridx = 3;
				for(int i=0;  i< opBtns.size()-1 ; i ++) {
					gbc_opBtns.gridy = opBtns.size()-i;
					contentPane.add(opBtns.get(i), gbc_opBtns);
				}
				gbc_opBtns.gridx = 2;
				contentPane.add(opBtns.get( opBtns.size()-1), gbc_opBtns);
				
			GridBagConstraints gbc_btnNums = new GridBagConstraints();
			gbc_btnNums.fill = GridBagConstraints.BOTH;
			gbc_btnNums.insets = new Insets(0, 0, 5, 5);
			for(int r=7,y=3 ; r>= 1 ; r-=3,y++) {
				for(int in=r,x=0 ; in <= r+2 ; in++,x++ ) {
					gbc_btnNums.gridx = x;
					gbc_btnNums.gridy = y;
					contentPane.add(numBtns.get(in), gbc_btnNums);
				}
			}
			gbc_btnNums.gridwidth = 2;
			gbc_btnNums.gridx = 0;
			gbc_btnNums.gridy = 6;
			contentPane.add(numBtns.get(0), gbc_btnNums);	
		
			GridBagConstraints gbc_btnEtc = new GridBagConstraints();
			gbc_btnEtc.insets = new Insets(0, 0, 0, 5);
			gbc_btnEtc.fill = GridBagConstraints.BOTH;
			gbc_btnEtc.gridx = 2;
			gbc_btnEtc.gridy = 6;
			contentPane.add(btnDot, gbc_btnEtc);
			
			pack();
		}
		
		private int num=0,res=0;
		private String  opCodeStr="+";
		private boolean isOpMode;
		private boolean isNumMode;	
		private String  numStr="";
		
		private boolean  isFirstEqualsClick=true;
		
		private void addListener() {
			numActon = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if( !isNumMode &&  isOpMode ){
						numStr="";
					}
					isNumMode=true;
					isOpMode=false;
					numStr+=e.getActionCommand();
					resultTx.setText(numStr);
				}
			};
			
			opActon = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (opCodeStr.equals("=")) {
						isOpMode=false;
						isNumMode=true;
					}
					
					if(!isOpMode && isNumMode){
						numStr=resultTx.getText();
						num=Integer.parseInt(numStr);
						switch(opCodeStr) { //{"=","+","-","x","÷","%"};
							case "+": res += num; break;
							case "-": res -= num; break;
							case "x": res *= num; break;
							case "÷": res /= num; break;
							case "%": res %= num; break;
							
						}
						resultTx.setText(res+"");
						isOpMode=true;
						isNumMode=false;
						
					}
					
					opCodeStr=e.getActionCommand();
					
					if(opCodeStr.equals("＝") && isFirstEqualsClick){
					
						
						isFirstEqualsClick=false;
					
					}
					
				}
			};
			delActon = new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getActionCommand().equals("C")) {
						num=0;
						res=0;
						opCodeStr="+";
						isOpMode=false;
						isNumMode=false;
						numStr="";
						resultTx.setText("");
					}else {
						try {
							numStr=resultTx.getText(0, numStr.length()-1);
							if(numStr.trim().length()==0){
								throw  new Exception();
							}
							resultTx.setText(numStr	);
						}catch (Exception e2) {
							resultTx.setText("0");
						}
					}
				}
			};
			for(int i=0; i<numBtns.size() ; i++) {
				numBtns.get(i).addActionListener(numActon);
			}
			for(int i=0; i< opBtns.size() ; i++) {
				opBtns.get(i).addActionListener(opActon);
			}
			for(int i=0; i< delBtns.size() ; i++) {
				delBtns.get(i).addActionListener(delActon);
			}
		}
		
	}

