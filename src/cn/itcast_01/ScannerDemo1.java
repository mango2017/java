package cn.itcast_01;

import java.util.Scanner;

public class ScannerDemo1 {
	/**
	 * 
	 * 基本格式
	 * public boolean hasNextXxx():判断是否是某种类型的元素
	 * public Xxx nextXxx():获取该元素
	 * @param args
	 * 注意：
	 * InputMismatchException:输入的和你想要的不匹配
	 */

	public static void main(String[] args) {
		// 创建对象
		Scanner sc=new Scanner(System.in);
		//判断是否是int类型
		if(sc.hasNextInt()) {
			//获取数据
			int i = sc.nextInt();
			System.out.println(i);
		}else {
			System.out.println("您输入的数据有误");
		}
		
	}

}
