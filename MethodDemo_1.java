/*
	方法参数
	1. 基本数据类型
	2. 引用类型
*/
public class MethodDemo_1 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		change(a, b);
		System.out.println(a);
		System.out.println(b);

		int[] arr = { 1, 2, 3, 4};
		System.out.println("main arr的地址 : " + arr);
		System.out.println(arr[2]);
		change(arr);
		System.out.println(arr[2]);

	}

	public static void change(int[] arr) {
		System.out.println("change arr的地址 : " + arr);
		arr[2] = 100;
	}
	public static void change(int a, int b) {
		a = a + b;
		b = a + b;
	}
}