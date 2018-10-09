package cn.itcast_05;

public class StringDemo2 {
	/**
	 * 需求，把一个字符串的首字母转成大写，其余为小写
	 * @param args
	 * 分析：
	 * a.先获取第一个字符
	 * b.获取除了第一个字符以外的字符
	 * c.把a转成大写
	 * d.把b转为小写
	 * e.c拼接d
	 */
	public static void main(String[] args) {
		//定义一个字符串
		String s="helloABCD";
		//先获取第一个字符
		String s1=s.substring(0, 1);
		//获取除了第一个字符以外的字符
		String s2 = s.substring(1);
		//把s1转成大写
		String s3 = s1.toUpperCase();
		//把s2转成小写
		String s4 = s2.toLowerCase();
		//拼接s1和s2
		String s5 = s3.concat(s4);
		System.out.println(s5);
		
		//优化后的代码
		String result = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
		System.out.println(result);
		
	}
}
