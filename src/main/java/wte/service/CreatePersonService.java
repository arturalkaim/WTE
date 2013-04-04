package wte.service;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.phonebook.domain.Person;
import pt.ist.phonebook.domain.PhoneBook;
import wte.exception.NameAlreadyExistsException;
import wte.service.dto.PersonDto;

public class CreatePersonService extends PhoneBookService {

	private PersonDto dto;
	
	public CreatePersonService(PersonDto personDto) {
		this.dto = personDto;
	}

	public final void dispatch() throws NameAlreadyExistsException {
		PhoneBook phoneBook = FenixFramework.getRoot();
		phoneBook.addPerson(new Person(this.dto.getName()));
	}
}
