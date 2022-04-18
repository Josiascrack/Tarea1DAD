package Controller;

import Model.Leopardo1;
import Model.Leopardo2;
import Model.Leopardo3;
import Model.Leopardo4;

public class Principal4 {

	public static void main(String[] args) {
		Leopardo1 v1 = new Leopardo1 ("Leopardo1");
		Leopardo2 v2 = new Leopardo2 ("Leopardo2");
		Leopardo3 v3 = new Leopardo3 ("Leopardo3");
		Leopardo4 v4 = new Leopardo4 ("Leopardo4");
		v1.start();
		v2.start();
		v3.start();
		v4.start();
	}
}
