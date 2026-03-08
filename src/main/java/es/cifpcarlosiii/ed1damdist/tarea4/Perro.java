package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase que representa a un perro, un mamífero con comportamientos específicos como ladrar.
 * @author Juan Martinez
 */
public class Perro extends Mamifero {

    /**
     * Describe como descansa el perro según su actividad física.
     */
    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    /**
     * Emite el sonido característico de alerta o labor social de un perro.
     */
    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    /**
     * Emite un sonido ronco de advertencia.
     */
    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    /**
     * Gestiona la interacción del perro con otro animal.
     * @param p El otro animal con el que se relaciona.
     */
    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.getNombre());
    }

    /**
     * Devuelve una representación en el texto del perro.
     * @return El nombre del perro como identificación.
     */
    String ToString() {
        return getNombre();
    }

}
