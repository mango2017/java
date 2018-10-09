package cn.itcast_20;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 判断d盘目录下是否有后缀名.txt的文件，如果有，就输出此文件名称
 * 分析：
 * a.封装d盘判断目录
 * b.获取该目录下所有文件或者文件夹的File数组
 * c.遍历该File数组，得到一个File对象，然后判断
 * d.是否是文件
 * 	是：继续判断是否以.txt结尾
 * 		是：就输出该文件名称
 * 		否：不搭理它
 * 	否：不搭理它
 * 
 */
public class FileDemo8 {
	public static void main(String[] args)  {
		//封装d盘判断目录
		File  file = new File("d:\\");
		//获取该目录下所有文件或者文件夹的File数组
		File[] fileArray = file.listFiles();
		//遍历该File数组，得到一个File对象，然后判断
		for(File f:fileArray) {
			//是否是文件
			if(f.isFile()) {
				//继续判断是否以.txt结尾
				if(f.getName().endsWith(".txt")) {
					//就输出该文件名称
					System.out.println(f.getName());
				}
			}
		}
		
	}
}
