import java.util.Scanner;

import com.sun.org.apache.xml.internal.utils.IntVector;

public class XuLy {
	static final  int GARB_CAR_1KM = 8000;
	static final  int GARB_SUV_1KM = 9000;
	static final  int GARB_BLACK_1KM = 10000;
	
	static final  int GARB_CAR_1TO_19 = 7500;
	static final  int GARB_SUV_1TO_19 = 8500;
	static final  int GARB_BLACK_1TO_19 = 9500;
	
	static final  int GARB_CAR_UPPER_19 = 7500;
	static final  int GARB_SUV_UPPER_19 = 8500;
	static final  int GARB_BLACK_UPPER_19 = 9500;
	
	static final  int GARB_CAR_WAIT = 2000;
	static final  int GARB_SUV_WAIT = 3000;
	static final  int GARB_BLACK_WAIT = 4000;
	
	public static void main(String[] args) {
		
		
	}
	
	//HÀM NHẬP LOẠI
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
	
	public static float tinhTienKmDauTien (int loaiGrab) {
		float tien = 0;
		switch (loaiGrab) {
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
	


}
	
	

