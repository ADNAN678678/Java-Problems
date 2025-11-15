
import java.util.*;
public class antidiagnol
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int [][] arr=new int[row][col];
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        if(i+j==row-1){
		            System.out.println(arr[i][j]);
		        }
		    }
		}
	}
}