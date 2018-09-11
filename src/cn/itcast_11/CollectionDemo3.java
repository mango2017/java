package cn.itcast_11;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo3 {
	
	public static void main(String[] args) {
		//创建集合对象
		Collection collection = new ArrayList();
		//添加元素
		collection.add("hello");
		collection.add("world");
		collection.add("java");
		
		//遍历
		//Object[] toArray():把集合转换成数组，可以实现集合的遍历
		Object[] obj = collection.toArray();
		for(int x=0;x<obj.length;x++) {
//			System.out.println(obj[x]);
			//我知道元素是字符串，我在获取到元素的同时，还想知道元素的长度
//			System.out.println(obj[x]+"---"+obj[x].length());
			//上面的实现不了，是因为Object中没有length()方法
			String s=(String)obj[x];
			System.out.println(obj[x]+"---"+s.length());
		}

		

	}
}
