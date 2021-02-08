import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	String name = "Sahil Diwan";
	long phone = 99999;
}
class Student extends Person implements Serializable{
	int sid;
	static int count = 3;
	Student(int sid,String name,long phone){
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
			FileOutputStream fos = new FileOutputStream("D://abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Student st = new Student(101, "Sahil", 909);
			Student.count=9;
			System.out.println(st);
			oos.writeObject(st);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
