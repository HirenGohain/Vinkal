import java.util.Scanner;

public class Question28last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        System.out.println("Enter the elements of array (type: int; size: 10;)");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a multiplying factor");
        int mf = sc.nextInt();

        System.out.println("The array elements before multiplied with multiplying factor:");
        for(int element:arr){
            System.out.print(element+" ");
        }

        System.out.println("\nThe array elements before multiplied with multiplying factor:");
        for(int element:arr){
            System.out.print(element*mf+" ");
        }
    }
    
}
