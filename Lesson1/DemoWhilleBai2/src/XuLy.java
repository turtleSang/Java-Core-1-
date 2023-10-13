import java.util.Scanner;

public class XuLy {
	static Scanner scan = new Scanner(System.in);

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		float sum = tinhTongSoKhongAmCach2();
		System.out.println("Tổng các số dương là: " + sum);

	}

	public static float tinhTongSoKhongAm() {
		float sum = 0;
		float nhap;
		System.out.println("Mời bạn nhập số");
		nhap = scan.nextFloat();
		while (nhap > 0) {
			sum += nhap;
			System.out.println("Mời bạn nhập số");
			nhap = scan.nextFloat();
		}
		return sum;
	}

	public static float tinhTongSoKhongAmCach2() {
		float tong = 0;
		boolean flag = true;
		while (flag) {
			System.out.print("Vui lòng nhập số: ");
			float nhap = Float.parseFloat(scan.nextLine());
			if (nhap > 0) {
				tong += nhap;
			}else {
				flag = false;
			}
		}
		return tong;
	}

}
