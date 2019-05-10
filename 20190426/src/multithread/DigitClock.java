package multithread;

import java.applet.Applet;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

public class DigitClock extends Applet implements Runnable {
	Thread digitClockThread;
	Calendar Time;
	
	public static void main(String[] args) {
		Frame frame = new Frame("clock");
		Panel clock = new DigitClock();
		frame.add(clock);
		frame.setBounds(100, 100, 300, 120);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}
	
	public DigitClock() {	//app에서 실행하기 위한 부분
		init();
		
	}
	@Override	//applet의 init
	public void init() {	//applet에서 자동으로 실행할 수 있는 부분
		digitClockThread = new Thread(this);
		digitClockThread.start();
	}
	
	@Override
	public void paint(Graphics g) {
		Time = Calendar.getInstance();
		String strTime = String.format("%tT",Time);
		g.setFont(new Font("mishafi",Font.BOLD,100));
		g.drawString(strTime, 60, 70);
	}

	@Override
	public void run() {
		
		while (true) {
			Thread.yield();
			repaint();
		}
	}

}
