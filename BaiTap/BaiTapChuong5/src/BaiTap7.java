import java.util.Scanner;

public class BaiTap7 {
	static Scanner scan = new Scanner(System.in);

	public BaiTap7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = nhapChieuCao(scan);
				
		inTamGiacDacRuot(n);
		inTamGiacRongRuot(n);

	}

	// Hàm nhập chiều cao n của tam giác
	public static int nhapChieuCao(Scanner scan) {
		System.out.println("Vui Lòng nhập chiều cao N của tam giác cân muốn vẽ: ");
		int n = Integer.parseInt(scan.nextLine());
		while (n <= 0) {
			System.out.println("Vui lòng nhập lại chiều cao N > 0");
			n = Integer.parseInt(scan.nextLine());
		}
		return n;
	}
	//Hàm in Khoản Trắng ở hàng thứ i
	public static void inKhoangTrang(int n, int i) {
		// Số khoảng trắng trên hàng thứ i = n -i
		int soKhoangTrang = n - i;
		for (int j = 1; j <= soKhoangTrang; j++) {
			System.out.print("   ");
		}
	}

	//// Hàm in dấu * ở dòng thứ i cách 1
	public static void inDauCach1(int i) {
		int soDau = 2 * i - 1;// số dấu * bằng 2i-1
		for (int j = 1; j <= soDau; j++) {
			System.out.print(" * ");
		}
	}

	// Hàm in tam giác đầy dấu *
	public static void inTamGiacDacRuot(int n) {
		for (int i = 1; i <= n; i++) {
			inKhoangTrang(n, i);
			inDauCach1(i);
			;
			System.out.println("");
		}
	}

	// Hàm in ra dấu * ở dòng thứ i của tam giác rỗng ruột
	public static void inDauCach2(int n, int i) {
		int soVongLap = 2 * i - 1;// số vòng lặp bằng tại hàng thứ i là 2i-1
		for (int j = 1; j <= soVongLap; j++) {
			/*
			 * in ra dấu * tại điểm: + j = 1 + j == soVongLap + i = n Còn lại in khoảng
			 * Trắng
			 */

			if (i == n || j == soVongLap || j == 1) {
				System.out.print(" * ");
			} else {
				System.out.print("   ");
			}

		}
	}

	// Hàm in ra tam giác rỗng ruột
	public static void inTamGiacRongRuot(int n) {
		for (int i = 1; i <= n; i++) {
			inKhoangTrang(n, i);
			inDauCach2(n, i);
			System.out.println("");
		}
	}
}
