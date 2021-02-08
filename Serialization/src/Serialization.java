import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int sid;
	String name;
	long phone;
	static int count =3;
	public Student(int sid, String name, long phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
}
public class Serialization {

	public static void main(String[] args) throws Exception {
		try {
			FileOutputStream fos = new FileOutputStream("D:\\info.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student st = new Student(101, "Sahil Diwan", 5576);
			Student.count=9;
			System.out.println(st);
			oos.writeObject(st);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
