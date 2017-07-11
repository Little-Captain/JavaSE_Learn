// 数据类型的强制转换
// 数据范围取值大的转换为取值小的
// 强制类型转换, 一般不使用, 要丢失数据 
public class DataConvert_1 {

	public static void main(String[] args) {
		
		// double -> int
		double d = 3.14;
		int i = (int)d;
		System.out.println(i);

		byte b = (byte)200;
		System.out.println(b);
	}
}