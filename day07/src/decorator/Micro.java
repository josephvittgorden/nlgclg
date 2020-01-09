package decorator;

public class Micro implements Say{
	
	private Person person;
	
	public Micro(Person person) {
		super();
		this.person = person;
	}

	@Override
	public void say() {
		System.out.println("利用Micro放大声音:"+person.getVoice()*100);
	}

}
