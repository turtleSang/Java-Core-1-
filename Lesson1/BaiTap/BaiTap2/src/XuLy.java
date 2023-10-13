import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class XuLy {

	public static void main(String[] args) {
		// Bước 1 Tạo hàm nhập
		Scanner nhap = new Scanner(System.in);

		// Bước 2: tạo hằng số tỷ giá, biến tienDollar và biến tienViet
		final int TY_GIA = 23500;
		long tienDollar;
		long tienViet;

		// Bước 3 in ra màn hình mời bạn nhập vào số tiền bạn muốn quy đổi và gán
		// tienDollar cho số vừa nhập
		System.out.println("Mời bạn nhập vào số tiền Dollar muốn quy đổi");
		tienDollar = Long.parseLong(nhap.nextLine());

		// Bước 4: Tính tienViet = TY_GIA*tienDollar
		tienViet = TY_GIA * tienDollar;

		// Bước 5 Xuất ra màn hình
		Locale locale = new Locale("en", "EN");
		String pattern = "###,###.##";
		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(locale);
		decimalFormat.applyPattern(pattern);
		System.out.println("Số tiền việt bạn quy đổi được là: " + decimalFormat.format(tienViet) + "đ");

	}

}
