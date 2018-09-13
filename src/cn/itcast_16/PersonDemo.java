package cn.itcast_16;
class Person{
	private String name;
	private int age;
	private static String area;  //静态属性，共享一块区域
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, String area) {
		super();
		this.name = name;
		this.age = age;
		this.area = area;
	}
	public void show() {
		System.out.println("姓名："+name+",年龄："+age+",国家："+area);
	}
}
public class PersonDemo {
	public static void main(String[] args) {
		Person person1 = new Person("吴谨言",28,"美国");
		person1.show();
//		Person person2 = new Person("何炅",30,"中国");
//		person2.show();
		
		Person person3 = new Person("王子文",30);
		person3.show();
		System.out.println(person3.getArea());
		

	}

}
