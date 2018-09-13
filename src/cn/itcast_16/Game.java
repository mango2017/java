package cn.itcast_16;

import java.util.Scanner;

/*
 * 猜数字小游戏（数据在1-100之间）
 * 分析：
 * a.程序产生一个随机数
 * b.键盘录入数据
 * c.把你猜的和被猜的进行比较
 * d.给出多次猜的机会，猜中就结束
 */
public class Game {
	public static void main(String[] args) {
		//产生随机数
		int number = (int)(Math.random()*100)+1;
		while(true) {
			System.out.println("请输入你要猜的数据（1-100）");
			Scanner scanner = new Scanner(System.in);
			int guessNumber = scanner.nextInt();
			if(guessNumber > number) {
				System.out.println("你猜的数据"+guessNumber+"大了");
			}else if(guessNumber < number) {
				System.out.println("你猜的数据"+guessNumber+"小了");
			}else {
				System.out.println("恭喜你，猜中了");
				break;
			}
		}
	}
}
