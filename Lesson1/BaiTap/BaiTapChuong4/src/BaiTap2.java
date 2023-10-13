import java.util.Scanner;

public class BaiTap2 {

	static Scanner scan = new Scanner(System.in);

	public BaiTap2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String hoTen = nhapTen();
		int soNguoiPhuThuoc = nhapNguoiPhuThuoc();
		float thuNhap = nhapThuNhap();
		System.out.println("Họ và tên: " + hoTen);
		inTongThue(thuNhap, soNguoiPhuThuoc);

	}

	// Hàm nhập nhập Họ và tên
	public static String nhapTen() {
		System.out.println("Vui lòng nhập họ tên của bạn");
		String hoVaTen = scan.nextLine();
		return hoVaTen;
	}

	// Hàm nhập số người phụ thuộc
	public static int nhapNguoiPhuThuoc() {
		System.out.println("Nhập số người phụ thuộc");
		int soNguoiPhuThuoc;
		soNguoiPhuThuoc = Integer.parseInt(scan.nextLine());
		return soNguoiPhuThuoc;
	}

	// Hàm nhập số tiền kiêm được
	public static float nhapThuNhap() {
		System.out.println("Nhập số tiền kiếm được một năm (Đơn vị tính: triệu đồng): ");
		float thuNhap = Float.parseFloat(scan.nextLine());
		return thuNhap;

	}

	// Hàm tính thuế đến 60
	public static void inThueDen60(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = thuNhapChiuThue * 0.05f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");

	}

	// Hàm tính thuế 60 - 120
	public static void inThue61To120(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = 60 * 0.05f + (thuNhapChiuThue - 60) * 0.1f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");
	}

	// Hàm tính Thuế 120 - 216
	public static void inThue120To216(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = 60 * 0.05f + 60 * 0.1f + (thuNhapChiuThue - 120) * 0.15f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");
	}

	// Hàm tính Thuế 216 - 384
	public static void inThue216To384(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = 60 * 0.05f + 60 * 0.1f + 96 * 0.15f + (thuNhapChiuThue - 216) * 0.2f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");
	}

	// Hàm tính thuế 384 -624
	public static void inThue384To624(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = 60 * 0.05f + 60 * 0.1f + 96 * 0.15f + 168 * 0.2f + (thuNhapChiuThue - 384) * 0.25f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");
	}

	// Hàm tính thuế 624 - 960
	public static void inThue624To960(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = 60 * 0.05f + 60 * 0.1f + 96 * 0.15f + 168 * 0.2f + 240*0.25f + (thuNhapChiuThue - 624) * 0.3f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");
	}
	//Hàm tính thuế trên 960
	public static void inThueUpper960(float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		float thue = 60 * 0.05f + 60 * 0.1f + 96 * 0.15f + 168 * 0.2f + 240*0.25f + 366*0.3f + (thuNhapChiuThue - 960) * 0.35f;
		System.out.println("Thuế thu nhập của bạn là: " + thue + " triệu đồng");
	}
	//Hàm in ra theo thu nhập
	public static void inTongThue (float thuNhap, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = thuNhap - 4 - (soNguoiPhuThuoc * 1.6f);
		if (thuNhapChiuThue <= 60 && thuNhapChiuThue > 0) {
			inThueDen60(thuNhap, soNguoiPhuThuoc);
		} else if (thuNhapChiuThue > 60 && thuNhapChiuThue <= 120){
			inThue61To120(thuNhap, soNguoiPhuThuoc);
		} else if (thuNhapChiuThue > 120 && thuNhapChiuThue <= 216) {
			inThue120To216(thuNhap, soNguoiPhuThuoc);
		} else if (thuNhapChiuThue > 216 && thuNhapChiuThue <= 384) {
			inThue216To384(thuNhap, soNguoiPhuThuoc);
		} else if (thuNhapChiuThue > 384 && thuNhapChiuThue <= 624) {
			inThue384To624(thuNhap, soNguoiPhuThuoc);
		} else if (thuNhapChiuThue > 624 && thuNhapChiuThue <= 960) {
			inThue624To960(thuNhap, soNguoiPhuThuoc);
		} else if (thuNhapChiuThue > 960) {
			inThueUpper960(thuNhap, soNguoiPhuThuoc);
		} else {
			System.out.println("Vui lòng nhập thu nhập là số dương");
		}
	}
	
	
	
	
	
	

}
