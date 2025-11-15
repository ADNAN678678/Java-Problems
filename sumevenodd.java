import java.util.*;
public class sumevenodd{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int even=0;
       int odd=0;
       for(int i=0;i<n;i++){
           if(i%2==0){
               even=even+i;
           }else{
           odd=odd+i;
       }
       }
       System.out.println(even);
       System.out.println(odd);
    }
}