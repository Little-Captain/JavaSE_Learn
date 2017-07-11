// 自动: 取值范围小的类型, 自动转换成取值范围大的类型
// boolean 不参与类型转换
public class DataConvert {

	public static void main(String[] args) {
		
		double d = 1000;
		System.out.println(d);

		int i = 100;
		double d2 = i;
		System.out.println(d2);

		byte b = 10;
		int j = b;
		System.out.println(j);
	}
}