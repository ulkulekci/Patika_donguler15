import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("fibonacci serisi");
        Scanner input=new Scanner(System.in);
        System.out.println("eleman sayisini giriniz:");
        int i=input.nextInt();
        int a=0, b=0, c=1, d;
        for (int j=1;j<=i;j++){
          a=b+c;
            System.out.println(""+b+"+"+c+"="+a);
          d=c;
          c=a;
          b=d;
        }
    }
}
