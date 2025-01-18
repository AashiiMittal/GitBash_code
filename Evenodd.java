import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n =sc.nextInt();
        System.out.println("Even Numbers: ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i);
            }
        }
        System.out.println("Odd Numbers: ");
        for(int j=1;j<=n;j++){
            if(j%2!=0){
                System.out.print(j);
            }
        }
    }
}

