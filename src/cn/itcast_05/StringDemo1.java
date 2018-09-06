package cn.itcast_05;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String s="JavaSE";
		//byte[] getBytes():把字符串转换为字节数组
		byte[] bys = s.getBytes();
		for(int i=0;i<bys.length;i++) {
			System.out.println(bys[i]);
		}
		System.out.println("--------------------");
		
		
		// char[] toCharArray():把字符串转换为字符数字
		char[] chs = s.toCharArray();
		for(int i=0;i<bys.length;i++) {
			System.out.println(chs[i]);
		}
		
		System.out.println("--------------------");
		
		// String valueOf(char[] chs):把字符数组转换成字符串
		String ss = String.valueOf(chs);
		System.out.println(ss);	
		System.out.println("--------------------");
		
		//String valueOf(int i) ：把int类型的数据转成字符串
		int i=100;
		String sss=String.valueOf(i);
		System.out.println(sss);
		System.out.println("--------------------");
		
		//String toLowerCase():把字符串转成小写
		System.out.println("toLowerCase:"+s.toLowerCase());
		System.out.println(s);//s字符串本身并没有变化
		System.out.println("--------------------");
		
		
		//String upUpperCase():把字符串转成大写
		System.out.println("toLowerCase:"+s.toUpperCase());
		System.out.println(s);//s字符串本身并没有变化
		System.out.println("--------------------");
		
		//String concat(String str):字符串拼接
		String s1="hello";
		String s2="world";
		String s3=s1.concat(s2);
		System.out.println(s3);

	}

}
