import java.util.Scanner;

public class BaiTap1 {
	// Tạo phương thức nhập scan
	static Scanner scan = new Scanner(System.in);

	public BaiTap1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Nhập vào thông tin điểm toán điểm lý điểm hóa, khu vực và đối tượng
		float diemToan = nhapDiem("Điểm Toán");
		float diemLy = nhapDiem("Điểm Lý");
		float diemHoa = nhapDiem("Điểm Hóa");
		float diemChuan = nhapDiem("Điểm chuẩn");
		String khuVuc = nhapThongTinKhuVuc();
		String doiTuong = nhapThongTinDoiTuong();
		float diemXetDuyet = tinhDiemXetDuyet(diemToan, diemLy, diemHoa, khuVuc, doiTuong);
		boolean check = kiemTra(diemXetDuyet, diemChuan);
		
		if (check) {
			System.out.println("Tổng điểm của bạn là: " + diemXetDuyet + " điêm - Bạn đã đậu");
		} else {
			System.out.println("Tổng điểm của bạn là: " + diemXetDuyet +" điểm - Bạn đã rớt");
		}

	}

	// Hàm nhập điểm chuẩn
	public static float nhapDiem(String thongtin) {
		System.out.print("Mời bạn nhập vào " + thongtin + ":");
		float diemChuan = Float.parseFloat(scan.nextLine());
		return diemChuan;
	}

	// Hàm nhập thông tin khu vực
	public static String nhapThongTinKhuVuc() {
		System.out.println("Mời bạn nhập vào thông tin khu vực ưu tiên:");
		System.out.println("A - Khu Vực A");
		System.out.println("B - Khu Vực B");
		System.out.println("C - Khu Vực C");
		System.out.println("x - Không thuộc khu vực ưu tiên ");
		String khuVuc = scan.nextLine();
		return khuVuc;
	}

	// hàm nhập thông tin đối tượng
	public static String nhapThongTinDoiTuong() {
		System.out.println("Mời bạn nhập vào thông tin đối tượng ưu tiên:");
		System.out.println("1 - Đối tượng 1");
		System.out.println("2 - Đối tượng 2");
		System.out.println("3 - Đối tượng 3");
		System.out.println("x - Không thuộc đối tượng ưu tiên ");
		String khuVuc = scan.nextLine();
		return khuVuc;
	}

	// Hàm tính điểm tổng 3 môn
	public static float tinhDiemTong(float diemToan, float diemLy, float diemHoa) {
		float diemTong = diemToan + diemLy + diemHoa;
		return diemTong;
	}

	// Hàm tính điểm ưu tiên theo khu vực
	public static float tinhDiemKhuVuc (String khuVuc) {
		float diemKhuVuc = 0;
		switch (khuVuc) {
		case "A":
		case "a":
			diemKhuVuc = 2;
			break;
		case "B":
		case "b":
			diemKhuVuc = 1.5f;
			break;
		case "C":
		case "c":
			diemKhuVuc = 0.5f;
			break;
		default:
			break;
		}
		return diemKhuVuc;
	}

	// Hàm tính điểm ưu tiên theo đối tượng
	public static float tinhDiemDoiTuong(String doiTuong) {
		float diemDoiTuong = 0;
		switch (doiTuong) {
		case "1":
			diemDoiTuong = 2.5f;
			break;
		case "2":
			diemDoiTuong = 1.5f;
			break;
		case "3":
			diemDoiTuong = 1;
			break;
		default:
			break;
		}
		return diemDoiTuong;
	}

	// Hàm tính điểm xét duyệt
	public static float tinhDiemXetDuyet(float diemToan, float diemLy, float diemHoa, String khuVuc, String doiTuong) {
		float diemXetDuyet = tinhDiemTong(diemToan, diemLy, diemHoa) + tinhDiemDoiTuong(doiTuong)+ tinhDiemKhuVuc(khuVuc);
		return diemXetDuyet;
	}
	// Hàm kiểm tra điểm
	public static boolean kiemTra (float diemXetDuyet, float diemChuan) {
		boolean check = true;
		if (diemXetDuyet < diemChuan) {
			check = false;
		}
		return check;
	}
}
