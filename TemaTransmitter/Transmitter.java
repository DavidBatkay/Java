
public interface Transmitter {

	public String getType();
	public void store(Message message);
	public Message retrieve(Person receiver, Message message);
}
