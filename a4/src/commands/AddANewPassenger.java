package commands;

import entities.Passenger;
import containers.PassengerSetAccess;

/**
 * Command to add a passenger so that passenger can book a flight.
 */
public class AddANewPassenger extends CommandStatus{
	/**
	 * Read the information for a new passenger and then add the passenger 
	 * to the dictionary of all passengers.
	 * @param name name to passenger
	 * @param telNumber phone number to passenger
	 * @exception if passenger map contains the passenger, so it is added before
	 * @exception if add passenger to map failed
	 * @postcod add passenger info to map
	 */
	public void addPassenger(String name, String telNumber){
		if (PassengerSetAccess.dictionary().containsKey(name)){
			errorMessage = ("Person not added as there already "
								+ "is a person by the name " + name);
			successful = false;
		}
		else{
			Passenger p = new Passenger(name, telNumber);
			PassengerSetAccess.dictionary().put(name, p);  // put the original person back
			successful = true;
			}
	}	
}


