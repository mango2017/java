package cn.itcast_02;

public class StringDemo3 {
	/**
	 * 字符串的特点
	 * @param args
	 * String s=new String("hello");和String s="hello"的区别
	 * ==:比较引用类型的地址值是否相同
	 * equals：比较引用类型默认也是比较地址值是否相同，而string类重写了equals()方法，比较的是内容是否相同
	 * 前者会创建2个对象，后者创建(0/1)个对象
	 */
	public static void main(String[] args) {
		String s1=new String("hello");
		String s2 = "hello";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		
	}

}
