package CasoP1Unidad4Programacion;

//Importamos la clase Figura para heredar sus atributos y metodos.

public class Rectangulo extends Figura {
	
	//Declaramos los atributos como privados.
	
	private double base;
	private double lado;

	//Constructor
	
	public Rectangulo(String color, String nombreFigura, double base, double lado) {
		
		//Calculamos el área y perímetro de nuestro objeto al añadir el constructor de la superclase "Figura".
		super(color, nombreFigura, base*lado, base*2+lado*2);
		
		this.base = base;
		this.lado = lado;
	}
	
	//Métodos Getter y setter
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	//Metodo que comprueba si es o no cuadrada y devuelve un booleano, que será verdadero si es cuadrada y falso si no es cuadrada.
	
	public boolean comprobarCuadrado(Rectangulo rec) {
		if(rec.getLado()==rec.getBase()) {
			return true;
		}else {
			return false;
		}
	}

}
