import java.util.ArrayList;

public class MailTransmitter implements Transmitter {

	private final static String TYPE = "MAIL";
	private ArrayList<Message> buffer;
	private int dim;
	public MailTransmitter(int dim) {
		this.buffer=new ArrayList<Message>(dim);
		this.dim = dim;
	}
	@Override
	public String getType() {
		return TYPE;
	}
	@Override
	public void store(Message message) {
		message.setString(message.getSender().getNume()+" said to "+message.getReceiver().getNume()
				+"("+ message.getSender().getTransmitter().getType()+") : \""+ message.getString()+ "\"");
		buffer.add(message);
		if(buffer.size()==dim) {
			for(Message m : buffer) {
				this.retrieve(m.getReceiver(), m);
			}
		buffer.clear();
		}
	}

	@Override
	public Message retrieve(Person p, Message message) {
		System.out.println(message.getString());
		return message;
	}
	
	
	
	
}
