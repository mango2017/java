package cn.itcast_11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo7 {
	/**
	 * 需求：存储自定义对象并遍历Student（name,age）
	 * 分析：
	 * 创建学生类
	 * 创建集合对象
	 * 创建学生对象
	 * 把学生对象添加到集合对象中
	 * 遍历集合
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//创建集合对象
		Collection collection = new ArrayList();
		
		Student s1 = new Student("wzw", 25);
		Student s2 = new Student("hj",40);
		Student s3 = new Student();
		s3.setName("aaa");
		s3.setAge(58);
		
		collection.add(s1);
		collection.add(s2);
		collection.add(s3);
		Iterator iterator = collection.iterator();
		
		while(iterator.hasNext()) {
			Student aStudent = (Student)iterator.next();
			System.out.println(aStudent.getAge()+"------"+aStudent.getName());
		}

		

	}
}
