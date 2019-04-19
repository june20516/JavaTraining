package main;

import java.awt.EventQueue;

import quizsetter.QuizLogic;
import viewer.QuizViewer;

public class StartQuiz {

	public static void main(String[] args) {
		QuizLogic quizLogic = new QuizLogic();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizViewer frame = new QuizViewer(quizLogic);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
