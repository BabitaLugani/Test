package com.myApp.com.myFirstApp;

import java.util.Scanner;

public class MyCalApp {

	public static void main(String[] args) {
		System.out.println("hello world::");
		
		try (Scanner myObj = new Scanner(System.in)) {
			
			while (true) {
				System.out.println("Enter two number for sum:");
				int number1 = myObj.nextInt();
				int number2 = myObj.nextInt();
				
				Calculator c = new Calculator();
				int result = c.sum(number1, number2);
				System.out.println("result is :" + result);
				
			while (true) {
		    	System.out.println("Enter two number for sub:");
				int num1 = myObj.nextInt();
				int num2 = myObj.nextInt();
					
				Calculator c1 = new Calculator();
				int result1 = c1.sub(num1, num2);
				System.out.println("result is :" + result1);
					
			while (true) {
				System.out.println("Enter two number for multiplication:");
				int numb1 = myObj.nextInt();
				int numb2 = myObj.nextInt();
						
				Calculator c2 = new Calculator();
				int result2 = c2.mul(numb1, numb2);
				System.out.println("result is :" + result2);
						
			while (true) {
				System.out.println("Enter two number for division");
				int numbe1 = myObj.nextInt();
				int numbe2 = myObj.nextInt();
							
				Calculator c3 = new Calculator();
				float result3 = c3.div(numbe1, numbe2);
				System.out.println("result is :" + result3);
							
			while (true) {
				System.out.println("Enter two number for modulus");
				int numberr1 = myObj.nextInt();
				int numberr2 = myObj.nextInt();
								
		    	Calculator c4 = new Calculator();
				float result4 = c4.mod(numberr1, numberr2);
				System.out.println("result is :" + result4);
			    myObj.close();
				        }
	    	        }
			    }
			}     
		}   
	 }   
  } 
}
