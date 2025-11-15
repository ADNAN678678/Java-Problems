import java.util.*;
public class market{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println("up");
        }else if(a==0){
            System.out.println("Stable");
        }else {
            System.out.println("down");
        }
       
    }
}

