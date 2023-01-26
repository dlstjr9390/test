package test;
import java.util.*;

public class Test1 {
	public static void main(String args[]) {
		
		Scanner Sc = new Scanner(System.in);
		int a, b;
		String Str;
		
		while(Sc.hasNext()) {	
			a = Sc.nextInt();
			b = Sc.nextInt();
			Str = Sc.next();
			if(Str.equals("sum")) {
			 System.out.println(a+b);
			} else if(Str.equals("sub")){
				System.out.println(a-b);
			} else if(Str.equals("div")) {
				System.out.println(a/b);
			} else if(Str.equals("mul")) {
				System.out.println(a*b);
			} else{
				System.out.println("잘못된 입력");
			}
			
		}
	}
}
