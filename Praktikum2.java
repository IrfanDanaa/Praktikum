package OperatorpadaJava;
import java.util.Scanner;
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan integer:");bilangan=input.nextInt();
        String huruf = (bilangan % 2 == 0)? "Genap":"Ganjil";
        System.out.println(huruf);
    } 
}
