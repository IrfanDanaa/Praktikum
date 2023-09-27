package OperatorpadaJava;
import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Deklarasi
        double panjang, lebar, tinggi;
        //Input
        System.out.print("Masukkan panjang:");panjang=input.nextDouble();
        System.out.print("Masukkan lebar:");lebar=input.nextDouble();
        System.out.print("Masukkan tinggi:");tinggi=input.nextDouble();
        //Output
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume balok = " + volume);
    }
}
