package utils;
import models.Contacto;
import java.util.Comparator;
public class ContactoComparator implements Comparator<Contacto>{
    

    public int compare(Contacto c1, Contacto c2) {
        int ordenApellido = c1.getApellido().compareTo(c2.getApellido());
        int ordenTelefono;
        if(ordenApellido != 0){
            return ordenApellido;
        }
        int ordenNombre = c1.getNombre().compareTo(c2.getNombre());
        if (ordenNombre != 0) {
            return ordenNombre;    
        }

        ordenTelefono = c1.getTelefono().compareTo(c2.getTelefono());
        if (ordenTelefono != 0) {
            return ordenTelefono;
        }
        
        return 0;
    }

    //telefono desendente
    public int compareInverso(Contacto c1, Contacto c2) {
        int ordenApellido = c1.getApellido().compareTo(c2.getApellido());
        int ordenTelefono;
        if(ordenApellido != 0){
            return ordenApellido;
        }
        int ordenNombre = c1.getNombre().compareTo(c2.getNombre());
        if (ordenNombre != 0) {
            return ordenNombre;    
        }

        ordenTelefono = c2.getTelefono().compareTo(c1.getTelefono());
        if (ordenTelefono != 0) {
            return ordenTelefono;
        }
        
        return 0;
    }
    
}
