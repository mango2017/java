package cn.itcast_15;

import java.util.Scanner;

class Maths{
//	public int add(int a,int b) {
//		return a+b;
//	}
//	
//	public int sub(int a,int b) {
//		return a-b;
//	}
//	public int mul(int a,int b) {
//		return a *b;
//	}
	public double div(double a,double b) {
		return a / b;
	}
}
public class MyMath {

	public static void main(String[] args) {
		Maths maths = new Maths();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一个数");
		double firstNum = scanner.nextDouble();
		System.out.println("请输入第二个数");
		double secondNum = scanner.nextDouble();
//		System.out.println(maths.add(firstNum,secondNum));
//		System.out.println(maths.sub(firstNum,secondNum));
//		System.out.println(maths.mul(firstNum,secondNum));
		System.out.println(maths.div(firstNum,secondNum));
		
		
		

	}

}
