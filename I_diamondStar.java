package com.one.day;

import java.util.Scanner;

public class I_diamondStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하면 다이아몬드가 나옵니다: ");
		int row = sc.nextInt();

		for(int r=0; r< row; r++) {
			
			for(int w = 0; w < row - r; w++) {
				System.out.print(" "); }
		
			for(int x= 0; x < (2*r+1) ; x++) {

				System.out.print("*"); 
			}
			System.out.println();
		}
			
			for(int r=0; r<= row ; r++) {
			for(int v= 0; v <=r; v++ ) {
				System.out.print(" ");
			}
			for(int z= 0; z < (2*row-1)-2*r ; z++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
