package com.text1;

public class Xiancheng extends Thread{
	
		public void run() {
			for(int i=0;i<200;i++) {
				System.out.println(i+"   +++   ���߳�  +++");
			}
			
		}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xiancheng thread =new Xiancheng ();
thread.start();
	for(int i=0;i<200;i++) {
		System.out.println(i+"   +++   ���߳�  +++");
	}
		}

}
	
	
	
	
	
	
	
