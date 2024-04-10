package tareaIterando;

public class bucleDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0;
        int contador = 1;
        
        do {
            suma += contador; 
            contador++; 
        } while (contador <= 10);

        System.out.println("La suma de los números del 1 al 10 es: " + suma);
	}

}
