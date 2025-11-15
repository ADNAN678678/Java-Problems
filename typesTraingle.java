import java.util.*;
public class typesTraingle{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c && c==a){
            System.out.println("Equilateral Triangle");
        }else if(a!=b &&b!=c && c!=a){
            System.out.println("Scalar Traingle");
        }else {
            System.out.println("Iso Traingle");
        }
       
    }
}