package com.practice;

public abstract class Animal {
//void method
//non static + void method
	void getSalary() {
		
	}
	
//non void method/return method/java function/java program
//non static	
	int getMoney(){
		
		//code will be here 
		return 10;
	}
	//=====================
	//static 
	static void getSalary1() {//static +void
		
	}
	static int getMoney1() {
		
		return 10;
	}
	//=================
	//non static+ void method +abstract (abstract keyword + no body)
	abstract void getSalary2();
		public static void main(String[] args) {
			
		}
}


