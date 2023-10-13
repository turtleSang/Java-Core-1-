import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = switched(4);
		System.out.println(i);
	}

	public static int switched(int x) {
		int j = 1;
		switch (x) {
		case 1:
			j++;
		case 2:
			j++;
		case 3:
			j++;
		case 4:
			j++;
		case 5:
			j++;
		default:
			j++;
		}
		return j + x;
	}
}
