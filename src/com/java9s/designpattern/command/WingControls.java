package com.java9s.designpattern.command;

/**
 * A wing controller which takes care of all the wing controls
 * @author java9s.com
 *
 */
public class WingControls implements CommandController{
	private Wings wings;
	
	public static final String MOVE_UP = "MOVE_UP";
	public static final String MOVE_DOWN="MOVE_DOWN";
	public static final String KEEP_FLAT="KEEP_FLAT";
	public static final String TURN_LEFT ="TURN_LEFT";
	public static final String TURN_RIGHT="TURN_RIGHT";
	
	public WingControls() {
		this.wings = new Wings();
	}
	@Override
	public void execute(String command) {
		switch (command) {
		case MOVE_UP:
			wings.moveUP();
			break;
		case MOVE_DOWN:
			wings.moveDown();
			break;
		case KEEP_FLAT:
			wings.keepFlat();
			break;
		case TURN_RIGHT:
			wings.turnRight();
			break;
		case TURN_LEFT:
			wings.turnLeft();
			break;
		default:
			System.out.println("Sorry i did not understand the wing operation command");
			break;
		}
	}
	@Override
	public boolean canHandle(String command) {
		if(command.equals(KEEP_FLAT)||
				command.equals(MOVE_DOWN)||
				command.equals(MOVE_UP)||
				command.equals(TURN_LEFT)||
				command.equals(TURN_RIGHT)){
			return true;
		}
		
			
		return false;
	}
	
}
