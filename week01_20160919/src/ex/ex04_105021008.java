package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 105021008 陳畯程
 */

import java.util.Scanner;

public class ex04_105021008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a = scn.nextInt();
		System.out.print(Math.sqrt(a));
	}

}
