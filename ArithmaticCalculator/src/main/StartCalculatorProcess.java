package main;

import java.awt.EventQueue;
import calculator.CalculateLogic;
import viewer.Frame;

public class StartCalculatorProcess {

	public static void main(String[] args) {
		CalculateLogic myLogic = new CalculateLogic();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				Frame frame = new Frame(myLogic);
				frame.setVisible(true);
			}
		};
		
		EventQueue.invokeLater(runnable);
	}

}
