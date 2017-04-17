package atc.mediatorinterface;

import atc.concretemediator.Flight;
import atc.concretemediator.Runway;

/**
 * This is the mediator interface
 * 
 *
 */

public interface IATCMediator {

	public void registerRunway(Runway runway);

	public void registerFlight(Flight flight);

	public boolean isLandingOk();

	public void setLandingStatus(boolean status);
}