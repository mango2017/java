package cn.itcast_20;

import java.io.File;

/**
 * 
 * 我们想要实现io的操作，就必须知道硬盘文件的表现形式
 * 而java就提供了一个类File供我们使用
 * 构造方法：
 * File(String pathname):根据一个路径得到File对象
 * File(String parent,String child):根据一个目录和一个子文件/目录得到File对象
 * File(File parent,String child):根据一个父File对象和一个子文件/目录得到File对象
 *
 */
public class FileDemo1 {
	public static void main(String[] args) {
		//把D:\\fff\\2.txt 封装成一个File对象
		
		//File(String pathname):根据一个路径得到File对象
		File file1  = new File("D:\\fff\\2.txt");
		System.out.println(file1);
		
		//File(String parent,String child):根据一个目录和一个子文件/目录得到File对象
		File file2 = new File("D:\\\\fff", "2.txt");
		System.out.println(file2);
		
		File file3 = new File("D:\\\\\\\\fff");
		File file4 = new File(file3, "2.txt");
		System.out.println(file4);
		
		
		
	}
}
