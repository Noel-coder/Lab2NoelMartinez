package lab2_noelmartinez;

/**
 *
 * @author noelg
 */
import java.awt.Color;
import java.util.ArrayList;

public class Empleados {
    private String nombre;
    private String apellido;
    private String color;
    private int edad;
    private String genero;
    private double altura;
    private double peso;
    private String titulo;
    private String Cargo;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, String color, int edad, String genero, double altura, double peso, String titulo, String Cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.color = color;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.titulo = titulo;
        this.Cargo = Cargo;
    }
    

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Empleados{" + "Nombre:" + " " + nombre + ", Apellido=" + " "+apellido + ", Color=" + " "+ color + ", Edad=" +" "+ edad + ", Genero=" + " "+genero + ", Altura=" + " "+altura + ", Peso=" + " "+ peso + ", Titulo=" + " "+ titulo + ", Cargo=" + " "+ Cargo + '}';
    }
    
    
}
