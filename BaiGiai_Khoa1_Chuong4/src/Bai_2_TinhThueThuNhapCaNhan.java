import java.util.Scanner;

/*
 * Block 1 - Đầu vào
 * Họ tên, tổng thu nhập năm, số người phụ thuộc
 * 
 * Block 2 - Xử lý 
 * Tính thu thập chịu thuế
 * Tính số thuế trả theo thu nhập chịu thuế
 * 
 * Block 3 - Đầu ra
 * Thông báo số thuế phải đóng
 * 
 * 
 * 
 */
public class Bai_2_TinhThueThuNhapCaNhan {

	public Bai_2_TinhThueThuNhapCaNhan() {
		// TODO Auto-generated constructor stub
	}

	public static float tinhThuNhapChiuThue(Scanner scan) {
		float tongThuNhap;

		System.out.println("Nhập vào tổng thu nhập trong năm đơn vị triệu đồng");
		tongThuNhap = Float.parseFloat(scan.nextLine());

		System.out.println("Nhập vào số người phụ thuộc: ");

		return (float) (tongThuNhap - 4 - (Integer.parseInt(scan.nextLine()) * 1.6));
	}

	public static float tinhThueNop(float thuNhapChiuThue, float mucThueChiu) {
		return thuNhapChiuThue * mucThueChiu;
	}

	public static float tinhSoThuePhaiNop(float thuNhapChiuThue) {
		float soThuePhaiNop;

		final float THUE_SUAT_DEN_60 = 0.05f;
		final float THUE_SUAT_TREN_60_DEN_120 = 0.10f;
		final float THUE_SUAT_TREN_120_DEN_210 = 0.15f;
		final float THUE_SUAT_TREN_210_DEN_384 = 0.20f;
		final float THUE_SUAT_TREN_384_DEN_624 = 0.25f;
		final float THUE_SUAT_TREN_624_DEN_960 = 0.30f;
		final float THUE_SUAT_TREN_960 = 0.35f;

		final byte DEN_60 = 60;
		final byte TREN_60_DEN_120 = 60;
		final byte TREN_120_DEN_210 = 96;
		final short TREN_210_DEN_384 = 174;
		final short TREN_384_DEN_624 = 240;
		final short TREN_624_DEN_960 = 336;

		if ((thuNhapChiuThue - DEN_60) <= 0) {
			return tinhThueNop(thuNhapChiuThue, THUE_SUAT_DEN_60);
		} else {
			soThuePhaiNop = tinhThueNop(DEN_60, THUE_SUAT_DEN_60);
			System.out.println(soThuePhaiNop);
			thuNhapChiuThue -= DEN_60;
		}

		if ((thuNhapChiuThue - TREN_60_DEN_120) <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_60_DEN_120);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_60_DEN_120, THUE_SUAT_TREN_60_DEN_120);
			thuNhapChiuThue -= TREN_60_DEN_120;
		}

		if ((thuNhapChiuThue - TREN_120_DEN_210) <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_120_DEN_210);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_120_DEN_210, THUE_SUAT_TREN_120_DEN_210);
			thuNhapChiuThue -= TREN_120_DEN_210;
		}

		if ((thuNhapChiuThue - TREN_210_DEN_384) <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_210_DEN_384);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_210_DEN_384, THUE_SUAT_TREN_210_DEN_384);
			thuNhapChiuThue -= TREN_210_DEN_384;
		}

		if ((thuNhapChiuThue - TREN_384_DEN_624) <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_384_DEN_624);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_384_DEN_624, THUE_SUAT_TREN_384_DEN_624);
			thuNhapChiuThue -= TREN_384_DEN_624;
		}

		if ((thuNhapChiuThue - TREN_624_DEN_960) <= 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_624_DEN_960);
		} else {
			soThuePhaiNop += tinhThueNop(TREN_624_DEN_960, THUE_SUAT_TREN_624_DEN_960);
			thuNhapChiuThue -= TREN_624_DEN_960;
		}

		if (thuNhapChiuThue > 0) {
			return soThuePhaiNop + tinhThueNop(thuNhapChiuThue, THUE_SUAT_TREN_960);
		} else {
			return soThuePhaiNop;
		}
	}

	public static void main(String[] args) {
		float thuNhapChiuThue;
		String tenNguoiNopThue;
		Scanner mainScan = new Scanner(System.in);

		System.out.println("Nhập tên người nộp thuế: ");
		tenNguoiNopThue = mainScan.nextLine();
		thuNhapChiuThue = tinhSoThuePhaiNop(tinhThuNhapChiuThue(mainScan));

		System.out.println("Số thuế " + tenNguoiNopThue + " phải nộp là " + thuNhapChiuThue + "triệu đồng");

	}

}
