import java.util.Date;
import java.util.Scanner;

public class B4_ChuyenNhietDo {
    static void celsiusToFahrenheit(){
        Scanner sc= new Scanner(System.in);
        double c;
        System.out.println("Nhap nhiet do hien tai(do C):");
        c = sc.nextDouble();
        double f = c/(5.0/9)+32;
        System.out.println("Nhiet do do f la:"+f);
    }
    static void fahrenheitToCelsius(){
        Scanner sc= new Scanner(System.in);
        double f;
        System.out.println("Nhap nhiet do hien tai(do F):");
        f = sc.nextDouble();
        double c;
        c = (5.0/9)*(f+32);
        System.out.println("Nhiet do do C la:"+c);
    }
    public static void main(String[] args) {
        celsiusToFahrenheit();
        fahrenheitToCelsius();
    }
}
