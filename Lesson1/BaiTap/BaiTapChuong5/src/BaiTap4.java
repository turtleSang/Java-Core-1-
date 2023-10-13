import java.util.Scanner;

public class BaiTap4 {
	static Scanner scan = new Scanner(System.in);

	public BaiTap4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Chương trình tính biểu thức S(n) = x + x^1 + x^2 +...+ x^ns");
		int x = nhapSoX(scan);
		int n = nhapSoN(scan);
		tinhBieuThuc(x, n);
	}

	// Hàm nhập  n
	public static int nhapSoN(Scanner scan) {
		boolean flag = true;
		System.out.println("Vui lòng nhập số n");
		int n = 0;
		do {
			n = Integer.parseInt(scan.nextLine());
			if (n < 0) {
				System.out.println("Vui lòng nhập số n nguyên dương");
			} else {
				flag = false;
			}
		} while (flag);
		return n;
	}
	// Hàm nhập x
	public static int nhapSoX(Scanner scan) {
		System.out.println("Vui lòng nhập số x: ");
		int x = Integer.parseInt(scan.nextLine());
		return x;
	}

	//Tính số x^n
	public static int tinhXmu(int x, int n) {
		int ketQua = 1;
		for (int i = 0; i  <= n; i++) {
			ketQua *= x;
		}
		return ketQua;
	}
	
	//hàm tính tổng các số x^n
	public static void tinhBieuThuc(int x, int n) {
		int tong = 0;
		for (int i = 0; i <= n; i++) {
			tong += tinhXmu(x, i); // tính số x^i rồi cộng vào tong
		}
		System.out.println("Biển thức S(" + n + ") " + "là: "  + tong);
	}
}
