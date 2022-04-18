package Controller;

import java.text.DecimalFormat;

public class Principal2 {

	 public static void main(String[] args) {

	        double num[] = {2, 7, 5, 4, 9, 3, 6, 8, 1, 10};
	        double cubo, sumacubo = 0, limite = num.length;

	        for (int i1 = 0; i1 < limite; i1++) {
	            cubo = Math.pow(num[i1], 3);
	            sumacubo = sumacubo + cubo;
	            DecimalFormat df = new DecimalFormat("#");
	        }
	        DecimalFormat df = new DecimalFormat("#");
	        System.out.println("La suma de cubos de: 2, 7, 5, 4, 9, 3, 6, 8, 1, 10");
	        System.out.println("Suma de Cubos : " + df.format(sumacubo));
	    }
}
