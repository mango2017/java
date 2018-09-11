package cn.itcast_11;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo5 {
	/**
	 * 用集合存储5个学生对象，并把学生对象进行遍历
	 * @param args
	 * 分析：
	 * 创建学生类
	 * 创建集合对象
	 * 创建学生对象
	 * 把学生添加到集合
	 * 把集合转成数组
	 * 遍历数组
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
		for(int x=0;x<objects.length;x++) {
//			System.out.println(objects[x]);
			Student student = (Student)objects[x]; //向下转型
			System.out.println(student.getName()+"----"+student.getAge());
		}

		

	}
}
