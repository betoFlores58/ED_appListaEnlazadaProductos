package Packages;

/**
 */
public class ListaEnlazada {
    Nodo primero;
    Nodo actual;
    public ListaEnlazada()
    {
        
    }
    public void Insertar(int clave, int cantidad, String nombre, String descripcion, double precio)
    {
        Nodo anterior;
        if(ListaVacia() || primero.precio > precio)
        {
            primero = new Nodo(clave, cantidad, nombre, descripcion, precio, primero);
        }
        else{
            anterior = primero;
            while (anterior.sig != null && anterior.sig.precio <= precio )
                anterior = anterior.sig;
            anterior.sig = new Nodo(anterior.clave, anterior.cantidad, anterior.nombre, anterior.descripcion, anterior.precio, anterior.sig);
            
        }
    }
    public void Mostrar()
    {
        Nodo aux;
        aux = primero;
        while(aux != null)
        {
            System.out.print(aux.nombre+" "+aux.precio + " -> ");
            aux = aux.sig;
        }
        System.out.print(" null ");
        System.out.println(" ");
    }
    public void siguiente()
    {
        if(actual != null)
            actual = actual.sig;
    }
            
    public void Primero()
    {
        actual = primero;
    }
    
    public void Borrar(int precio)
    {
        Nodo anterior, nodo;
        nodo = primero;
        anterior = null;
        while(nodo != null && nodo.precio < precio)
        {
            anterior = nodo;
            nodo = nodo.sig;
        }
        if(nodo == null || nodo.precio != precio)
            return;
        else
        {
            if(anterior == null)
                primero = nodo.sig;
            else
                anterior.sig =nodo.sig;
        }
    }
    public boolean ListaVacia()
    {
        if(primero == null)
            return true;
        return false;
    }
    
    public void Ultimo()
    {
        Primero();
        if(!ListaVacia())
            while(actual.sig != null)
                siguiente();
    }
    
    public boolean Actual()
    {
        if(actual != null)
            return true;
        return false;
    }
    
    public double PrecioActual()
    {
        return actual.precio;
    }
}
