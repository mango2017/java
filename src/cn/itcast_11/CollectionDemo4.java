package cn.itcast_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
	/**
	 * 用集合存储5个学生对象，并把学生对象进行遍历
	 * @param args
	 * 分析：
	 * 创建学生类
	 * 创建集合对象
	 * 创建学生对象
	 * 把学生添加到集合
	 * 把集合转成数组
	 * 遍历数组 可以用while 也可以用for for的效率高
	 * a.通过集合对象获取迭代器对象
	 * b.通过迭代器对象的hasNext()方法判断是否有元素
	 * c.通过迭代器对象的next方法获取元素并移动到下一个位置
	 * 不要多次使用it.next()方法，因为每次使用都是访问一个对象
	 * 迭代器：是遍历集合的一种方式
	 * 迭代器是依赖于集合而存在的
	 * 
	 */
	public static void main(String[] args) {
		
		//创建集合对象
		Collection collection = new ArrayList();
		
		//创建学生对象
		Student s1 = new Student("王子文",20);
		Student s2 = new Student("何炅",23);
		Student s3 = new Student("吴谨言",24);
		Student s4 = new Student("黄磊",30);
		
		//把学生添加到集合
		collection.add(s1);
		collection.add(s2);
		collection.add(s3);
		collection.add(s4);
		
		//把集合转成数组
		Object[] objects = collection.toArray();//向上转型
		
		//遍历数组
		Iterator it = collection.iterator();
		while(it.hasNext()) {
			Student s = (Student)it.next();
			System.out.println(s.getName()+"----"+s.getAge());
		}
		
		System.out.println("----------------");
		
		//for循环改写
//		for(Iterator it=collection.iterator();it.hasNext();) {
//			Student s = (Student)it.next();
//			System.out.println(s.getName()+"----"+s.getAge());
//		}

		

	}
}
