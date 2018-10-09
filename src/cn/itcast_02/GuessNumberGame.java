package cn.itcast_02;

import java.util.Scanner;

public class GuessNumberGame {
	/**
	 * 猜数字游戏
	 */
	public static void start() {
		int number = (int)(Math.random()*100)+1;
		while(true) {
			//键盘录入数据
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入你要猜的数字（1-100）：");
			int guessNumber = sc.nextInt();
			//判断
			if(guessNumber > number) {
				System.out.println("您猜的数字"+guessNumber+"大了");
			}else if(guessNumber < number) {
				System.out.println("您猜的数字"+guessNumber+"小了");
			}else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
	}
}
