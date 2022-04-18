package Controller;

import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
        int factorial = 1;
        int nu;
        try (Scanner valor = new Scanner(System.in)) {
			System.out.println("Ingresar Numero: ");
			nu = valor.nextInt();
		}
        for (int i = nu; i > 0; i--) {
            factorial = factorial*i;
        }
        System.out.println("Resultado: " + factorial + " de " + nu+"!");
    }

}
