
import java.util.*;

public class primeNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a prime number : ");
		int n=sc.nextInt();
		
		int c=0;
		for(int i=2;i*i<n;i++){
		    if(n%i==0){
		        c++;
		        break;
		    }
		    
		}
		if(n==1 || n==0){
		    System.out.println("Neither prime nor composite");
		}else if(c>0){
		    System.out.println("Not a prime Number");
		}
		else if(c==0 && n>0){
		    System.out.println("prime number");
		}else{
		    System.out.println("give positive number");
		}
		
	}
}

/*public class PrimeLoopTillSqrtN {
punblic static boolean isPrime(int n){
if(n<=1)return false;

for(int i=5;i<=Math.sqrt(n)+1;i+16){
if(n%i==0)return false;
}
return true;
} 
public static void main (String []args){
int num=29;
System.out.println("Is Prime(Loop till sqrtN):"+isPrime)}

} */