package cn.itcast_15;
/**
 * 需求：定义一个员工类，显示所有成员的信息方法，并测试
 * 
 * @author Administrator
 *
 */

class Employee{
	private String eid;
	private String name;
	private int age;
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
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
	
	public void show() {
		System.out.println("员工编号："+eid+",员工姓名："+name+",员工年龄："+age);
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setAge(27);
		employee.setEid("1000");
		employee.setName("吴谨言");
		employee.show();
		

	}

}
