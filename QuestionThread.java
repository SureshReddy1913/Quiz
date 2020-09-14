package com.training.quizmania;

import java.util.Scanner;

public class QuestionThread extends Thread {

	public void run() {
		String[] ques= {"q1","q2","q3","q4"};
		int  i=0;
		while (i<4) // there are questions left
		{
			System.out.println(ques[i]);	// get question
			CounterClass cc=new CounterClass();	//create countter thread 
			//cc.setDaemon(true);
			cc.start();
			Scanner scanner = new Scanner(System.in);
			int answer=scanner.nextInt();
			cc.interrupt();
			if(answer!=i) {
				System.out.println("sorry wrong answer");
				break;
			}
			i++;
		}
		
	}

}
