package com.learn.java;

import java.util.Scanner;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class ExerciseOneJava {

	public static void main(String[] args) {
		//take input from the user
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your age ? ");
		age=sc.nextInt();
		System.out.println(age);
		//check the age is greater than 18
		if(age>18)
			System.out.println("you are eligible to vote");
		else 
			System.out.println("you are not eligible to vote");
			}
	
	public void determineEven(int num) {
		if(num%2==0) {
		System.out.println("Even Number");
		}
	else {
			System.out.println("Odd Number");
		}
		
		public void Excer();{
			
		ExerciseOneJava obj = new ExerciseOneJava();
		obj.determineEven(13);
		
		}
		
	}
}