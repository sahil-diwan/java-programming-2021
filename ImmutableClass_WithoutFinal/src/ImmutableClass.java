
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
