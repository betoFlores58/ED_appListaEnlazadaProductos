/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packages;

/**
 *
 * @author ALBER
 */
public class Nodo {
   
    int clave, cantidad;
    String nombre, descripcion;
    double precio;
    public Nodo sig;
    
    public Nodo(int c, int cant, String n, String d, double precio, Nodo s){
        clave = c;
        cantidad = cant;
        nombre = n;
        descripcion = d;
        this.precio = precio;
        sig = s;
    }
}
/////////////////////////////////////////////


