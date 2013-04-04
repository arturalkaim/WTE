package wte.service;

import pt.ist.fenixframework.FenixFramework;
import pt.ist.phonebook.domain.Contact;
import pt.ist.phonebook.domain.Person;
import pt.ist.phonebook.domain.PhoneBook;
import wte.domain.WereToEat;
import wte.exception.NameAlreadyExistsException;
import wte.exception.PersonDoesNotExistException;
import wte.service.dto.ContactDetailedDto;
import wte.service.dto.Location;
import wte.service.dto.PersonDto;
import wte.service.dto.RestaurantDto;

public class CreateRestaurantService extends PhoneBookService {

	
	private RestaurantDto restaurantDto;
	private Location contactDto;

	public CreateRestaurantService(RestaurantDto restaurantDto, Location localdto) {
		this.contactDto = localdto;
		this.restaurantDto = restaurantDto;
	}
	
	public final void dispatch() throws NameAlreadyExistsException, PersonDoesNotExistException {
		WereToEat wte = FenixFramework.getRoot();
		
		if (person == null)
			throw new PersonDoesNotExistException(personDto.getName());
		person.addContact(new Contact(this.contactDto.getName(),
									  this.contactDto.getPhoneNumber()));
	}
}
