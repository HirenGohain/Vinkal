import java.util.Scanner;

public class Question28b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Make an array of user input of size 10th and count and print all even number from array;

        int [] arr = new int[10];
        System.out.println("Enter array elements (type: integer; size: 10;)");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of array are:");
        for(int element: arr){
            System.out.print(element+" ");
        }

        int count=0;
        System.out.println("\nThe even elements of array are:");
        for(int element: arr){
            if(element%2==0){
                System.out.print(element+" ");
                count+=1;
            }
        }
        System.out.println("\nThe total numbers of even elements in array are: "+count);

    }
}
