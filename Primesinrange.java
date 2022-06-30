import java.util.*;

public class Primesinrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the range to find the prime numbers in between:");
        int l = sc.nextInt();
        int h = sc.nextInt();
        for (int i = l; i <= h; i++) {
            int count = 0;
            for (int div = 2; div*div<= i; div++) {
                if (i%div == 0) {
                    count++;
                    break;
                }
            }
                if (count == 0) {
                    if(i==1){
                        continue;
                    }
                    else
                    System.out.println(i);
                }
            }
        }
    }

