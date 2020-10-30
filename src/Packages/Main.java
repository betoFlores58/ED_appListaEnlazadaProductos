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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.Insertar(1000 ,3 ,"Huevo" ,"Producto Animal" ,19);
        lista.Insertar(1002, 2, "Habas" ,"Botana", 10);
        lista.Borrar(19);
        lista.Mostrar();
    }
    
}
