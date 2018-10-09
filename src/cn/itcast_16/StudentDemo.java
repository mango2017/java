package cn.itcast_16;
/**
 * 
 * static的特点（它可以修饰成员变量，还可以修饰成员方法）
 * a.随着类的加载而加载
 * b.优先于对象存在
 * c.被类的所有对象共享
 * d.可以通过类名调用，其实它本身也可以通过对象名调用，推荐使用类名调用
 * 静态修饰的内容一般我们称其为：与类相关的，类成员
 * static关键字注意事项：
 * a.在静态方法中是没有this关键字的
 * 静态是随着类的加载而加载，this是随着对象的创建而存在
 * 静态比对象先存在
 * b.静态方法只能访问静态的成员变量和静态的成员方法
 * 静态方法：
 * 	成员变量：只能访问静态变量
 * 	成员方法：只能访问静态成员方法
 * 非静态方法：
 * 	成员变量：可以是静态的成员变量，也可以是非静态的成员变量
 * 	成员方法：可以使静态的成员方法，也可以是非静态的成员方法
 * 简单记：
 * 	静态只能访问静态
 * 
 * 静态变量和成员变量的区别
 * 所属不同：
 * 静态变量属于类，所以也成为类变量
 * 成员变量属于对象，所以也成为实例变量（对象变量）
 * 内存中位置不同：
 * 静态变量存储于方法区的静态区
 * 成员变量存储于堆内存
 * 内存出现时间不同：
 * 静态变量随着类的加载而加载，随着类的消失而消失
 * 成员变量随着对象的创建而存在，随着对象的消失而消失
 * 调用不同：
 * 静态变量可以通过类名调用，也可以通过对象调用
 * 成员变量只能通过对象调用
 * 
 * main方法的格式讲解
 * public static void main(String[] args){...}
 * public ：公共的，访问权限最大的，由于main方法是被jvm调用，所以权限要够大
 * static:静态的，不要创建对象，通过类名就可以，方便jvm的调用
 * void:因为我们曾经说过，方法的返回值是返回调用者，而main方法是被jvm调用，你返回内容给jvm没有意义
 * main:是一个常见的方法入口，我见过的语言都是以main作为入口
 * String[] args:这是一个字符串数组，值去哪里了
 *
 */
class Student{
	//非静态变量
	int num = 10;
	//静态变量
	static int num2 = 20;
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student  = new Student();
		System.out.println("通过对象调用非静态变量："+student.num);
		System.out.println("通过类调用静态变量："+Student.num2);
		System.out.println("通过对象调用静态变量："+student.num2);

	}

}
