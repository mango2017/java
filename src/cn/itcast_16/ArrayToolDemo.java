package cn.itcast_16;
/**
 * 
 * 
 * @author Administrator
 *
 */


public class ArrayToolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,56,79,90};
		//我要遍历数组
		ArrayTool.printArray(arr);
		//获取最大值
		int result = ArrayTool.getMax(arr);
		System.out.println("最大值是："+result);
		//获取索引
		int index = ArrayTool.getIndex(arr, 56);
		System.out.println("索引是："+index);
		
		

	}

}
