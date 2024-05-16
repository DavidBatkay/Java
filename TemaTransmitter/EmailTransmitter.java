
public class EmailTransmitter implements Transmitter {

	private final static String TYPE = "EMAIL";
	
	@Override
	public String getType() {
		return TYPE;
	}

	@Override
	public void store(Message message) {
		message.setString(message.getSender().getNume()+" said to "+message.getReceiver().getNume()
				+"("+ message.getSender().getTransmitter().getType()+") : \""+ message.getString()+ "\"");
		this.retrieve(message.getReceiver(), message);
	}

	@Override
	public Message retrieve(Person p, Message message) {
		System.out.println(message.getString());
		return message;
	}
}
