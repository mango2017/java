package cn.itcast_02;

public class StringDemo8 {

	public static void main(String[] args) {

		// 定义一个字符串对象
		String s = "helloworld";
		// int length():获取字符串的长度
		System.out.println(s.length());
		System.out.println("------------");

		// char charAt(int index):获取指定索引位置的字符
		System.out.println(s.charAt(7));
		System.out.println("------------");

		// int indexOf(int ch):返回指定字符在此字符串中第一次出现的索引
		System.out.println(s.indexOf("l"));
		System.out.println("---------------");

		// int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引
		System.out.println(s.indexOf("owo"));
		System.out.println("--------");

		// int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现的索引
		System.out.println(s.indexOf("l", 4));
		System.out.println("--------");

		// String substring(int start):从指定位置开始截取字符串，默认到末尾，包含start这个索引
		System.out.println(s.substring(5));
		System.out.println(s.substring(0));
		System.out.println("--------");

		// String substring(int start,int end):从指定位置开始到指定位置结束截取字符串，包含start索引，但是不包含end索引
		System.out.println(s.substring(3, 8));
		System.out.println("--------");

	}

}
