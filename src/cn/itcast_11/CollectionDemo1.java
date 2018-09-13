package cn.itcast_11;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();
//		System.out.println(c);
		//System.out.println("add:"+c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		//void clear():移除所有元素
//		c.clear();
		
		//boolean remove(Object o):移除一个元素
		System.out.println("remove:"+c.remove("hello"));
		System.out.println("remove:"+c.remove("hello1"));
		
		//boolean contains(Object o):判断集合中是否包含指定的元素
		System.out.println("contains:"+c.contains("java"));
		System.out.println("contains:"+c.contains("java1"));
		
		//boolean isEmpty():判断集合是否为空
		System.out.println("isEmpty:"+c.isEmpty());
		
		//int size():元素个数
		System.out.println("size:"+c.size());
		System.out.println(c);
		
	}
}
