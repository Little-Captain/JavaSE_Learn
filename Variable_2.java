// 变量定义和使用的注意事项
// 1. 变量定以后, 不赋值是不能使用的
// 2. 变量是有自己的作用范围, 变量的有效范围是定义的一对大括号内
// 3. 变量不允许重复定义
public class Variable_2 {

	public static void main(String[] args) {

		int i;
		System.out.println(i);

		{
			int j = 10;
		}
		System.out.println(j);

		int i;
	}
}