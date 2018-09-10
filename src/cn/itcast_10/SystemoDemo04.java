package cn.itcast_10;

public class SystemoDemo04 {
	public static void main(String[] args) {
		Person person  = new Person("wzw",60);
		System.out.println(person);
		person = null;
		System.gc();//垃圾回收
	}
}
