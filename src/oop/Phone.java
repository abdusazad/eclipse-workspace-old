package oop;

public class Phone {
String model = "iphone7";

	//below is my methods
	public void call() {
	System.out.println("calling...unknown");
	}
	
	public void call(int number) {
		System.out.println("Calling ...."+number);
		
	}
 public void text() {
	 int number = 1234567890;
	System.out.println("Texting ...Unknwon");	
	}
	
 public void showmodel() {
	 System.out.println("Model for the phone is: "+model);
	 
	 
 }
	}



