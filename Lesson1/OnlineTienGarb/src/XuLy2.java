import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class XuLy2 {
	static final int GARB_CAR_1KM = 8000;
	static final int GARB_SUV_1KM = 9000;
	static final int GARB_BLACK_1KM = 10000;

	static final int GARB_CAR_1TO_19 = 7500;
	static final int GARB_SUV_1TO_19 = 8500;
	static final int GARB_BLACK_1TO_19 = 9500;

	static final int GARB_CAR_UPPER_19 = 7500;
	static final int GARB_SUV_UPPER_19 = 8500;
	static final int GARB_BLACK_UPPER_19 = 9500;

	static final int GARB_CAR_WAIT = 2000;
	static final int GARB_SUV_WAIT = 3000;
	static final int GARB_BLACK_WAIT = 3500;

	public XuLy2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int loai = chonGrab();
		float km = nhapKm();
		int time = nhapTime();
		inChitiet(loai, km, time);
	}

	// Hàm nhập loai
	public static int chonGrab() {
		int loai;
		Scanner nhap = new Scanner(System.in);
		System.out.println("Vui Lòng chọn loại Garb");
		System.out.println("1.Car");
		System.out.println("2.Suv");
		System.out.println("3.Black");
		loai = Integer.parseInt(nhap.nextLine());
		return loai;

	}

	// Hàm nhập thời gian chờ
	public static int nhapTime() {
		System.out.println("Mời bạn nhập số phút chờ");
		Scanner scan = new Scanner(System.in);
		int time = Integer.parseInt(scan.nextLine());
		return time;
	}

	// Hàm nhập số km
	public static float nhapKm() {
		float soKm;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào số km");
		soKm = Float.parseFloat(scan.nextLine());
		return soKm;
	}

	// Hàm tính km đàu tiên
	public static float tinhTienKmDauTien(int loaiGarb) {
		float tien = 0;
		switch (loaiGarb) {
		case 1:
			tien = GARB_CAR_1KM;
			break;
		case 2:
			tien = GARB_SUV_1KM;
			break;
		case 3:
			tien = GARB_BLACK_1KM;
		default:
			break;
		}
		return tien;

	}

	// Hàm tính km tới 19
	public static float tinhKmDen19(float km, int loaiGarb) {
		float tien = 0;
		switch (loaiGarb) {
		case 1:
			tien = GARB_CAR_1KM + (km - 1) * GARB_CAR_1TO_19;
			break;
		case 2:
			tien = GARB_SUV_1KM + (km - 1) * GARB_SUV_1TO_19;
			break;
		case 3:
			tien = GARB_BLACK_1KM + (km - 1) * GARB_BLACK_1TO_19;
		default:
			break;
		}
		return tien;
	}

	// Hàm tính km hơn 19
	public static float tinhKmHon19(float km, int loaiGarb) {
		float tien = 0;
		switch (loaiGarb) {
		case 1:
			tien = GARB_CAR_1KM + GARB_CAR_1TO_19 * 18 + (km - 19) * GARB_CAR_UPPER_19;
			break;
		case 2:
			tien = GARB_SUV_1KM + 18 * GARB_SUV_1TO_19 + (km - 19) * GARB_SUV_UPPER_19;
			break;
		case 3:
			tien = GARB_BLACK_1KM + 18 * GARB_BLACK_1TO_19 + (km - 19) * GARB_BLACK_UPPER_19;
		default:
			break;
		}
		return tien;
	}

	// Hàm tính tiền chờ
	public static float tinhTienCho(int time, int loaiGarb) {
		int tiencho = 0;
		int soLanTinh = Math.round(time * 1.0f / 3);
		switch (loaiGarb) {
		case 1:
			tiencho = soLanTinh * GARB_CAR_WAIT;
			break;
		case 2:
			tiencho = soLanTinh * GARB_SUV_WAIT;
			break;
		case 3:
			tiencho = soLanTinh * GARB_BLACK_WAIT;
		default:
			break;
		}
		return tiencho;
	}

	// Hàm tính tiền trả
	public static float tinhTienTra(int loaiGarb, float soKm, int time) {
		float tienTra =0;
		if(soKm <= 1) {
		 tienTra = tinhTienKmDauTien(loaiGarb);
		} else if (soKm<=19) {
			tienTra = tinhKmDen19(soKm, loaiGarb);
		} else {
			tienTra = tinhKmHon19(soKm, loaiGarb);
		}
		tienTra += tinhTienCho(time, loaiGarb);
		return tienTra;
	}
	
	//Hàm in ra KM đầu tiên
	public static void inKm1 (float soKm, int loaiGarb) {
		int donGia = 0;
		switch (loaiGarb) {
		case 1:
			donGia = GARB_CAR_1KM;
			break;
		case 2: 
			donGia = GARB_SUV_1KM;
		case 3:
			donGia = GARB_BLACK_1KM;
		default:
			break;
		}
		 if (soKm < 1) {
			System.out.println("Km đầu tiên \t\t" + soKm + "\t\t" + donGia + "\t\t\t" + donGia);
		} else {
			System.out.println("Km đầu tiên \t\t" + 1 + "\t\t" + donGia + "\t\t\t" + donGia);
		}
	}

	//Hàm in ra Km thứ hai
	public static void inKm1To19(float soKm, int loaiGarb) {
		int donGia = 0;
		switch (loaiGarb) {
		case 1:
			donGia = GARB_CAR_1TO_19;
			break;
		case 2: 
			donGia = GARB_SUV_1TO_19;
		case 3:
			donGia = GARB_BLACK_1TO_19;
		default:
			break;
		}
		if ( soKm < 19) {
			//Số km < 19
			
			System.out.println("Từ 2 km đến: " + soKm + "\t\t" + (soKm -1) + "\t\t\t" + donGia + (soKm-1)*donGia );
		} else {
			System.out.println("Từ 2 km đến: 18" + "\t\t" + 18 + "\t\t\t" + donGia + 18*donGia );
		}
	}
	
	//Hàm in ra km cuối
	public static void inKmUpper19(float soKm, int loaiGarb) {
		int donGia = 0;
		switch (loaiGarb) {
		case 1:
			donGia = GARB_CAR_UPPER_19;
			break;
		case 2: 
			donGia = GARB_SUV_UPPER_19;
		case 3:
			donGia = GARB_BLACK_UPPER_19;
		default:
			break;
		}
		System.out.println("Từ 19 km đến" + soKm + "\t\t" + (soKm -19) + "\t\t\t" +  (soKm -19)*donGia );
	}
	
	//Hàm in thời gian chờ
	public static void inThoiGianCho(int loaiGrab, int time) {
		int donGia = 0;
		switch (loaiGrab) {
		case 1:
			donGia = GARB_CAR_WAIT;
			break;
		case 2: 
			donGia = GARB_SUV_WAIT;
		case 3:
			donGia = GARB_BLACK_WAIT;
		default:
			break;
		}
		float tienCho = tinhTienCho(time, loaiGrab);
		System.out.println("Thời gian chờ: \t\t" + time + "\t\t" + donGia + "\t\t\t" + tienCho);
	}
	
	//Hàm in chi tiết
	public static void inChitiet(int loaiGarb, float soKm, int thoiGianCho) {
		System.out.println("+++++++++++++++++++++++Chi tiêt hóa đơn+++++++++++++++++++++++++++");
		System.out.println("Sử dụng \t Sử dụng \t Đơn Giá \t Thành Tiền");
		if (soKm <1) {
			inKm1(soKm, loaiGarb);
		} else if (soKm > 1 && soKm <19) {
			inKm1To19(soKm, loaiGarb);
		} else {
			inKmUpper19(soKm, loaiGarb);
		}
		inThoiGianCho(loaiGarb, thoiGianCho);
		float tongTien = tinhTienTra(loaiGarb, soKm, thoiGianCho);
		System.out.println("------------------------------------------------------------------");
		System.out.println("Tổng tiền là: \t" + tongTien);
	}
}
