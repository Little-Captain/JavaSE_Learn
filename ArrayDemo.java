public class ArrayDemo {

	public static void main(String[] args) {
		
		// 方式1, 动态赋值
		int[] arr = new int[100];

		arr[1] = 3;

		// 默认值是 0 
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		System.out.println(arr.length);

		// 方式2, 静态赋值
		// new 后面的中括号中不允许写任何内容 
		int[] array = new int[]{1, 2, 34};

		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);

		// 方式3, 简化
		int[] array3 = {1, 3, 3};

		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);

		// 数组操作的常见异常
		// 越界
		// System.out.println(array3[3]);
		// 空指针
		array3 = null;
		System.out.println(array3[1]);
	}
}