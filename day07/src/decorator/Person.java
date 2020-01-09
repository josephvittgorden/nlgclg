package decorator;

public class Person implements Say{
	
	private int voice = 30;

	@Override
	public void say() {
		System.out.println("Person say with:"+getVoice());
	}

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}
	

}
