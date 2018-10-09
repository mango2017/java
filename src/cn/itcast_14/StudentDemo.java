package cn.itcast_14;
//这是学生类
class Students {
	//定义变量
	
	//姓名
	String name;  //默认值null
	//年龄
	int age;  //默认值0
	//地址
	String address;  //默认值null
	
	//定义方法
	//学习的方法
	public void study() {
		System.out.println("学生爱学习");
	}
	
	//吃饭的方法
	public void eat() {
		System.out.println("学习饿了，要吃饭");
	}
	
	//睡觉的方法
	public void sleep() {
		System.out.println("学习累了，要睡觉");
	}
}

//这是学生测试类
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students students = new Students();  //对象在堆内存中，有默认值
		//输出成员变量值
//		System.out.println(students.name);
//		System.out.println(students.age);
//		System.out.println(students.address);
		
		//改进写法
		students.name="吴谨言";
		students.age=28;
		students.address="北京";
		System.out.println(students.name+"----"+students.age+"----"+students.address);
		
		students.eat();
		students.study();
		students.sleep();
	}

}
