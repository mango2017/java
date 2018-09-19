package cn.itcast_20;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取功能：
 * public String getAbsolutePath():获取绝对路径
 * public String getPath():获取相对路径
 * public String getName():获取名称
 * public long length():获取长度，字节数
 * public long lastModified():获取最后一次的修改时间，毫秒数
 * 
 */
public class FileDemo6 {
	public static void main(String[] args)  {
		//创建文件对象
		File file = new File("a.txt");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		Date date= new Date(file.lastModified());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String a = simpleDateFormat.format(date);
		System.out.println(a);
	}
}
