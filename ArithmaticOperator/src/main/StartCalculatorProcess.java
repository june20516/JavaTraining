package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import calculator.CalculateLogic;
import viewer.Frame;

public class StartCalculatorProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateLogic myLogic = new CalculateLogic();
		Frame frame = new Frame();
		frame.setVisible(true);

	}

}
