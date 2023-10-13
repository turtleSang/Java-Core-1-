import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// Tạo biến và hằng
		final float DISCOUNT8 = 0.08f;
		final float DISCOUNT10 = 0.1f;
		String tenHang;
		int soLuong;
		float donGia;
		float thanhTien;
		Scanner scan = new Scanner(System.in);

		// Nhập thông tin từ người dùng
		System.out.println("Vui lòng nhập Tên hàng");
		tenHang = scan.nextLine();

		System.out.println("Vui lòng nhập số lượng hàng");
		soLuong = Integer.parseInt(scan.nextLine());

		System.out.println("Vui lòng nhập đơn giá");
		donGia = Float.parseFloat(scan.nextLine());

		// Xử lý
//		if (soLuong < 50) {
//			thanhTien = soLuong * donGia;
//		} else {
//			if (soLuong <= 100) {
//				thanhTien = 50 * donGia + (soLuong - 50) * donGia *(1- DISCOUNT8);
//			} else {
//				thanhTien = 50 * donGia + 50 * donGia * (1-DISCOUNT8) + (soLuong - 100) * donGia * (1-DISCOUNT10);
//			}
//		}
		if (soLuong < 50) {
			thanhTien = soLuong * donGia;
		} else if ((soLuong < 50) && (soLuong <= 100)) {
			thanhTien = 50 * donGia + (soLuong - 50) * donGia *(1- DISCOUNT8);
		} else {
			thanhTien = 50 * donGia + 50 * donGia * (1-DISCOUNT8) + (soLuong - 100) * donGia * (1-DISCOUNT10);
		}

		// In ra màn hình
		System.out.println("Tên hàng hóa: \t" + tenHang);
		System.out.println("Số lượng: \t" + soLuong);
		System.out.println("Đơn giá \t " + donGia);
		System.out.println("Thành tiền: " + thanhTien);

	}

}
