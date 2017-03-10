
public class Arbol {
	private String nombre;
	private String zona;
	private Double altura;
		
	public Arbol() {
		super();
	}
	public Arbol(String nombre, String zona, Double altura) {
		super();
		this.nombre = nombre;
		this.zona = zona;
		this.altura = altura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	
}
