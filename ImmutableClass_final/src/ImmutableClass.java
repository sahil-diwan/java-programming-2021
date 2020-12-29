
class Engine{
	int speed;

	public Engine(int speed) {
		super();
		this.speed = speed;
	}
	
}

public final class ImmutableClass {

	private final int id;
	private final String name;
	private final Engine engine;
	
	public ImmutableClass(int id, String name, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		Engine cloneEngine = new Engine(engine.speed);
		this.engine = cloneEngine;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Engine getEngine() {
		return engine;
	}




	public static void main(String[] args) {
		Engine e = new Engine(50);
		ImmutableClass cls = new ImmutableClass(1, "Sahil",e);
		
		System.out.println(cls.getId());
		System.out.println(cls.getName());
		System.out.println(cls.getEngine().speed);
		
		e.speed = 70;
		
		System.out.println(cls.getEngine().speed);
	}
	
	
}
