package cn.itcast_10;

import java.util.Scanner;

public class MathDemo2 {
	/**
	 * 
	 * 需求，请设计一个方法，可以实现获取任意范围内的随机数
	 * a.键盘录入两个数据
	 * b.想办法获取start和end之间的随机数
	 * c.输出这个随机数
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入开始数");
		int start = sc.nextInt();
		System.out.println("请输入结束数");
		int end = sc.nextInt();
		int num = getRandom(start, end);
		System.out.println(num);
		
	}
	
	public static int getRandom(int start,int end) {
		int number = (int)(Math.random()*(end-start+1))+start;
		return number;
	}

}
