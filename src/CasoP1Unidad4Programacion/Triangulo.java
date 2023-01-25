package CasoP1Unidad4Programacion;

//Importamos la clase Figura para heredar sus atributos y metodos.

public class Triangulo extends Figura {

	//Declaramos los atributos como privados.
	
	private double ladoIzquierdo;
	private double ladoDerecho;
	private double base;
	private double altura;
	
	//Constructor
	
	public Triangulo(String color, String nombreFigura, double ladoIzquierdo, double ladoDerecho, double base, double altura ) {
		
		//Calculamos el área y perímetro de nuestro objeto al añadir el constructor de la superclase "Figura".
		super(color, nombreFigura, base*altura, ladoIzquierdo+ladoDerecho+base);
		
		this.ladoIzquierdo = ladoIzquierdo;
		this.ladoDerecho = ladoDerecho;
		this.base = base;
		this.altura = altura;
	}
	
	//Métodos Getter y setter
	
	public double getLadoIzquierdo() {
		return ladoIzquierdo;
	}

	public void setLadoIzquierdo(double ladoIzquierdo) {
		this.ladoIzquierdo = ladoIzquierdo;
	}

	public double getLadoDerecho() {
		return ladoDerecho;
	}

	public void setLadoDerecho(double ladoDerecho) {
		this.ladoDerecho = ladoDerecho;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Metodo que nos devuelve el tipo de triángulo creado según la medida de sus lados.
	
	public String tipoTriangulo(Triangulo tipo) {
		 
		if(tipo.getLadoDerecho()==tipo.getLadoIzquierdo() && tipo.getLadoDerecho()==tipo.getBase()) {
			return "equilátero";
		}
		else if(tipo.getLadoDerecho()!=tipo.getLadoIzquierdo()&&tipo.getLadoDerecho()!=tipo.getBase()&&tipo.getLadoIzquierdo()!=tipo.getBase()) {
			return "escaleno";
		}else {
			return "isósceles";
		}
	}
	//Metodo que nos devuelve información acerca de las características de nuestro objeto, dependiendo del tipo de triángulo.
	
	public void dimeCaracterísticas(Triangulo tipo) {
		if(tipoTriangulo(tipo)=="equilátero") {
			System.out.println(nombreFigura+" es un triángulo "+tipoTriangulo(tipo)+" de color "+tipo.getColor()+", sus lados miden "+tipo.getLadoDerecho()+"cm, su área es de "+tipo.getArea()+"cm y su perímetro de "+tipo.getPerimetro()+"cm");
		}
		else if(tipoTriangulo(tipo)=="escaleno") {
			System.out.println(nombreFigura+" es un triángulo "+tipoTriangulo(tipo)+" de color "+tipo.getColor()+", sus lados miden "+tipo.getLadoDerecho()+"cm, "+tipo.getLadoIzquierdo()+"cm y "+tipo.getBase()+"cm, su área es de "+tipo.getArea()+"cm y su perímetro de "+tipo.getPerimetro()+"cm");
		}
		else {
		System.out.println(nombreFigura+" es un triángulo "+tipoTriangulo(tipo)+" de color "+tipo.getColor()+", sus lados iguales miden "+tipo.getLadoDerecho()+"cm,y su base "+tipo.getBase()+"cm, su área es de "+tipo.getArea()+"cm y su perímetro de "+tipo.getPerimetro()+"cm");
		}
	}
	
	
}
