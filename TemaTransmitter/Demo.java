
public class Demo {

	public static void main(String[] args) {

		Person p1 = new Person("Paul");
		Person p2 = new Person("Andreea");
		Person p3 = new Person("Ioana");
		Person p4 = new Person("Gabriel");
		
		Transmitter email = new EmailTransmitter();
		
		Transmitter mail= new MailTransmitter(2);
		
		p1.setTransmitter(email);
		p1.send(p2, "Scrie-i Ioanei sa-mi dea adresa ei de e-mail!");
		p2.setTransmitter(mail);
		p2.send(p3, "Paul zice sa-i trimit adresa de e-mail");
		p4.setTransmitter(mail);
		p4.send(p1, "Ce mai faci?");
		p3.setTransmitter(email);
		p3.send(p1, "Adresa de e-mail este: ioana@yahoo.com");
		
	}

}
