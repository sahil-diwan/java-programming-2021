import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
public class Deserialization {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fis = new FileInputStream("D:\\info.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			System.out.println(obj);
			System.out.println(Student.count);
			System.out.println("Object Deserialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
