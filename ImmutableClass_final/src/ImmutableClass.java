// Steps
// 1. Declare the class as final so that it cannot be inherited.
// 2. Data members of the class as private and final so that they cannot be accessed outside and also declared as constants
// 3. A public parameterized constructor to create the object
// 4. Getter Methods to access the value of the data members.
// 5. No Setter methods
// 6. If one of the data members is a mutable object then return the deep copy of the object instead of returning the existing object reference as it can change the state.


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
