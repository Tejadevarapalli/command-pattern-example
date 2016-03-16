package com.java9s.designpattern.command;

/**
 * A command controller  which should be implemented by all controllers
 * @author java9s.com
 *
 */
public interface CommandController{
	public void execute(String command);
	public boolean canHandle(String command);
}
