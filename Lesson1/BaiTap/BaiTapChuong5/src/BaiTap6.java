import java.util.Scanner;

public class BaiTap6 {
	static Scanner scan = new Scanner(System.in);

	public BaiTap6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Tính số năm đợi chờ");
		long tienGui = nhapTienGuiTietKiem(scan);
		long tienMongMuon = nhapTienMongMuon(scan);
		float laiSuat = nhapLaiSuatGui(scan);
		tinhSoNamChoDoi(tienGui, tienMongMuon, laiSuat);;
	}

	// Hàm nhập tiền gửi tiết kiệm
	public static long nhapTienGuiTietKiem(Scanner scan) {
		long tienGui = 0;
		System.out.println("Vui lòng nhập số tiền bạn muốn gửi: ");
		do {
			tienGui = Long.parseLong(scan.nextLine());
			if (tienGui <= 0) {
				System.out.println("Vui lòng nhập tiền gửi lớn hơn >0: ");
			}
		} while (tienGui <= 0);

		return tienGui;
	}
	//Hàm nhập số tiền muốn có trong tương lai
	public static long nhapTienMongMuon(Scanner scan) {
		long tienMongMuon = 0;
		System.out.println("Vui lòng nhập số tiền bạn muốn có: ");
		do {
			tienMongMuon = Long.parseLong(scan.nextLine());
			if (tienMongMuon <= 0) {
				System.out.println("Vui lòng nhập tiền muốn có lớn hơn 0: ");
			}
		} while (tienMongMuon <= 0);

		return tienMongMuon;
	}

	// Hàm nhập lãi suất
	public static float nhapLaiSuatGui(Scanner scan) {
		float laiSuat = 0;
		System.out.println("Vùi lòng nhập Lãi suất(Đơn vị tính: %): ");
		do {
			laiSuat = Float.parseFloat(scan.nextLine());
			if (laiSuat <= 0) {
				System.out.println("Vui lòng nhập lãi suất lớn hơn 0: ");
			}
		} while (laiSuat < 0);

		return laiSuat;
	}
	public static void tinhSoNamChoDoi (long tienGui, long tienMongMuon, float laiSuat) {
		int namChoDoi = 0;
		float tienCoDuoc =0;
		tienCoDuoc += tienGui;
		for (int i = 1; tienCoDuoc < tienMongMuon ; i++) {
			tienCoDuoc *= (1+laiSuat/100);
			namChoDoi = i;
		}
		System.out.println("Bạn cần đợi "+ namChoDoi + " năm để đạt được số tiền " + tienMongMuon);
	}

}
