/*
	ArrayList 集合 : 集合不存储基本数据类型, 只存储引用数据类型. 
	                集合中存储数据个数没有限制, 数组定义好后, 就确定了
	引用数据类型
	步骤:
	1. 导入包 java.util
	2. 创建对象
	数据类型<集合存储的数据类型> 变量名 = new 数据类型<集合存储的数据类型>();
	集合存储的数据类型: 要存入集合容器中的数据类型
	创建集合引用变量的时候, 必须要指定好, 存储的类型是什么?
	3. 使用
*/
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// 创建集合容器
		ArrayList<String> array1 = new ArrayList<String>();
		// 创建集合容器
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		// 创建集合容器
		ArrayList<Phone> array3 = new ArrayList<Phone>();
	}
}