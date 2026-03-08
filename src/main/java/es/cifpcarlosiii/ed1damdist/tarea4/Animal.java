package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un animal genérico con nombre y comportamientos básicos.
 * Esta es la clase base para el resto de animales del reino animal.
 * @author Juan Martinez
 */

public class Animal {

   private String nombre;

    /**
     * Obtiene el nombre asignado al animal.
     * @return El nombre actual del animal con un String.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Asigna o cambia el nombre del animal.
     * @param nombre El nuevo nombre que tendrá el animal.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Describe la necesidad de alimentación del animal.
     */
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    /**
     * Describe la necesidad de descanso del animal.
     */
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    /**
     * Indica el proceso para orginar nuevos seres vivos.
     */
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    /**
     * Define la interacción con otro animal.
     * @param a El otro animal con el que se relaciona.
     */
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.getNombre());
    }
}
