package cn.itcast_14;
/**
 * 
 * 成员变量和局部变量的区别？
 * a.在类中的位置不同
 * 成员变量：在类中方法外
 * 局部变量：在方法定义中或者方法声明上
 * b.在内存中的位置不同
 * 成员变量在堆内存
 * 局部变量在栈内存
 * c.声明周期不同
 * 成员变量 随着对象的创建而存在 随着对象的消失而消失
 * 局部变量 随着方法的调用而存在，随着方法的调用完毕而消失
 * d.初始化值不同
 * 成员变量  有默认初始化值 
 * 局部变量 没有默认初始化值，必须定义，赋值，然后才能使用。
 * 注意事项：局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则
 * 
 * @author Administrator
 *
 */
 class Variable {
	int num;
	public void show() {
		int num2=20;
		System.out.println(num2);
		int num=100;
		System.out.println(num);
	}
}
 
 public class VariableDemo{
	 public static void main(String[] args) {
		Variable variable = new Variable();
		System.out.println(variable.num);
		variable.show();
	}
 }


