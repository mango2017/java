# java
2018.09.06 开始学习java基础


* 成员变量和局部变量的区别？
 	a.在类中的位置不同
 		成员变量：在类中方法外
 		局部变量：在方法定义中或者方法声明上
	b.在内存中的位置不同
 		成员变量在堆内存
 		局部变量在栈内存
	c.声明周期不同
 		成员变量 随着对象的创建而存在 随着对象的消失而消失
 		局部变量 随着方法的调用而存在，随着方法的调用完毕而消失
	d.初始化值不同
 		成员变量  有默认初始化值 
 		局部变量 没有默认初始化值，必须定义，赋值，然后才能使用。
 		注意事项：局部变量名称可以和成员变量名称一样，在方法中使用的时候，采用的是就近原则
 		
 		
 		
Student s = new Student();做了哪些事情
a.把Student.class文件加载到内存中
b.在栈内存给s变量开辟一个空间
c.在堆内存为学生对象申请一个空间
d.给成员变量进行默认初始化。null 0
e.给成员变量进行显示初始化
f.通过构造方法给成员变量进行初始化
g.数据初始化完毕，然后把堆内存的地址值赋值给栈内存的s变量