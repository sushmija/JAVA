import java.util.*;
class MaxMinMode_Array{
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<a+1;i++){
            arr.add(sc.nextInt());
        }
        
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println("enter nth maximum index");
        int Max=sc.nextInt();
        System.out.println("enter nth minimum index");
        int Min=sc.nextInt();
        int Max1=arr.get(a-Max),Min1=arr.get(Min-1);
        System.out.println( a-Max+ " th maximum number is"+ " "+Max1);
        System.out.println(Min-1+" th minimum number is"+ " "+Min1);
        int Sum=Integer.sum(Max1,Min1);
        int Diff=Max1-Min1;
        System.out.println("Sum is "+Sum);
        System.out.println("Difference is "+Diff);
        sc.close();
    }
}