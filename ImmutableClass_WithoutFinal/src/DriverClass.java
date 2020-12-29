
public class DriverClass {

	public static void main(String[] args) {
		Engine e = new Engine(50);
		ImmutableClass cls = ImmutableClass.getInstance(1, "Sahil", e);
		System.out.println(cls.getId());
		System.out.println(cls.getName());
		System.out.println(cls.getEngine().speed);
		e.speed = 90;
		System.out.println(cls.getEngine().speed);
	}
}
