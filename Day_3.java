/*
   30 Days Code Challenge 
   Pyramid Pattern Program in Java
*/
import java. util. *;
public class Day_3
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System . in);
		System . out.print("Enter Total Number Of Stars : ");
		int  n = s.nextInt();
		for(int i =0;i<n;i++){
		    for(int j = 0;j<i;j++){
		        System . out.print("*"+" ");
		    }
		    System . out .println();
		}
		System . out. println("Done By : Sohail Coder");
	}
}
