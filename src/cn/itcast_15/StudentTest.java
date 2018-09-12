package cn.itcast_15;
class Student{
	private String name;
	private int age;
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
	
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.setAge(27);
		student1.setName("waw");
		System.out.println(student1.getAge()+"--------------"+student1.getName());
		System.out.println("---------------------");
		Student student2 = new Student();
		student2.setAge(29);
		student2.setName("dddd");
		System.out.println(student2.getAge()+"--------------"+student2.getName());


	}

}
