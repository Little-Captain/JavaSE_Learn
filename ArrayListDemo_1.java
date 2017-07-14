/*
	ArrayList 集合中的方法
	
	索引都不能越界的

	add(存储的元素) : 向集合中添加元素, 参数类型和定义时指定的存储类型是一样的
	get(int 索引) : 取出集合中的元素, 参数指明索引, (int index)
	size() : 返回集合的长度, 集合存储元素的个数
	add(int 索引, 存储的元素) : 将元素添加到指定的索引上, 插入
	set(int 索引, 修改后的元素) : 将指定索引的元素, 进行修改
	remove(int 索引)	: 移除指定索引上的元素
	clear() 清空集合中的所有元素
*/
import java.util.ArrayList;
public class ArrayListDemo_1 {

	public static void main(String[] args) {
		// 创建集合容器
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("abcde1");
		array1.add("abcde2");
		array1.add("abcde3");
		array1.add("abcde4");
		array1.add("abcde5");
		array1.add("abcde6");

		// 长度
		int size = array1.size();
		System.out.println(size);

		for(int i = 0; i < size; ++i) {
			System.out.println(array1.get(i));
		}
	}
}