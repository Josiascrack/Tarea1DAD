package Controller;

public class Principal1 {

	public static void main(String[] args) {
        int i, x;
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int limite = num.length;

        System.out.print("Ascendentes: ");
        for (i = 0; i < limite; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Descendentes: ");

        for (x = limite - 1; x >= 0; x--) {
            System.out.print(num[x] + " ");
        }
    }
}
