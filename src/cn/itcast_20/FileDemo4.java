package cn.itcast_20;

import java.io.File;
import java.io.IOException;

/**
 * 重命名功能：public boolean renameTo(File dest)
 * 如果路径相同：就是改名
 * 如果路径不同，就是改名并剪切
 * 路径以盘符开始：绝对路径：c:\\a.txt
 * 路径不以盘符开始：相对路径  a.txt
 * 
 *
 */
public class FileDemo4 {
	public static void main(String[] args) throws IOException {
		//创建一个文件对象
//		File file = new File("a.txt");
//		//我要修改这个文件的名称为b.txt
//		File newFile = new File("b.txt");
//		System.out.println(file.renameTo(newFile));
		
		File file2 = new File("b.txt");
		File newFile2 = new File("d:\\b.txt");
		System.out.println(file2.renameTo(newFile2));
		
	}
}
