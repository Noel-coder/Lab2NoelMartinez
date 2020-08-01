package lab2_noelmartinez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;
import java.util.Random;

/**
 *
 * @author noelg
 */
public class Lab2_NoelMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char resp = 's';
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        ArrayList empleado = new ArrayList();
        String nombre, apellido, color, genero, titulo, cargo;
        int cargo2 = 0;
        String usuario = "";
        String contraseña = "";
        boolean logearse = false;
        int edad,numGerentes = 0;
        double altura, peso;

        while (resp == 's' || resp == 'S') {
            while (logearse == false) {
                System.out.println("1. Registro de empleados");
                System.out.println("2. Despedir empleados");
                System.out.println("3. Log In");
                System.out.println("4. Ascender Cajero");
                System.out.println("5. Listar Empleados");
                System.out.println("6. Modificar Empleados");
                System.out.println("7. Random");
                System.out.println("8. Salir del programa");
                System.out.println("Ingrese una opcion");
                int opcion = sc.nextInt();
                if (opcion != 3) {
                    System.out.println("Tiene que logearse primero");
                } else {
                    System.out.println("Ingrese el usuario: ");
                    usuario = sc.next();
                    System.out.println("Ingrese la contraseña: ");
                    contraseña = sc.next();
                    if ("leobanegas".equals(usuario) && "99".equals(contraseña)) {
                        logearse = true;
                        System.out.println("¡¡Te haz logeado exitosamente!!");
                    } else {
                        System.out.println("¡Usuario u Contraseña es incorrecto!");
                    }
                }
            }
            System.out.println("1. Registro de empleados");
            System.out.println("2. Despedir empleados");
            System.out.println("3. Log In");
            System.out.println("4. Ascender Cajero");
            System.out.println("5. Listar Empleados");
            System.out.println("6. Modificar Empleados");
            System.out.println("7. Random");
            System.out.println("8. Salir del programa");
            System.out.println("Ingrese una opcion");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del empleado: ");
                    nombre = sc.next();
                    nombre.equalsIgnoreCase(nombre);
                    System.out.println("Ingrese el apellido del empleado: ");
                    apellido = sc.next();
                    apellido.equalsIgnoreCase(apellido);
                    System.out.println("Ingrese el color favorito: ");
                    color = sc.next();
                    System.out.println("Ingrese la edad del empleado: ");
                    edad = sc.nextInt();
                    System.out.println("Ingrese el genero del empleado: (M = Masculino, F = Femenino, O =otro)");
                    genero = sc.next();
                    System.out.println("Ingrese la altura del empleado: ");
                    altura = sc.nextDouble();
                    System.out.println("Ingrese el peso del empleado: ");
                    peso = sc.nextDouble();
                    System.out.println("Ingrese el titulo del empleado: ");
                    titulo = sc.next();
                    System.out.println("Ingrese el cargo del empleado");
                    cargo = sc.next();
                    
                    empleado.add(new Empleados(nombre, apellido, color, edad, genero, altura, peso, titulo, cargo));
                    break;
                case 2:
                    //despedir empleados
                    for (Object o : empleado) {
                        System.out.println(empleado.indexOf(o) + "- " + o);
                        System.out.println();
                    }
                    System.out.println("Eliga la posicion del empleado que quiera despedir");
                    int indice = sc.nextInt();
                    empleado.remove(indice);
                    break;
                case 3:
                    //log in

                    break;
                case 4:

                    break;
                case 5:
                    //listar empleados
                    System.out.println("Gerentes: ");
                    for (int i = 0; i < empleado.size(); i++) {
                        if (((Empleados) empleado.get(i)).getCargo().equals("Gerente")) {
                            System.out.println(empleado.indexOf(i) + "- " + empleado.get(i) + "\n");
                        }
                    }
                    System.out.println("Aseadores: ");
                    for (int i = 0; i < empleado.size(); i++) {
                        if (((Empleados) empleado.get(i)).getCargo().equals("Aseador")) {
                            System.out.println(empleado.indexOf(i) + "- " + empleado.get(i) + "\n");
                        }
                    }
                    System.out.println("Seguridad: ");
                    for (int i = 0; i < empleado.size(); i++) {
                        if (((Empleados) empleado.get(i)).getCargo().equals("Seguridad")) {
                            System.out.println(empleado.indexOf(i) + "- " + empleado.get(i) + "\n");
                        }
                    }
                    System.out.println("Cajeros: ");
                    for (int i = 0; i < empleado.size(); i++) {
                        if (((Empleados) empleado.get(i)).getCargo().equals("Cajero")) {
                            System.out.println(empleado.indexOf(i) + "- " + empleado.get(i) + "\n");
                        }
                    }
                    break;
                case 6:
                    break;
                case 7:
                    int random=0;
                    String [] cargos = {"Gerente","Aseador","Cajero","Seguridad"};
                    System.out.println("Ingrese un numero para el random: ");
                    int NumeroRan = sc.nextInt();
                    while (random < NumeroRan) {                        
                        if (numGerentes <= 2) {
                            ((Empleados)empleado.get(0 + r.nextInt(empleado.size()))).setCargo(cargos[0+r.nextInt(cargos.length)]);
                        }
                    }
                    break;
                case 8:
                    resp = 'n';
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }

        }
    }
}
