package cn.itcast_20;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 需求：把d盘test目录下的文件名改成 001_名字.txt
 * 思路：
 * a.封装目录
 * b.获取该目录下所有的文件file数组
 * c.遍历该file数组，得到每一个file对象
 * d.拼接一个新的名称，然后重命名即可
 */
public class FileDemo10 {
	public static void main(String[] args)  { 
		
		//封装目录
		File srcFolder = new File("d:\\test\\");
		
		//获取该目录下所有的文件file数组
		File[] fileArray = srcFolder.listFiles();
		
		//遍历该File数组，得到每一个file对象
		for(File file:fileArray) {
			//d:\test\aaa_001_jfjsdkfjd_jly.txt
			//d:\test\aaa_002_jfjsdkfjd_wzw.txt
			System.out.println(file);
			String name = file.getName();
			//System.out.println(name);
			int index = name.indexOf("_");
			//System.out.println(index);
			String numberString = name.substring(index+1,index+4); // 001
			
			int endIndex = name.lastIndexOf("_");
			String nameString = name.substring(endIndex);
			
			//
			String newName = numberString.concat(nameString);
			//System.out.println(newName);
			File newFile = new File(srcFolder, newName);
			System.out.println(newFile);
			
			//重命名即可
			file.renameTo(newFile);
			
		}
	}
}
