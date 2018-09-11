package cn.itcast_14;

class Phones {
	//品牌
	String brand;
	//价格
	int price;
	//颜色
	String color;
	
	//打电话的方法
	public void call(String name) {
		System.out.println("给"+name+"打电话");
	}
	
	//发短信
	public void sendMessage() {
		System.out.println("群发短信");
	}
	
	//玩游戏的方法
	public void playGame() {
		System.out.println("玩游戏");
	}
}

public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phones phones = new Phones();
		//输出默认值
		System.out.println(phones.brand+"---"+phones.price+"----"+phones.color);
		phones.brand="苹果";
		phones.price=100;
		phones.color="白色";
		System.out.println(phones.brand+"---"+phones.price+"----"+phones.color);
		
		phones.call("吴谨言");
		phones.sendMessage();
		phones.playGame();

	}

}
