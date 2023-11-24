package reservaPassagens;
import java.util.Date;

public class Voo {
	private String flightNumber;
	private String origin;
	private String destination;
	private Date flightDateAndTime;
	private int totalSeats;
	private int availableSeats;
	
	public Voo(String flightNumber, String origin, String destination, Date flightDateAndTime, int totalSeats) {
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.flightDateAndTime = flightDateAndTime;
		this.totalSeats= totalSeats;
		
		
	}
	
	public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String newFlightNumber) {
        this.flightNumber = newFlightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String newOrigin) {
        this.origin = newOrigin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String newDestination) {
       this.destination = newDestination;
    }

    public Date getFlightDateAndTime() {
        return flightDateAndTime;
    }

    public void setFlightDateAndTime(Date newFlightDateAndTime) {
    	this.flightDateAndTime = newFlightDateAndTime;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int newTotalSeats) {
    	this.totalSeats = newTotalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int newAvailableSeats) {
    	this.availableSeats = newAvailableSeats;
    }
	
	
	
	
	
	
	
	

}
