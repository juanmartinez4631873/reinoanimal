package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un animal mamífero, y las capacidades básicas de Animal.
 * Sirve como base para animales con características vivíparas.
 * @author Juan Martinez
 */
public class Mamifero extends Animal {

    /**
     * Define el sistema reproductivo específico de los mamíferos.
     */
    @Override
    void reproducir() {
        System.out.println("La reproduccion es vivipara");
    }

    /**
     * Gestiona la interacción social del mamífero con otro animal.
     * @param m El otro animal con el que se relaciona.
     */
    @Override
    void relacionar(Animal m) {
        System.out.println("Con el mamifero: " + m.getNombre());
    }
}
