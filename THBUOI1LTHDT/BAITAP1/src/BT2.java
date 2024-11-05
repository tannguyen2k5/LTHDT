import java.util.Scanner;

public class BT2 {

	public static void main(String[] args) {
		    
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Nhap c: ");
		        double c = scanner.nextDouble();

		        System.out.println("Nhap d: ");
		        double d = scanner.nextDouble();

		        if (c == 0) {
		            if (d == 0) {
		                System.out.println("PT CO VSN.");
		            } else {
		                System.out.println("PT VN.");
		            }
		        } else {
		            double x = -d / c;
		            System.out.println("NGHIEM CUA PT LA: " + x);
		        }

		        scanner.close();
		    }
		}


