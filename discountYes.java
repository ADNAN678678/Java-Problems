import java.util.*;
public class discountYes{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        if(n>1000){
            n=n-(n*0.10);
            System.out.println(n);
        }
            
        else if(n>500 && n<1000){
            n=n-(n*0.05);
            System.out.println(n);
        }else {
            System.out.println("NO discount :"+n);
        }
        
       String s=sc.next();
       if(s.equals("yes")){
           double z=n-(n*0.05);
           System.out.println(z);
       }else {
           
           System.out.println(n);
       }
    }
}