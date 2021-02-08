
public class Test {
	
	
	static int hcf(int a,int b){
		if(a==0)
			return b;
		return hcf(b%a, a);
	}
	static int lcm(int a,int b){
		System.out.println("HCF of two number is "+hcf(a, b));
		return (a/hcf(a, b))*b;
	}
	public static void main(String[] args) {
		System.out.println("LCM of 2 numbers is"+Test.lcm(24, 48));
	}
}
