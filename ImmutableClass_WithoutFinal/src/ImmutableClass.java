// Steps
// 1. Make all the data members as private so that they cannot be accessed outside the class.
// 2. Make the constructor as private.
// 3. Provide with a static factory method to provide with the object
// 4. Provide with the getter method
// 5. Do not provide with the setter methods.
// 6. If one of the data member is a mutable object then provide with the deep copy instead of the same object reference as it can change the state of the object. 


class Engine{
	int speed;

	public Engine(int speed) {
		super();
		this.speed = speed;
	}
	
}
public class ImmutableClass {

	private int id;
	private String name;
	private Engine engine;
	
	private ImmutableClass(int id, String name, Engine engine) {
		super();
		this.id = id;
		this.name = name;
		Engine cloneEngine = new Engine(engine.speed);
		this.engine = cloneEngine;
	}
	
	public static ImmutableClass getInstance(int id,String name,Engine e){
		return new ImmutableClass(id, name, e);
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
	
}
