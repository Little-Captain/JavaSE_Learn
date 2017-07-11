/*
	方法的重载 overload
	在同一个类中, 允许出现同名的方法, 只要方法的参数列表不同即可. 这就是重载
	3个条件: 1. 同一个类 2. 方法同名 3. 参数列表不同
	参数列表不同: 参数的个数, 数据类型, 顺序

	注意事项:
	1. 参数列表必须不同(顺序或个数)
	2. 重载和形式参数名无关
	3. 重载和返回值类型无关
	4. 重载和方法修饰符无关

	技巧: 重载看方法名和参数列表(个数、类型、顺序)
*/

public class MethodOverLoadDemo {

	public static void main(String[] args) {

		// 对于重载的调用, 是根据参数的传递进行区分的
		System.out.println(getSum(1, 2));
		System.out.println(getSum(1, 2, 3));
		System.out.println(getSum(1.1, 2.0));
	}

	// 求和
	public static int getSum(int a, int b) {
		return a + b;
	}
	public static int getSum(int a, int b, int c) {
		return a + b + c;
	}
	public static double getSum(double a, double b) {
		return a + b;
	}
}