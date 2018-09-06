package cn.itcast_04;
/**
 * 
 * 遍历字符串
 * @author Administrator
 *
 */
public class StringTest1 {

	public static void main(String[] args) {
		//定义字符串
		String s="helloworld";
		for(int x=0;x<s.length();x++) {
			char ch=s.charAt(x);
			System.out.println(ch);
		}
	}

}
