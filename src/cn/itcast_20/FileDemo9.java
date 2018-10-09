package cn.itcast_20;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 判断d盘目录下是否有后缀名为.txt的文件，如果有，就输出此文件名称
 * a.先获取所有的，然后遍历的时候，依次判断，如果满足条件就输出
 * b.获取的时候就已经是满足条件的了，然后输出即可
 * 要想实现这个效果，就必须学习一个接口：文件名称过滤器
 * public String[] list(FilenameFilter filter)
 * public File[] listFiles(FilenameFilter filter)
 */
public class FileDemo9 {
	public static void main(String[] args)  {
		//判断d盘目录
		File file = new File("d:\\");
		//获取该目录下所有文件或者文件夹的String 数组
		String[] strArray = file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//通过这个测试，我们就知道了，到底把这个文件或者文件夹的名称加不加到数组中，取决于
				//这里的返回值是true还是false
				//所以，这个true或者false应该是我们通过某种判断得到的
				return new File(dir, name).isFile() && name.endsWith(".txt");
			}
		});
		
		//遍历
		for(String s:strArray) {
			System.out.println(s);
		}
		
	}
}
