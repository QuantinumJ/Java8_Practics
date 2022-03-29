package aprenderemosAfondo;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TestListaGenerica {
 static ListaGenrica<String> lista = new ListaGenrica<String>(5);
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
lista.añadir("primero");
lista.añadir("segundo");
lista.añadir("tercer");
lista.añadir("cuarto");
lista.añadir("quinto");

menu();
	}
	public static void menu() {
		char seleccion = '\0';
		System.out.println("p (primero) < (anterior) >(siguiente)u (ultimo) f (fin)");
		while(seleccion != 'f') {
			try {
				BufferedReader br;
				br = new BufferedReader(new InputStreamReader(System.in));
				seleccion = br.readLine().charAt(0);
				switch (seleccion) {
				case 'p':
					System.out.println("el primero "+ lista.primero());
					break;
				case '<':
					System.out.println("el anterior "+ lista.anterior());
					break;
				case '>':
					System.out.println("el siguiente "+ lista.siguiente());
					break;
				case 'u':
					System.out.println("el ultimo "+ lista.ultimo());
					break;
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("p (primero) < (anterior) > (siguiente) u (ultimo) f (fin)");
		}
	}

}
