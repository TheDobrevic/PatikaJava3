import java.util.Scanner;

public class Ucgeninalani {
    public static void main(String[] args) {
        int a,b,c, u,Alan;
        Scanner klavye = new Scanner(System.in);
        System.out.print("L�tfen ��genin birinci kenar�n� giriniz: ");
        a = klavye.nextInt();
        System.out.print("L�tfen ��genin ikinci kenar�n� giriniz: ");
        b = klavye.nextInt();
        System.out.print("L�tfen ��genin �c�nc� kenar�n� giriniz: ");
        c = klavye.nextInt();

        u= (a+b+c)/2;
        Alan = (u*(u-a)*(u-b)*(u-c))^(1/2);

        System.out.println("u: "+u);
        System.out.println("Ucgenin alani: "+Alan);
    }
}