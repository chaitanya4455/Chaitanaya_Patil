
import java.util.*;
class swapping {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp;
     temp=a;
    a=b;
    b = temp;
    System.out.println("Value of a after swapping :"+a);
    System.out.println("Value of b after swapping :"+b);

    }
}