package cn.itcast_16;



class Arrs{
	public  void show() {
		System.out.println("静态方法");
	}
	
	public static void aa() {
		Arrs arrs = new Arrs();
		arrs.show();
	}
}
public class ArrayDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arrs arrs = new Arrs();
//		arrs.aa();
		Arrs.aa();
		
		
			
	}

}
