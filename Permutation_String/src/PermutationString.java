import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PermutationString {
	static ArrayList<String> res = new ArrayList<String>();
	
	public static void getPermutation(String str){
		char[] ch = str.toCharArray();
		res = new ArrayList<String>();
		permute(ch, 0, str.length()-1);
		System.out.println(res.size());
		Collections.sort(res);
		for(String s:res)
			System.out.println(s+" ");
	}
	
	
	
	public static void permute(char ch[],int l,int r){
		if(l==r)
			res.add(String.valueOf(ch));
		else{
			char temp;
			for(int i=l;i<=r;i++){
				temp = ch[l];
				ch[l] = ch[i];
				ch[i] = temp;
				permute(ch, l+1, r);
				temp = ch[l];
				ch[l] = ch[i];
				ch[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of testcases");
		int testcases = sc.nextInt();
		while(testcases>0){
			String str = sc.next();
			getPermutation(str);
			System.out.println();
			testcases--;
		}
	}
}
