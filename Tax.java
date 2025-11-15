import java.util.*;
public class Tax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       
        if(a<b){
            System.err.println("No Tax");
        }else if(a>b && a<b){
            System.err.println("10%Tax");
        }else{
            System.err.println("20%tax");
        }
    }
}

