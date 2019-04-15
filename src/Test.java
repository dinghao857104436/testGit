
public class Test {

	public static void main(String[] args) {
		// 初始长度
		double length = 100;
		// 弹跳长度
		double temp =  length;
		// 记录弹跳长度数组
		Double[] arr = new Double[10];
		// 第一次100
		arr[0] = 100.0;
		for (int i = 1; i < 10; i++) {
			// 每次弹跳长度为上一次的一半
			 temp = temp / 2;
			 // 长度加弹跳长度 一上一下的长度
			 length += temp*2;
			 arr[i] = temp;
		}
		// 第10次弹起高度
		double hight = arr[9] / 2;
		System.out.println(length + hight);
		System.out.println(hight);
	}

}
