import java.util.Scanner;
public class insertinganelement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,p,e;
        System.out.println("enetr how many elements you want");
        n=sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();}
        System.out.println("Enter  the position place i array:");
        p=sc.nextInt();
        System.out.println("enter the element you want to add in th array");
        e=sc.nextInt();
        for(int i=n-1;i>=p-1;i--){
            a[i+1]=a[i]; }
        a[p]=e;
        System.out.println("values after insrted");
        for(int j=0;j<=n;j++){
            System.out.println(a[j]+" ");
        }

    }
}
