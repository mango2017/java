package cn.itcast_02;

public class StringDemo2 {
	
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println("s1:"+s1);
		System.out.println("s1:"+s1.length());//输出对象，其实就是输出toString方法
		System.out.println("------------------");
		
		byte[] bys = {97,98,99,100};
		String s2  = new String(bys);
		System.out.println(s2);
		System.out.println(s2.length());
		System.out.println("------------------");
		
		String s3 = new String(bys, 1, 3);
		System.out.println(s3);
		System.out.println(s3.length());
		System.out.println("------------------");
		
		char[] chs = {'a','b','c','d','e'};
		String s4 = new String(chs);
		System.out.println(s4);
		System.out.println(s4.length());
		System.out.println("------------------");
		
		String s5 = new String(chs, 1, 2);
		System.out.println(s5);
		System.out.println(s5.length());
		System.out.println("------------------");
		
		String s6 = new String("abcfffff");
		System.out.println(s6);
		System.out.println(s6.length());
		System.out.println("------------------");
		
		String s7 = "aaaa";
		System.out.println(s7);
		System.out.println(s7.length());
		
	}

}
