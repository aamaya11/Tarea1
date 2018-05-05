package programacion2clase2;

import java.util.Scanner;

class Contacto
{
    String nombre;
    int telefono; // los atributos....
    
    Contacto(String nombre, int telefono) // adentro de esto estan los parametros...
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    void imprimir()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }
}

public class Programacion2Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int tamano = 5;
        Contacto contactos[] = new Contacto[tamano];
        
        int opcion;
        do
        {
            System.out.println("Menu:");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();
            
            if(opcion == 1)
            {
                String nombre;
                int telefono;
                int posicion;
                System.out.print("Ingrese el nombre: ");
                nombre = scanner.next();
                System.out.print("Ingrese el telefono: ");
                telefono = scanner.nextInt();
                System.out.print("Ingrese la posicion: ");
                posicion = scanner.nextInt();
                
                contactos[posicion] = new Contacto(nombre, telefono);
            }
            
            if(opcion == 2)
            {
                for(int i=0; i<tamano; i++)
                {
                    if(contactos[i] != null)
                        contactos[i].imprimir();
                }
            }
            
        }while(opcion!=0);
    }
}
