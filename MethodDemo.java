/*
	方法定义的格式
		修饰符 返回值类型 方法的名字(参数列表...) {
			方法的功能主体
			return 返回值;
		}
		修饰符 : 现在使用固定写法 public static
*/
public class MethodDemo {

	public static void main(String[] args) {
		
		System.out.println(calAreaOfRect(3, 5));
	}

	public static int calAreaOfRect(int a, int b) {

		return a * b;
	}
}