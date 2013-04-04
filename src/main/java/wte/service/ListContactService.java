package wte.service;


import java.util.List;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.phonebook.domain.Contact;
import pt.ist.phonebook.domain.Person;
import pt.ist.phonebook.domain.PhoneBook;
import wte.exception.NameAlreadyExistsException;
import wte.service.dto.ContactDetailedDto;
import wte.service.dto.PersonDto;

public class ListContactService extends PhoneBookService {

		private PersonDto dto;
		private List<ContactDetailedDto> result;
		
		public ListContactService(PersonDto personDto) {
			this.dto = personDto;
		}

		public final void dispatch() throws NameAlreadyExistsException {
			PhoneBook phoneBook = FenixFramework.getRoot();
			Person p = phoneBook.getPersonByName(dto.getName());
			for(Contact c: p.getContactSet())
				result.add(new ContactDetailedDto(c.getName(), c.getPhoneNumber()));
		}

		/**
		 * @return the result
		 */
		public List<ContactDetailedDto> getResult() {
			return result;
		}
		
		
	}
