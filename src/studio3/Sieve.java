package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = in.nextInt();
		boolean [] welovecs = new boolean[n];
		for (int i = 2; i < n; i++) {
			for(int j = i+i; j < n; j+=i) {
				welovecs[j]=true; 
			}
		}
		for (int i = 2; i < n; i++) {
			if (welovecs[i]==false) {
				System.out.println(i);
			}
		}
	}
}
