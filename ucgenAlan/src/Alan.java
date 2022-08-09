import java.util.Scanner;

public class Alan {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("üçgenin kenarlarını giriniz");
        System.out.print("a kenarı giriniz: ");
        int a = input.nextInt();
        System.out.print("b kenarı giriniz: ");
        int b = input.nextInt();
        System.out.print("c kenarı giriniz: ");
        int c = input.nextInt();

        double u = (a+b+c) / 2;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println(alan);
    }
}
