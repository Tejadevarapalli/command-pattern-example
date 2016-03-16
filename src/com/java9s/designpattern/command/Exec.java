package com.java9s.designpattern.command;

import java.util.ArrayList;
import java.util.List;
/**
 * Execution class to test the command pattern.
 * @author java9s.com
 *
 */
public class Exec {
	public static void main(String[] args) {
		WingControls wingControls = new WingControls();
		EngineControls engineControls = new EngineControls();
		List<CommandController> commandControllers = new ArrayList<CommandController>();
		commandControllers.add(wingControls);
		commandControllers.add(engineControls);
		Cockpit cockpit = new Cockpit(commandControllers);
				
		Pilot pilot = new Pilot(cockpit);
		pilot.fly();
	}
}
