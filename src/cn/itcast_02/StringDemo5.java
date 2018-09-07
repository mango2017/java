package cn.itcast_02;

public class StringDemo5 {
	/**
	 * 看程序写结果
	 * @param args
	 * 字符串如果是变量相加，先开空间，在拼接
	 * 字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，
	 * 否则，就创建
	 */
	
	public static void main(String[] args) {
		String s1 = "hello";//方法区
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1+s2);//false
		System.out.println(s3.equals(s1+s2));//true
		System.out.println(s3 == "hello"+"world");//true
		System.out.println(s3.equals("hello"+"world"));//true
		
		
	}

}
