
public class Test {

	static int hcf(int a,int b){
		if(a==0)
			return b;
		return hcf(b%a, a);
	}
	public static void main(String[] args) {
		 int num1=1, den1=5, num2=3, den2=15;  
		 
		 int commonDemo = hcf(den1, den2);
		 commonDemo =(den1*den2)/commonDemo;
		
		 int resNum = ((commonDemo/den1)*num1)+((commonDemo/den2)*num2);
		 
		 int common_factor = hcf(resNum,commonDemo);
		 
		 int num3 = resNum/common_factor;
		 int den3 = commonDemo/common_factor;
		 
		 System.out.println(num3+"/"+den3);
	}
}
