package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Representa un gato, que es un tipo de mamífero.
 * Contiene atributos específicos como el número de pelos y comportamientos felinos.
 * @author Juan Martinez
 */
public class Gato extends Mamifero {

    /**
     * Cantidad de pelos que tiene el gato.
     */
    private int pelos;

    /**
     * Obtiene el número de pelos del gato.
     * @return Un entero con la cantidad de pelos.
     */
    public int getPelos() {
        return pelos;
    }

    /**
     * Define o actualiza la cantidad de pelos del gato.
     * @param pelos El número de pelos a asignar.
     */
    public void setPelos(int pelos) {
        this.pelos = pelos;
    }

    /**
     * Describe el comportamiento de descanso de un gato.
     */
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    /**
     * Emite el sonido característico de un gato.
     */
    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }

    /**
     * Define como interactúa el gato con otro animal
     * @param p El otro animal con el que se relaciona.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
