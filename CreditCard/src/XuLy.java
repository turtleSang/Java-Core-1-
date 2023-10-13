import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final float INTEREST = 1.5f;
		float creditCardBalance;
		float payment;
		float penatly = 0;
		
		System.out.println("Vui lòng nhập vào dư nợ thẻ tín dụng");
		creditCardBalance = Float.parseFloat(scan.nextLine());
		System.out.println("Vui lòng nhập vào số tiền bạn đã thanh toán");
		payment = Float.parseFloat(scan.nextLine());
		
		if(payment<creditCardBalance)
			penatly = (creditCardBalance - payment)*INTEREST/100;
		System.out.println("Số tiền phạt mà bạn phải chịu là: "+penatly);
	}

}
