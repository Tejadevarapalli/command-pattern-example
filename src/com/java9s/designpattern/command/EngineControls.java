package com.java9s.designpattern.command;

/**
 * An engine controller which takes care of all engine relevant commands.
 * @author java9s.com
 *
 */
public class EngineControls implements CommandController{
	private Engine engine;
	
	public static final String SPEED_UP ="SPEED_UP";
	public static final String SLOW_DOWN ="SLOW_DOWN";
	
	public EngineControls(){
		this.engine = new Engine();
	}
	@Override
	public void execute(String command) {
		switch (command) {
		case SPEED_UP:
			engine.speedUP();
			break;
		case SLOW_DOWN:
			engine.slowDOWN();
			break;
		default:
				System.out.println("Sorry I did not understand the command");
			break;
		}
	}
	@Override
	public boolean canHandle(String command) {
		if(SPEED_UP.equals(command)||
				SLOW_DOWN.equals(command)){
			return true;
		}
		return false;
	}
	
}
