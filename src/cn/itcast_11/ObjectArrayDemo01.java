package cn.itcast_11;

public class ObjectArrayDemo01 {
	/**
	 * 我有5个学生，请把这个5个学生的信息存储到
	 * @param args
	 */
	public static void main(String[] args) {
		//创建学生数组
		Student[] students = new Student[5];
		//创建5个学生对象，并赋值
		Student s1 = new Student("林宥嘉",28);
		Student s2 = new Student("王子文",25);
		Student s3 = new Student("吴谨言",20);
		Student s4 = new Student("何炅",21);
		Student s5 = new Student("黄磊",29);
		//将元素放到数组中
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		//遍历
		for(int x=0;x<students.length;x++)
		{
			//System.out.println(students[x]);
			System.out.println(students[x].getAge()+"----"+students[x].getName());
		}
		
	}
}
