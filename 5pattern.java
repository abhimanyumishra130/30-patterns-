import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n;
         for(int i=1;i<=n;i++){
             for(int j=a;j>=1;j--){
                 System.out.print("* ");
             }
             System.out.println();
             a--;
         }
       
    }
}

/*

* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
