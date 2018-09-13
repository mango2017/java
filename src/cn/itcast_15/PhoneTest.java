package cn.itcast_15;
class Phone{
	private String brand;
	private int price;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}


public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone();
		//直接输出默认值
		System.out.println(phone.getBrand()+"----"+phone.getPrice()+"-----"+phone.getColor());
		phone.setBrand("苹果");
		phone.setColor("红色");
		phone.setPrice(8888);
		//再次输出
		System.out.println(phone.getBrand()+"----"+phone.getPrice()+"-----"+phone.getColor());

	}

}
