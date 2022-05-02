import java.util.Scanner;
public class Interface {
    public static void main( String[] args ) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base number");
        int n=sc.nextInt();
        System.out.println("enter power number");
        int m= sc.nextInt();
        Calc c=new Calc();
        System.out.println(n+" to the power of "+m+"="+c.power( n,m ));
        System.out.println("factorial of n = "+c.fact( n ));
    }
}
