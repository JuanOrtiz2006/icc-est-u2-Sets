package controllers;

import java.util.Set;
import java.util.TreeSet;
import utils.ContactoComparator;
import models.Contacto;

public class ContactoController {

    public ContactoController(){
        runTreeContacto();
        runTreeContactoInverso();
    }

    private void runTreeContacto() {
        ContactoComparator contactoComparator = new ContactoComparator();
        Set<Contacto> agenda = new TreeSet<>(contactoComparator); // Usar el comparador directamente
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        // Mostrar la agenda para verificar funcionamiento
        System.out.println("-----Agenda TreeSet-----");
        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }

    private void runTreeContactoInverso() {
        ContactoComparator contactoComparator = new ContactoComparator();
        Set<Contacto> agenda = new TreeSet<>(contactoComparator::compareInverso); // Usar el comparador inverso
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        // Mostrar la agenda para verificar funcionamiento
        System.out.println("-----Agenda TreeSet Inverso-----");
        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }
}
