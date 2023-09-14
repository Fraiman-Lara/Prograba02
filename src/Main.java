import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       final double TASA_DOLAR = 56.25;
       double monto;
       double total;
       String usuario;
        Scanner scanner = new Scanner(System.in);

       System.out.println("Ingrese su nombre");
       usuario = scanner.nextLine();

        System.out.println("Ingrese el monto que desea convertir a pesos");
        monto = scanner.nextDouble();

        total = TASA_DOLAR * monto;
        System.out.println("bienvenido " + usuario);
        System.out.println("La conversion es RD$" + total);


    }
}

