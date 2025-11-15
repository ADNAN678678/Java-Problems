import java.util.*;
public class palindrome{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int r=0;
        while(n!=0){
            int t=n%10;
            r=r*10+t;
            n=n/10;
        }
        if(original==r){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}