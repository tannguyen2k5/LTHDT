package allbt;
import java.util.Scanner;
public class bt6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu trong mang:");
		
		int n = scanner.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Nhap cac phan tu trong mang:");
		for(int i = 0; i<n; i++){
		arr[i] = scanner.nextInt();
		}
		int max = arr[0];
		
		for(int i=1;i<n;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.print("So nguyen lon nhat trong mang la:" + max);
		scanner.close();
	}
}
