import java.util. *;
public class Happynum
{
public static Boolean checkHappyNumber(int number)
{
Set<Integer> digits=new HashSet<Integer>();
while(digits.add(number))
{
int result = 0;
while(number > 0)
{
result += Math.pow(number % 10, 2);
number = number/10;
}
number = result;
}
return number == 1;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println ("Enter a non-zero integer number :");
int number = sc.nextInt();
System.out.println(checkHappyNumber(number)?"It is a Happy Number":"It is an Unhappy Number");
}
}
