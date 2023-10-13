import java.util.Scanner;

/*
 * Block 1 - Đầu vào
 * Điểm môn 1, điểm môn 2, điểm môn 3, điểm chuẩn, khu vực, đối tượng
 * 
 * Block 2 - Xử lý 
 * Kiểm tra nếu trong quá trình nhập điểm có môn điểm 0 thì xuất kết quả rớt
 * Nếu không có môn nào điểm 0 thì tính điểm sau khi cộng điểm vào và so sánh với điểm chuẩn để biết đâu rớt
 * 
 * Block 3 - Đầu ra
 * Thông báo kết quả
 * 
 * 
 * 
 */
public class Bai_1_QuanLyTuyenSinh {

	public Bai_1_QuanLyTuyenSinh() {
		// TODO Auto-generated constructor stub
	}

	public static float tinhDiemCong(String loaiDiem, Scanner scan) {
		final byte DIEM_KHU_VUC_A = 2, DIEM_KHU_VUC_B = 1, DIEM_DOI_TUONG_3 = 1;
		final float DIEM_KHU_VUC_C = 0.5f, DIEM_DOI_TUONG_1 = 2.5f, DIEM_DOI_TUONG_2 = 1.5f;

		if (loaiDiem.equals("Khu Vuc")) {
			System.out.println("Nhập khu vực của thí sinh: ");
			System.out.println("A. Khu Vực A");
			System.out.println("B. Khu Vực B");
			System.out.println("C. Khu Vực C");
			System.out.println("X. Không có khu vực");

		} else {
			System.out.println("Nhập đối tượng của thí sinh: ");
			System.out.println("1. Đối tượng 1");
			System.out.println("2. Đối tượng 2");
			System.out.println("3. Đối tượng 3");
			System.out.println("0. Không có đối tượng");

		}

		switch (scan.nextLine()) {
		case "A":
		case "a":
			return DIEM_KHU_VUC_A;
		case "B":
		case "b":
			return DIEM_KHU_VUC_B;
		case "C":
		case "c":
			return DIEM_KHU_VUC_C;
		case "1":
			return DIEM_DOI_TUONG_1;
		case "2":
			return DIEM_DOI_TUONG_2;
		case "3":
			return DIEM_DOI_TUONG_3;
		default:
			return 0;
		}
	}

	public static void kiemTraDauRot(float diemChuan, float diemTong) {
		if (diemChuan <= diemTong) {
			System.out.println("Bạn đã đậu với số điểm: " + diemTong);
		} else {
			System.out.println("Bạn đã rớt do điểm của bạn là: " + diemTong + " thấp hơn điểm chuẩn " + diemChuan);
		}
	}

	public static float nhapDiem(String tenMon, Scanner scan) {
		System.out.println("Mời bạn nhập điểm " + tenMon);
		return Float.parseFloat(scan.nextLine());
	}

	public static void main(String[] args) {
		Scanner mainScan = new Scanner(System.in);
		float bienTam, diemTong;

		bienTam = nhapDiem("môn thứ nhất", mainScan);
		if (bienTam > 0) {
			diemTong = bienTam;
			bienTam = nhapDiem("môn thứ hai", mainScan);

			if (bienTam > 0) {
				diemTong += bienTam;
				bienTam = nhapDiem("môn thứ ba", mainScan);

				if (bienTam > 0) {
					diemTong += bienTam;
					diemTong += tinhDiemCong("Khu Vuc", mainScan);
					diemTong += tinhDiemCong("Doi Tuong", mainScan);

					kiemTraDauRot(nhapDiem("chuẩn", mainScan), diemTong);
					return;
				}
			}
		}

		System.out.println("Bạn đã rớt do có một điểm 0");
		return;

	}

}
