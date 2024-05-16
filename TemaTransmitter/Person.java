
public class Person {

	private String nume;
	private Transmitter transmitter;
	
	
	
	public Person(String nume) {
		this.nume = nume;
		this.transmitter = null;
	}

	public void setTransmitter(Transmitter transmitter) {
		this.transmitter=transmitter;
		
	}
	
	public void send(Person p, String message) {
		Message m = new Message(this, p, message);
		transmitter.store(m);
	}

	public String getNume() {
		return nume;
	}

	public Transmitter getTransmitter() {
		return transmitter;
	}
	
	
}
