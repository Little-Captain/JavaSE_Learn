/*
	random : 产生随机数
	nextInt
	nextDouble [0.0 1.0)
*/
import java.util.Random;
public class RandomDemo {

	public static void main(String[] args) {
		
		Random rd = new Random();

		// 参数随机数 0 - (n-1)
		int rdInt = rd.nextInt(100);

		System.out.println(rdInt);

		Double rdD = rd.nextDouble();

		System.out.println(rdD);
	}
}