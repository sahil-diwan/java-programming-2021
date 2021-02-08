import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
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
public class Deserialization {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fis = new FileInputStream("D:\\abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			System.out.println(obj);
			
			System.out.println("Object Deserialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
