package test;
import java.util.*;

public class Test3 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		int a,b;
		int min = -1000;
		int max = 1000;
		
		a= Sc.nextInt();
		b= Sc.nextInt();
		
		if(min<=a && a==b && b<=max ) {
			System.out.println("==");
		} else if(min<=a && a>b && b<=max) {
			System.out.println(">");
		} else if(min<=a && a<b && b<=max) {
			System.out.println("<");
		} else {
			System.out.println("잘못된 입력");
		}
	}
}
