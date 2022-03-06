import java.util.Scanner;

public class Question27c {

    int a,b;

    void swap(Question27c ob){
        ob.a = ob.a + ob.b;
        ob.b = ob.a - ob.b;
        ob.a = ob.a - ob.b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question27c obj = new Question27c();
        System.out.println("Swap two number");
        System.out.print("enter num1:");
        obj.a= sc.nextInt();
        System.out.print("enter num2:");
        obj.b= sc.nextInt();
        System.out.println("Before swapping:\n num1:"+obj.a+" num2: "+obj.b);
        obj.swap(obj);
        System.out.println("After swapping:\n num1:"+obj.a+" num2: "+obj.b);
    }
    
}
