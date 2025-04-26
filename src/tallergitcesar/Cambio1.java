package tallergitcesar;

public class Cambio1 {
    private String nombre;
    private int edad;

    public Cambio1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}