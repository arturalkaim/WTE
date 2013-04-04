package wte.service;

import jvstm.Atomic;
import wte.exception.PhoneBookException;

public abstract class PhoneBookService {

	@Atomic
	public void execute() throws PhoneBookException { 
		dispatch();
	}
	
	public abstract void dispatch() throws PhoneBookException;
}
