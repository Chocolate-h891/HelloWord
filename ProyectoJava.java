package HolaMundo;
import java.util.Scanner;
public class ProyectoJava {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("Isabella Medina Molina");
        System.out.println("1.A");

        System.out.println("Dame tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        System.out.println("Tu edad es:" + edad);
    }
}