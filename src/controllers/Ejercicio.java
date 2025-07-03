package controllers;
import java.util.HashSet;
import java.util.Set;
public class Ejercicio {

    public Ejercicio() {
        System.out.println("Ejercicio uno");
        System.out.println("1, 2, 3, 4, 5");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println("1, 2, 3, 4, 5, 4, 3, 2, 45");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45}));
        System.out.println("Ejercicio dos");
        System.out.println("Isograma: casa");
        System.out.println(esIsograma("casa"));
        System.out.println("Isograma: murcielago");
        System.out.println(esIsograma("murcielago"));
        System.out.println("Ejercicio tres");
        String texto= "La inteligencia artificial (IA) está transformando el mundo a una velocidad sin precedentes. Desde asistentes virtuales que responden preguntas hasta vehículos autónomos que recorren las ciudades, la IA está presente en casi todos los aspectos de nuestra vida diaria. Sin embargo, este avance también plantea desafíos éticos, sociales y económicos que deben ser cuidadosamente analizados. ¿Estamos preparados para delegar decisiones importantes a sistemas que no poseen conciencia ni empatía? Por otro lado, la IA puede ser una herramienta poderosa en sectores como la salud, la educación y el medio ambiente. Con algoritmos bien entrenados, es posible detectar enfermedades de forma temprana, personalizar la enseñanza o monitorear los ecosistemas en tiempo real. No obstante, es fundamental garantizar que su implementación sea inclusiva, justa y transparente. En resumen, el desarrollo responsable de la inteligencia artificial no solo debe centrarse en la innovación, sino también en el impacto que genera en la humanidad y en el planeta. El futuro no está escrito, pero lo que decidamos hoy tendrá consecuencias duraderas.";
        System.out.println(texto);
        System.out.println("Caracteres unicos: " + contarPalabrasUnicas(texto));
    }


    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> numerosUnicos = new HashSet<>();
        for(int numero: numeros){
            if(!numerosUnicos.add(numero)){
                return true; 
            }
        }
        return false;
    }

    public boolean esIsograma(String palabra) {
        Set<Character> caracters = new HashSet<>();
        for (char c : palabra.toCharArray()) {
            if (!caracters.add(c)) {
                return false; 
            }
        }       
        return true; 
    }

    public int contarPalabrasUnicas(String texto){
        Set<String> palabras = new HashSet<>();
        int cont=0;
        int totalpalabras = 0;
        for (String palabra : texto.split(" ")) {
            totalpalabras++;
            if (palabras.add(palabra)) {
                cont++;    
            }
        }       

        System.out.println("Total de palabras: " + totalpalabras);
        return cont; 

    }
    
}
