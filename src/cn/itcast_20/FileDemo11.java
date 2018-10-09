package cn.itcast_20;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */
public class FileDemo11 {
	public static void main(String[] args)  { 
		int jc=1;
		for(int x=2;x<=5;x++) {
			jc*=x;
		}
		System.out.println("5的阶乘是："+jc);
		System.out.println("5的阶乘是："+jiecheng(5));
		
	}
	
	public static int jiecheng(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*jiecheng(n-1);
		}
	}
}
