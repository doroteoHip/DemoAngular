package demo.pr.dto;

public class Jarra {
	public static String nombre;
	public int capacidad;
	private int cantidad;
	public Jarra(String nombre,int capacidad, int cantidad) {
		super();
		Jarra.nombre = nombre;
		this.capacidad = capacidad;
		this.cantidad = cantidad;
		
		if(cantidad>capacidad) {
			cantidad = capacidad;
			
		}
	}
    public Jarra(String nombre, int capacidad) {
        this(nombre, capacidad, 0);
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;

        if (cantidad > capacidad) {
            cantidad = capacidad;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;

        if (cantidad > capacidad) {
            cantidad = capacidad;
        }
    }

    public String toString() {
        return nombre + " - " + cantidad + "/" + capacidad;
    }	

}
