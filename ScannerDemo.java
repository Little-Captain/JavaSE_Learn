// Scanner 的作用 : 让我们在命令行中, 接受键盘的输入
// 使用步骤
// 1. 导入包 : 指明类所在的文件夹 (java 文件夹 util 文件夹)
// 2. 创建 Scanner 类型变量
// 3. 使用Scanner类中的功能, 接受键盘输入

// 导入包
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// 创建 Scanner 对象
		Scanner sc = new Scanner(System.in);

		// 使用Scanner类中的功能
		// nextInt() 接受键盘输入, 保证输入的是整数
		// nextInt 的返回值就是 int
		int i = sc.nextInt();
		System.out.println(i + 1);

		// next() 接收键盘输入的字符串
		String s = sc.next();
		System.out.println(s+1);
	}
}