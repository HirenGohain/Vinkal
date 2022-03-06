import java.util.Scanner;

class Question28a {
    public static void main(String[] args) {

        /*Create an array with user input of size 10 and and find the sum of
        all elements in array as well as middle elements of array */
        
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        
        System.out.println("Enter the array elements (size: 10; type: integer;)");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array elements are:");
        for(int a:arr){
            System.out.print(a+" ");
        }

        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        System.out.println("\nThe sum of all array elements are: "+sum);

        System.out.println("The middle element of array is: "+arr[arr.length/2]);
    }
    
}
