/*
    Java Program To Search a Element in Array

*/

import java . util.*;
public class Main{
    public static boolean Search(int [] arr , int n,int Ele){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == Ele){
                
                return true;
                
            }
            
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System . in);
        System . out.print("Enter The Size Of Array : ");
        int n = s.nextInt();
        int [] arr = new int[n];
        System . out.println("Enter Array Elements : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System .out.print("Enter the Element that to be Searched : ");
        int Ele = s.nextInt();
        boolean found = Search(arr, n,Ele);
        if(found){
            System . out.println("Element Found ");
        }
        else{
            System . out.println("Oops !..Element Not Found ");
        }
    }
}
