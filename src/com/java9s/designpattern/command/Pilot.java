package com.java9s.designpattern.command;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * A client class which uses the command controllers.
 * @author java9s.com
 *
 */
public class Pilot {
	private Cockpit cockpit;
	private String[ ] commands = {
			Cockpit.TAKE_OFF,
			Cockpit.LAND,
			Cockpit.REACH_ALTITUDE,
			WingControls.MOVE_UP,
			WingControls.MOVE_DOWN,
			WingControls.KEEP_FLAT,
			EngineControls.SLOW_DOWN,
			EngineControls.SPEED_UP,
			Cockpit.EXIT
	};
	
	public Pilot(Cockpit cockpit){
		this.cockpit = cockpit;
	}
	
	public void fly(){
		do{
		String command = (String)JOptionPane.showInputDialog(null, "Give command", "Command Controls", JOptionPane.INFORMATION_MESSAGE, null, this.commands, this.commands[0]);
		cockpit.execute(command);
		}while(true);
	}

}
