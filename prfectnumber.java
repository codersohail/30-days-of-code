//to know the perfect number 
//perfect number means the sum of the factors of that number excluding that number is equal to that number is called the perfect number
import java.util.Scanner;

public class PerfectNumber{
	private static Scanner sc;
	
	public static void main(String[] args) {
		int i, Number, Sum = 0 ;
		sc = new Scanner(System.in);		
		System.out.println(" Enter a  Number: ");
		Number = sc.nextInt();
		for(i = 1 ; i < Number ; i++) {
			if(Number % i == 0)  {
				Sum = Sum + i;
			}
		}
		if (Sum == Number) {
			System.out.format(" Perfect Number"+ Number);
		}
		else {
			System.out.format(" is NOT a Perfect Number" + Number);
		}
	}
}
