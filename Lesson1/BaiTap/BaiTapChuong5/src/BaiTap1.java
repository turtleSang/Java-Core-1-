import java.util.Scanner;

public class BaiTap1 {
	//Tạo Hằng số kéo búa bao tương ứng 1 2 3
	static final int KEO = 1;
	static final int BUA = 2;
	static final int BAO = 3;
	static Scanner scan = new Scanner(System.in);

	public BaiTap1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		play();

	}

	// Hàm chọn của người dùng
	public static int chonKeoBuaBaoNguoiDung() {
		System.out.println("Chọn vui lòng chọ Kéo Búa Bao");
		System.out.println("1 - Kéo");
		System.out.println("2 - Búa");
		System.out.println("3 - Bao");
		int luaChon = Integer.parseInt(scan.nextLine());
		switch (luaChon) {
		case KEO:
			System.out.println("Bạn chọn Kéo - " + luaChon);
			break;
		case BUA: 
			System.out.println("Bạn chọn Búa - "+ luaChon);
			break;
		case BAO:
			System.out.println("Bạn chọn Bao - " + luaChon);
			break;
		default:
			break;
		}
		return luaChon;
	}

	// Hàm chọn của máy
	public static int chonKeoBuaBaoMay() {
		int luaChon = (int) (Math.random() * 3 + 1);
		switch (luaChon) {
		case KEO:
			System.out.println("Máy chọn Kéo - " + luaChon);
			break;
		case BUA: 
			System.out.println("Máy chọn Búa - "+ luaChon);
			break;
		case BAO:
			System.out.println("Máy chọn Bao - " + luaChon);
			break;
		default:
			break;
		}
		return luaChon;
	}

	// Hàm thắng thua truyền vào  lựa chọn của người và máy, trả 0 hòa, 1 người thắng, 2 máy thắng
	public static int timThangThua(int luaChonNguoi, int luaChonMay) {
		//Tạo Hằng số hòa thắng thua
		final int HOA = 0;
		final int THANG =1;
		final int THUA = 2;
		//tạo biến win để trả về
		int win = 0;
		switch (luaChonNguoi) {
		case KEO:
			if (luaChonMay == KEO) {
				win = HOA;
			} else if (luaChonMay == BUA) {
				win = THUA;
			} else {
				win = THANG;
			} 
			break;
		case BUA: 
			if (luaChonMay == KEO) {
				win = THANG;
			} else if (luaChonMay == BUA) {
				win = HOA;
			} else {
				win = THUA;
			} 
			break;
		case BAO:
			if (luaChonMay == KEO) {
				win = 2;
			} else if (luaChonMay == BUA) {
				win = 1;
			} else {
				win = 0;
			} 
			break;
		default:
			break;
		}

		return win;
	}
	
	//Hàm chơi với vòng lặp
	public static void play() {
		int countNguoi = 0;
		int countMay = 0;
		int play = -1;
		do {
			
			int luaChonNguoi = chonKeoBuaBaoNguoiDung();
			int luaChonMay = chonKeoBuaBaoMay();
			int thangThua = timThangThua(luaChonNguoi, luaChonMay);
			
			if (thangThua == 1) {
				System.out.println("Bạn đã Thắng");
				countNguoi++;
			} else if(thangThua == 2) {
				System.out.println("Bạn đã Thua");
				countMay++;
			} else {
				System.out.println("Hòa");
			}
			System.out.println("Bấm số 0 để dừng và xem tỉ số  - Bấm số khác để tiếp tục chơi");
			play = Integer.parseInt(scan.nextLine());
		} while (play != 0);
		if (countNguoi>countMay) {
			System.out.println("Bạn đã thắng với tỉ số: " + countNguoi + " - " + countMay);
		}else if (countNguoi<countMay) {
			System.out.println("Máy đã thắng với tỉ số: " + countMay + " - " + countNguoi);
		} else {
			System.out.println("Bạn và Máy đã Hòa nhau với tỉ số: " + countNguoi + " - " + countMay);
		}
	}

}
