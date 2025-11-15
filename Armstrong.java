import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int OriginalNumber=n;
        int sum=0;
        int numofdigits=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            numofdigits++;
            
        }
        temp=OriginalNumber;
        while(temp>0){
            int z=temp%10;
            sum+=Math.pow(z,numofdigits);
            temp=temp/10;
        }
        if(sum==OriginalNumber){
            System.out.println("Armstrong");
        }else{
            System.out.println("NOT");
        }
        
    }
}