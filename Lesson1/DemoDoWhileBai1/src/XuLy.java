import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Vui lòng nhập vào số a");
		float a = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào số b");
		float b = Float.parseFloat(scan.nextLine());
		xuLy(a, b);

	}

	public static void iMenu() {
		System.out.println("Vui lòng chọn và nhập");
		System.out.println("1. Tính Tổng");
		System.out.println("2. Tính Hiệu");
		System.out.println("3. Tính Nhân");
		System.out.println("4. Tính Chia");
		System.out.println("0. Thoát");
	}

	public static float tinhTong(float a, float b) {
		return a + b;
	}

	public static float tinhHieu(float a, float b) {
		return a - b;
	}

	public static float tinhNhan(float a, float b) {
		return a * b;
	}

	public static float tinhChia(float a, float b) {
		return a / b;
	}

	public static void xuLy(float a, float b) {
		boolean flag = true;
		do {
			iMenu();
			int chosse = Integer.parseInt(scan.nextLine());
			switch (chosse) {
			case 1:
				float tong = tinhTong(a, b);
				System.out.println("_______________________");
				System.out.println("Tổng 2 số là: " + a + " + " + b + " = "+ tong);
				System.out.println("_______________________");
				break;
			case 2:
				float hieu = tinhHieu(a, b);
				System.out.println("_______________________");
				System.out.println("Hiệu 2 số là " + a + " - " + b+ " = " + hieu);
				System.out.println("_______________________");
				break;
			case 3:
				float tich = tinhNhan(a, b);
				System.out.println("_______________________");
				System.out.println("Tích 2 số là: " + a + " * " + b+ " = " + tich);
				System.out.println("_______________________");
				break;
			case 4:
				float thuong = tinhChia(a, b);
				System.out.println("_______________________");
				System.out.println("Thương 2 số là " + a + " / " + b+ " = " + thuong);
				System.out.println("_______________________");
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("_________________________________");
				System.out.println("Bạn đã nhập sai vui lòng nhập lại");
				System.out.println("_________________________________");
				break;
			}

		} while (flag);
	}
}
