package CasoP1Unidad4Programacion;
import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		//Usaremos un bucle "do while" para que el usuario introduzca una opción y que ésta sea válida(1 o 2).
		
		do {
		System.out.println("       FIGURAS PLANAS");
		System.out.println("-----------------------------");
		System.out.println("1: Crear un triángulo");
		System.out.println("2: Crear un rectángulo");
		opcion = sc.nextInt();
		
		//En este condicional, comprobaremos si la opción es o no válida.
		
		if(opcion<0 || opcion >4) {
			System.out.println("Por favor, elija una opcion válida");
		}
		}while(opcion<0 || opcion >4);
		
	
		//Utilizaremos un Switch que nos permitirá realizar la opción pedida por el usuario anteriormente.
		
		switch(opcion) {
		
		/* En el primer caso, crearemos un objeto llamado "miTriangulo" con las medidas pedidas por el ejercicio y 
		 * seguidamente informaremos al usuario sobre las características de su objeto creado.
		 */
		
		case 1:
			
			//Creamos el objeto
			Triangulo miTriangulo = new Triangulo("verde","miTriángulo",8,8,8,6.93);
			
			//Invocamos el metodo "dimeCaracterísticas" para mostrar la información del objeto creado.
			miTriangulo.dimeCaracterísticas(miTriangulo);
			break;
			
		/* En el segundo caso, crearemos un objeto llamado "miRectangulo" con medidas pedidas al usuario por teclado,
		 * mostraremos el área y perímetro del mismo y por último comprobaremos si nuestra figura es o no cuadrada.
		 */
			
		case 2:
			System.out.println("Introduzca la longitud del primer lado ");
			double primerLado = sc.nextDouble();
			System.out.println("Introduzca la longitud del segundo lado ");
			double segundoLado = sc.nextDouble();
			System.out.println("Introduzca el color de la figura ");
			String color = sc.nextLine();
			
			//Creamos el objeto
			Rectangulo miRectangulo = new Rectangulo(color,"miRectangulo",primerLado,segundoLado);
			
			//Mostramos la información pedida por el ejercicio
			System.out.println("El área de "+miRectangulo.getNombreFigura()+" es de "+miRectangulo.getArea()+"cm");
			System.out.println("El perímetro de "+miRectangulo.getNombreFigura()+" es de "+miRectangulo.getPerimetro()+"cm");
			
			//Por último, comprobamos si la figura es o no cuadrada e informamos al usuario
			if(miRectangulo.comprobarCuadrado(miRectangulo)==true) {
				System.out.println("La figura creada es cuadrada ");
			}else {
				System.out.println("La figura no es cuadrada");
			}
			break;
			}
		sc.close();
	}
}
