import controllers.ContactoController;
import controllers.Ejercicio;
import controllers.Sets;
public class App {
    public static void main(String[] args) throws Exception {
        Sets conSets = new Sets();
        System.out.println("Juan Pablo Ortiz");
        /*runHashSet(conSets);
        runLinkedHashSet(conSets);
        runTreeSet(conSets);
        runTreeSetConComparador(conSets);
        runTreeSetConComparadorInverso(conSets);
        */
        //ContactoController contactoController = new ContactoController();

        Ejercicio ejercicio = new Ejercicio();
        
    }

    public static void runHashSet(Sets sets){
        System.out.println("-----HashSet-----");
        System.out.println("Elemnentos del HashSet");
        System.out.println(sets.construirHashSet());

    }

    public static void runLinkedHashSet(Sets sets){
        System.out.println("-----LinkedHashSet-----");
        System.out.println("Elemnentos del LinkedHashSet");
        System.out.println(sets.construirLinkedHashSet());

    }

    public static void runTreeSet(Sets sets){
        System.out.println("-----TreeSet-----");
        System.out.println("Elemnentos del TreeSet");
        System.out.println(sets.construirTreeSet());

    }

    public static void runTreeSetConComparador(Sets sets){
        System.out.println("-----TreeSet Comparado-----");
        System.out.println("Elemnentos del TreeSetConComparador");
        System.out.println(sets.construirTreeSetConComparador());

    }

    public static void runTreeSetConComparadorInverso(Sets sets){
        System.out.println("-----TreeSet Comparado Inverso-----");
        System.out.println("Elemnentos del TreeSetConComparador");
        System.out.println(sets.construirTreeSetConComparadorInverso());

    }

}
