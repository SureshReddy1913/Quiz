package com.training.quizmania;


public class QuizMain {

	public static void main(String[] args) {
		QuestionThread qt= new QuestionThread();
		qt.start();
	}
}
