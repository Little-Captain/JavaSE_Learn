// 测试 Phone 类
// 测试引用类型的步骤
// 1. 导入包, 类 (同一个文件夹下, 不需要)
// 2. 创建引用类型
// 3. 使用其功能
public class TestPhone {
	
	public static void main(String[] args) {
	    // 创建 Phone 类
		Phone p = new Phone();

		// 使用
		// p.color = "土豪金";
		// p.brand = "iPhone";
		// p.size = 4.0;

		// 获取属性值
		System.out.println(p.color + " " + p.brand + " " + p.size);
	}
}