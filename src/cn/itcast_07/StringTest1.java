package cn.itcast_07;

import java.lang.reflect.Array;

public class StringTest1 {
	/**
	 * 需求：把数组中的数据按照指定的格式拼接成一个字符串
	 * @param args
	 * 分析：
	 * a.定义一个字符串对象，只不过内容为空
	 * b.先把字符串拼接一个“【”
	 * c.遍历int数组，得到每一个元素
	 * d.先判断该元素是否为最后一个
	 * 是:就直接拼接元素和"]"
	 * 不是：就拼接元素和逗号以及空格
	 * e.输出拼接后的字符串
	 */

	public static void main(String[] args) {
		String s="";
		s+="[";
		int[] arr = {1,2,3};
		for(int x=0;x<arr.length;x++) {
			if(x==arr.length-1) {
				s+=arr[x];
				s+="]";
			}else {
				s+=arr[x];
				s+=", ";
			}
		}
		System.out.println(s);

	}

}
