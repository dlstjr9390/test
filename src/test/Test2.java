package test;
import java.util.*;

public class Test2 {
	public static void main(String args[]) {
		int Max = (int)Math.pow(10,1000);
		
		Scanner Sc = new Scanner(System.in);
		int money,num;
		money = Sc.nextInt();
		num = Sc.nextInt();

		
		if(1<=num && num<=money && money<=Max) {
			System.out.println(money/num);
			System.out.println(money%num);
			
		} else {
			System.out.println("잘못된 입력");
			
		}
		
	}
}
