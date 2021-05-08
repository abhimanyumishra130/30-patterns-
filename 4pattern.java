import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int N=2*n-1;
        int a=n;

        for(int i=1;i<=N;i++){
            
            for(int k=a-1;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                
                System.out.print("*");
                 
            }
            System.out.println();
            i++;
            a-=1;
        }
        int b=1;
        for(int l=N-2;l>=1;l--){
            if(b<n){
            for(int m=1;m<=b;m++){
                System.out.print(" ");
            }
            }
            for(int p=1;p<=l;p++){
                System.out.print("*");
                
            }
            l--;
            b+=1;
            System.out.println();
        }
    }
}


/*

  *
 ***
*****
 ***
  *
  
  */
