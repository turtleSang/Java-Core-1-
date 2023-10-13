import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		System.out.println("Demo lệnh nhập");
		Scanner scan = new Scanner(System.in);

		System.out.println("Nhập vào một thực thứ 1");
		String value1 = scan.nextLine();
		System.out.println("Nhập vào một số thực thứ 2");
		String value2 = scan.nextLine();

		double num1 = Double.parseDouble(value1);
		double num2 = Double.parseDouble(value2);
		double sum = num1 + num2;
		System.out.println("Tổng là: " + sum);

//		System.out.println("Vui lòng nhập vào thực");
//		double chuoi = scan.nextDouble();
//		System.out.println(chuoi);
	}

}
