import com.phone.Andriod;
import com.phone.OS;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		osf.getInstance("Open").spec();
	}
}
