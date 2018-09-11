package cn.itcast_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo6 {
	
	public static void main(String[] args) {
		
		//创建集合对象
		Collection collection = new ArrayList();
		//创建字符串对象
		collection.add("王子文");
		
		collection.add("吴谨言");
		
		//遍历集合
		//通过集合对象获取迭代器对象
		Iterator it = collection.iterator();
		//通过迭代器对象的hasNext()方法判断有没有元素
		while(it.hasNext()) {
			//通过迭代器对象next()方法获取元素
			String a = (String)it.next();
			System.out.println(a);
		}

		

	}
}
