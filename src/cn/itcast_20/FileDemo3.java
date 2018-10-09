package cn.itcast_20;

import java.io.File;
import java.io.IOException;

/**
 * 
 * 删除功能：public boolean delete()
 * 注意：如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下
 * java中的删除不走回收站
 * 要删除一个文件夹，请注意该文件夹内不能包含文件或文件夹
 *
 */
public class FileDemo3 {
	public static void main(String[] args) throws IOException {
		//创建文件
		File file = new File("a.txt");
		System.out.println(file.createNewFile());
		
		//删除功能：我要删除a.txt这个文件
		File file2 = new File("a.txt");
		System.out.println(file2.delete());
		
		//创建文件夹
		File file3 = new File("aa\\bb\\ccc");
		System.out.println(file3.mkdirs());
		
		//删除文件夹
		//我要删除ccc这个文件夹
		File file4 = new File("aa\\\\bb\\\\ccc");
		System.out.println(file4.delete());
		
		File file5 = new File("aa\\bb");
		File file6 = new File("aa");
		System.out.println(file5.delete());
		System.out.println(file6.delete());
		
	}
}
