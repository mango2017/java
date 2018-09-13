package cn.itcast_15;

import java.util.Scanner;

/**
 * 定义一个长方形的类，定义求周长和面积的方法
 * 成员变量：
 * 长
 * 宽
 * 成员方法：
 * 求周长
 * 求面积
 * import必须在所有的class的前面
 * @author Administrator
 *
 */
class ChangFangXing{
	private int width;
	private int length;
	public ChangFangXing() {
		
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getZhouChang() {
		return (width+length)*2;
	}
	public int getArea() {
		return width*length;
	}
	
}
public class ComputerDemo {
	public static void main(String[] args) {
		ChangFangXing cFangXing = new ChangFangXing();		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入长发行的长");
		int length = scanner.nextInt();
		System.out.println("请输入长发行的宽");
		int width = scanner.nextInt();
		cFangXing.setLength(length);
		cFangXing.setWidth(width);
		System.out.println("长方形周长："+cFangXing.getZhouChang());
		System.out.println("长方形面积："+cFangXing.getArea());
	}

}
