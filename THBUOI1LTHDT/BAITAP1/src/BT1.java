import java.util.Scanner;


public class BT1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        
        // Prompt the user for input 
        System.out.print("Nhap a: "); 
        int num1 = scanner.nextInt(); 
         
        System.out.print("Nhap b: "); 
        int num2 = scanner.nextInt(); 
         
        // Determine the largest number 
        int largest; 
        if (num1 > num2) { 
            largest = num1; 
        } else { 
            largest = num2; 
        } 
         
        // Display the largest number 
        System.out.println("So lon nhat la: " + largest); 
         
        // Close the scanner 
        scanner.close(); 
    } 

}