package BAITAP;
import java.util.Scanner;
public class BT2 {

	public static void main(String[] args) {
		float a, b, x;
		Scanner Scanner = new Scanner (System.in);
		System.out.print("Nhap a:");
		a = Scanner.nextFloat();
		System.out.print("Nhap b:");
		b = Scanner.nextFloat();
		x = -b/2*a;
		if(a!=0)
		{
			System.out.print("PT co nghiem "+x);
		}else {
			if(b==0) {
				System.out.print("PT co VSN "+x);
			}else {
				System.out.print("PT VN ");
			}
		}
	}

}
