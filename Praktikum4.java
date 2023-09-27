package OperatorpadaJava;
import java.util.Scanner;
public class Praktikum4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi
        double pi = 3.141592;
        double r;
        //Input
        System.out.print("Jari-jari:");r=input.nextDouble();
        //Output
        int luas = (int) (pi*r*r);
        System.out.println("Luas lingkaran = " + luas);
    }
}
