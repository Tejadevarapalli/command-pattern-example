package com.java9s.designpattern.command;

public class Wings {
	public void moveUP(){
		System.out.println("Flight Moving upwards");
	}
	
	public void moveDown(){
		System.out.println("Flight Moving downwards");
	}
	
	public void keepFlat(){
		System.out.println("Flying flat");
	}
	
	public void turnLeft(){
		System.out.println("Turn Left");
	}
	
	public void turnRight(){
		System.out.println("Turn Right");
	}
}
