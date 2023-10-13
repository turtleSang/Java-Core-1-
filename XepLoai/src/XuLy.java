import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		// Bước 1 tạo hàm nhập và biến xepLoai, diemTrungBinh, diemToan, diemLy, diemHoa
		Scanner scan = new Scanner(System.in);

		float diemToan;
		float diemLy;
		float diemHoa;
		float diemTrungBinh;
		String xepLoai;
		String tenSinhVien;

		// Bước 2 in ra màn hình cho người dùng nhập vào diemToan diemLy diemHoa

		System.out.println("Vui lòng nhập họ tên");
		tenSinhVien = scan.nextLine();
		System.out.println("Vui lòng nhập vào điểm toán");
		diemToan = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào điểm lý");
		diemLy = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào điểm Hóa");
		diemHoa = Float.parseFloat(scan.nextLine());

		// Bước 3 tính điểm trung bình
		diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;

		// Bước 4 tạo câu điều kiện if else nếu điểm
		if (diemTrungBinh < 5) {
			xepLoai = "Yếu";
		} else if (diemTrungBinh < 6.5f) {
			xepLoai = "Trung Bình";
		} else if (diemTrungBinh < 8) {
			xepLoai = "Khá";
		} else {
			xepLoai = "Giỏi";
		}
		
		// Bước 5 xuất ra màn hình tên học sinh, điểm trung bình, học lực
		
		final int KHOANGCACH = -50;
		String text  = String.format("%1$" + KHOANGCACH +"s", "Tên-học-sinh").replace(' ', '.').replace('-', ' ');
		
		System.out.println(text + tenSinhVien);
		text  = String.format("%1$" + KHOANGCACH +"s", "Tên-học-sinh:").replace(' ', '.').replace('-', ' ');
		
		text  = String.format("%1$" + KHOANGCACH +"s", "Điểm-Trung-Bình:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + diemTrungBinh);
		
		text  = String.format("%1$" + KHOANGCACH +"s", "Xếp-Loại:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + xepLoai);
	}

}
