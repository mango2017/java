package cn.itcast_07;

import java.util.Scanner;

import javax.print.attribute.standard.Chromaticity;

public class StringTest3 {
	/**
	 * 
	 * 字符串反转
	 * 举例：键盘录入：“abc”
	 * 输出结果："cba"
	 * @param args
	 */
	public static void main(String[] args) {
		//键盘录入一个字符串
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String line = sc.nextLine();
		//定义一个新字符串
		
		
		//改进为功能实现
		String s = myReverse(line);
		System.out.println("实现功能后的结果："+s);
		
	}
	
	
	public static String myReverse(String s) {
		String result = "";
		//把字符串转成字符数组
		char[] chs = s.toCharArray();
		for(int i=chs.length-1;i>=0;i--) {
			result +=chs[i];
		}
		//输出新串
		//System.out.println("反转后的结果是"+result);
		return result;
		
	}
}
