package multithread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressEx extends JPanel {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("멀티 스레드 프로그래스 바");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new ProgressEx());
		frame.pack();
		frame.setVisible(true);
	}

	private JButton btnStart;
	private JProgressBar bar1, bar2;
	public ProgressEx() {
		
		bar1 = new JProgressBar(0, 1000);
		bar2 = new JProgressBar(0, 1000);
		
		bar1.setValue(0);
		bar1.setStringPainted(true);
		bar2.setValue(0);
		bar2.setStringPainted(true);
		
		btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnStart.setEnabled(false);
				Thread bar1Thread = new Thread(new ProgressBarThreadTarget(bar1));
				Thread bar2Thread = new Thread(new ProgressBarThreadTarget(bar2));
				
				bar1Thread.start();
				bar2Thread.start();
			}
		});
		
		add(btnStart);
 		add(bar1);
		add(bar2);
		
	}
	
	
	class ProgressBarThreadTarget implements Runnable{
		private JProgressBar bar;
		
		public ProgressBarThreadTarget(JProgressBar bar) {
			this.bar = bar;
		}
		
		@Override
		public void run() {
			int current = 0;
			while (current < bar.getMaximum()) {
				current += Math.random() * 100;
				bar.setValue(current);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
