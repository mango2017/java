package cn.itcast_02;

public class StringDemo6 {
	
	public static void main(String[] args) {
		/**
		 * 注意：字符串内容为空和字符串对象为空
		 * String s="";//内容为空
		 * String s=null;//对象为空
		 */
		//创建字符串对象
		String s1="helloworld";
		String s2="helloworld";
		String s3="helloWorld";
		
		//boolean equals(Object obj):比较字符串的内容相同，区分大小写
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println("---------------");
		
		//boolean equalsIgnoreCase(String str):比较字符串的内容是否相同，忽略大小写
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println("---------------");
		
		//boolean contains(String str):判断大字符串是否包含小字符串
		System.out.println(s1.contains("hello"));//true
		System.out.println(s1.contains("hw"));//false
		System.out.println("---------------");
		
		//boolean startWith(String str):判断字符串是否以某个指定的字符串开头
		System.out.println(s1.startsWith("h"));//true
		System.out.println(s1.startsWith("hello"));//true
		System.out.println(s1.startsWith("world"));//false
		System.out.println("---------------");
		
		
		//boolean isEmpty():判断字符串是否为空
		System.out.println(s1.isEmpty());//false
		
		String s4="";
		String s5=null;
		System.out.println(s4.isEmpty());//true
		//NullPointerException
		//s5对象都不存在，所以不能调用方法，空指针异常
		System.out.println(s5.isEmpty());//报错
		
		
		
		
		
		
		
		
	}

}
