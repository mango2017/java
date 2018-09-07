package cn.itcast_02;

import java.util.Scanner;

public class StringDemo7 {
	
	public static void main(String[] args) {
		
		//定义用户名和密码，已存在的
		String username= "admin";
		String password = "admin";
		
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入用户名");
			String name = sc.nextLine();
			System.out.println("请输入密码");
			String pwd = sc.nextLine();
			if(name.equals(username) && pwd.equals(password)) {
				System.out.println("登录成功");
				GuessNumberGame.start();//登录成功之后进行猜数字游戏
				break;
			}else {
				if((2-i)==0) {
					System.out.println("账号被锁定，请与班长联系");
				}else {
					System.out.println("登录失败，您还有"+(2-i)+"次机会");
				}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
