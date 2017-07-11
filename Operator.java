// +  : 加法, 连接
// -  : 减法
// *  : 乘法
// /  : 除法
// %  : 取模
// ++ : 自增
// -- : 自减

// =
// +=
// -=
// *=
// /=
// %=

// ==
// !=
// >
// <
// >=
// <=

// &  : 与
// |  : 或
// ^  : 异或
// !  : 非
// && : 短路与
// || : 短路或
public class Operator {

	public static void main(String[] args) {
		
		// + 连接作用, 将一个字符串和其他数据连接起来
		// + 遇到字符串, 变成连接符号
		// + 任何类型只要和字符串 + , 所有的数据都变成了字符串
		System.out.println("5+5=" + 5 + 5);

		// 除法
		int i = 100;
		int j = 9;
		System.out.println(i / j);

		// 取模
		int k = 6;
		int m = 2;
		System.out.println(k % m);

		// ++ -- 
		int a = 3;
		System.out.println(a++);
		System.out.println(++a);

		byte b = 1;
		b = (byte)(b + 1);
		System.out.println(b);

		int jg = 4;
		System.out.println( 3 > 4 & ++jg > 2);
		System.out.println(jg);
	}
}