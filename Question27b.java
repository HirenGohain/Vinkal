import java.util.Scanner;

public class Question27b {
    

    static int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("The fibbonaci Searies is:");
        for(int i=1;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    
}
