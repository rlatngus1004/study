
public abstract class Animal {
	protected String kind;
	
	public Animal(String kind) {
		this.kind = kind;
	}
	public void breathe () {
		System.out.println("숨쉬기");
	}
	}
