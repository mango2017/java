package cn.itcast_07;

public class StringTest4 {
	/***
	 * 
	 * 统计大串中小串出现的次数
	 * @param args
	 * 思路
	 * a.定义一个统计遍历，初始化值为0
	 * b.先获取一次“java”在这个大传中第一次出现的索引
	 * 如果索引值是-1 就说明不存在，返回统计遍历
	 * 如果索引值不是-1 就说明存在，统计变量++
	 * c.把刚才的索引+小串的长度作为起始位置截取原始大串，得到一个新的字符串
	 * 并把字符串的重新赋给大串
	 *
	 */
	public static void main(String[] args) {
		String maxString="woaijavazhendeaijavalovejava";
		String minString="java";
		int result = getCount(maxString, minString);
		System.out.println("java出现的次数"+result);
		
		
	}
	
	public static int getCount(String maxString,String minString) {
		//定义一个统计变量，初始化值是0
		int count=0;
		//先在大串查找一次小串第一次出现的位置
		int index  = maxString.indexOf(minString);
		//索引不是-1 说明存在，统计变量++
		while(index != -1) {
			count++;
			//把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值重新赋值给大串
			int startIndex = index+minString.length();
			maxString=maxString.substring(startIndex);
			//继续查
			index = maxString.indexOf(minString);
		}
		return count;
	}
}
