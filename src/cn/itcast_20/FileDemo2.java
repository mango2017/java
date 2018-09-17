package cn.itcast_20;

import java.io.File;
import java.io.IOException;

/**
 * 
 * 创建功能：
 * public boolean createNewFile():创建文件，如果存在这样的文件，就不创建了
 * public boolean mkdir():创建文件夹，如果存在这样的文件夹，就不创建了
 * public boolean mkdir():创建文件夹，如果父文件夹不存在，会帮创建出来
 *
 */
public class FileDemo2 {
	public static void main(String[] args) throws IOException {
		//我要在d盘目录下创建一个文件夹demo
		File file = new File("d:\\demo");
		System.out.println(file);
		System.out.println(file.mkdir());
		
		//我要在d盘目录demo创建一个文件a.txt
		File file2 = new File("d:\\demo\\2.txt");
		System.out.println(file2.createNewFile());
		
		//我要在d盘目录demo下创建一个文件3.txt
		//注意：要想在某个目录下创建内容，该目录首先必须存在
//		File file3 = new File("d:\\test\\3.txt"); //Exception in thread "main" java.io.IOException: 系统找不到指定的路径。
//		System.out.println(file3.createNewFile());
//		
		//我要在d盘目录test下创建aaa目录
//		File file4 = new File("d:\\test\\aaa");
//		System.out.println(file4.createNewFile());
		
		//创建多个目录
		File file7= new File("d:\\test\\aa\\bb");
		System.out.println(file7.mkdirs());
		
		//
		
		
		
	}
}
