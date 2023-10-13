import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		
		final int STANDARD_TIME = 40;
		float time;
		float price;
		float payment;
		Scanner scan = new Scanner(System.in);

		System.out.println("Mời bạn nhập số giờ làm");
		time = Float.parseFloat(scan.nextLine());
		System.out.println("Mời bạn nhập tiền lương một giò");
		price = Float.parseFloat(scan.nextLine());

		if (time <= STANDARD_TIME) {
			payment = time*price;
		} else {
			payment = STANDARD_TIME*price + (time - STANDARD_TIME)*price*1.5f;
		}
		
		Locale locale = new Locale("en", "EN");
		String format = "###,###.##";
		DecimalFormat phanChiaThapPhan = (DecimalFormat)NumberFormat.getNumberInstance(locale);
		phanChiaThapPhan.applyPattern(format);
		
		System.out.println("Số tiền lương của bạn là: \t" + phanChiaThapPhan.format(payment) + "đ");

	}

}
