import java.util.*;
public class jun15 {  
    public static void neg&pos(int[] ary)
    {
    Arrays.sort(ary);
    }
    public static void main(String[] args)
    {
       int[] arr = {100,20,-6,18,-13,-15,20 };
        neg&pos(ary);
      //i used foreach lop here because its easy for me
        for (int x : ary)
            System.out.print(x + " ");
    }
}
