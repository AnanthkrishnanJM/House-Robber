package Houserobber;

import java.util.Scanner;

public class houserobber {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in) ;
			int a=0;
			int b=0;
			int n=A.nextInt();
			int[] ar=new int[n];
			for(int i=0;i<n;i++) {
				ar[i]=A.nextInt();
				}
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				a+=ar[i];
			}
		}
		System.out.println(a);
		}
}
		
