package swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test5 extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JButton btn7;
	private JButton btn9;
	private JButton btn8;
	private ActionListener actionListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String btnText = ((JButton) e.getSource()).getText();
			String tfValue = textField.getText();
			textField.setText(tfValue + btnText);
		}
	};

	/**
	 *  * Launch the application.  
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test5 frame = new Test5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 *  * Create the frame.  
	 */
	public Test5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 204, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		GridBagConstraints constraints = new GridBagConstraints();

		textField = new JTextField();
		setGridBagConstraints(constraints, 1, 4, GridBagConstraints.BOTH, 0, 0);
		contentPane.add(textField, constraints);
		textField.setColumns(10);

		btn7 = new JButton("7");
		btn7.addActionListener(actionListener);
		setGridBagConstraints(constraints, 1, 1, GridBagConstraints.BOTH, 1, 1);
		contentPane.add(btn7, constraints);

		btn8 = new JButton("8");
		btn8.addActionListener(actionListener);
		setGridBagConstraints(constraints, 1, 1, GridBagConstraints.BOTH, 2, 1);
		contentPane.add(btn8, constraints);

		btn9 = new JButton("9");
		btn9.addActionListener(actionListener);
		setGridBagConstraints(constraints, 1, 1, GridBagConstraints.BOTH, 3, 1);
		contentPane.add(btn9, constraints);

		JButton btnCopy = new JButton("CopyRun");
		btnCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textField.getText());
				textField.setText("");
			}
		});
		setGridBagConstraints(constraints, 1, 1, GridBagConstraints.BOTH, 1, 2);
		contentPane.add(btnCopy, constraints);

		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textArea.setText("");
				textField.setText("");
			}
		});
		setGridBagConstraints(constraints, 1, 1, GridBagConstraints.BOTH, 3, 2);
		contentPane.add(btnClear, constraints);

		textArea = new JTextArea();
		setGridBagConstraints(constraints, 1, 4, GridBagConstraints.BOTH, 0, 3);
		contentPane.add(textArea, constraints);

	}

	private void setGridBagConstraints(GridBagConstraints constraints, int gridheight, int gridwidth, int fill,
			int gridx, int gridy) {
		constraints.insets = new Insets(5, 5, 5, 5);
		constraints.gridheight = gridheight;
		constraints.gridwidth = gridwidth;
		constraints.fill = fill;
		constraints.gridx = gridx;
		constraints.gridy = gridy;
	}
}
