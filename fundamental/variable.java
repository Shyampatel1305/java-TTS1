package fundamental;

import java.util.Scanner;

public class variable {
	public static void main(String[] args) {
		int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("a:");
		a=sc.nextInt();
		System.out.print("b:");
		b=sc.nextInt();
		sum=a+b;
		System.out.println("sum :"+sum);
		}
}
