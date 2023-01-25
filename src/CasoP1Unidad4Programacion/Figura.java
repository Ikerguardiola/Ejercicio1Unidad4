package CasoP1Unidad4Programacion;

//Declaramos la clase como abstracta, ya que no la vamos a invocar para crear objetos.

public abstract class Figura {
	
	//Declaramos los atributos como protected para poder usarlos en las subclases.
	
	protected String color;
	protected String nombreFigura;
	protected double area;
	protected double perimetro;
	
	//Constructor
	
	public Figura(String color, String nombreFigura, double area, double perimetro) {
		this.color = color;
		this.nombreFigura = nombreFigura;
		this.area = area;
		this.perimetro = perimetro;
		
	}
	//Métodos Getter y setter

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombreFigura() {
		return nombreFigura;
	}

	public void setNombreFigura(String nombreFigura) {
		this.nombreFigura = nombreFigura;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
}
