package cn.itcast_10;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo3 {
	/**
	 * Random:产生随机数的类
	 * @param args
	 */
	public static void main(String[] args) {
		//创建对象
//		Random r =new Random();
		
		Random r =new Random(1111L);  //给定种子后，每次得到的随机数是相同的
		for(int x=0;x<10;x++) {
//			int num = r.nextInt();
//			System.out.println(num);
			
			int num = r.nextInt(100)+1;
			System.out.println(num);
		}
	}

	

}
