package cn.itcast_04;

public class StringTest2 {
	/**
	 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数（不考虑其他字符）
	 * 举例子："hello123WORLD"
	 * 分析：
	 * a.定义三个统计遍历
	 * b.遍历字符串，得到每一个字符
	 * c.判断该字符到底是属于哪种类型的
	 * char类型会转成int型
	 * @param args
	 */

	public static void main(String[] args) {
		int bigCount=0;
		int smallCount=0;
		int numberCount=0;
		String s="hEllo1Word0";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0' && c<='9') {
				numberCount++;
			}
			if(c>='a' && c<='z') {
				smallCount++;
			}
			if(c>='A' && c<='Z') {
				bigCount++;
			}
		}
		System.out.println("大写字母个数"+bigCount);
		System.out.println("小写字母个数"+smallCount);
		System.out.println("数字个数"+numberCount);

	}

}
