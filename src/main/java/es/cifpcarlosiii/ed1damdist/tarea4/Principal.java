package es.cifpcarlosiii.ed1damdist.tarea4;

/**
 * Clase principal que contiene el punto de entrada del programa.
 * Se encarga de instanciar los diferentes animales y demostrar el polimorfismo.
 * @author Juan Martinez
 */
public class Principal {

    /**
     * Método principal que indica la ejecución de la aplicación del Reino Animal.
     * @param args Argumentos de la línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

/*
Esquema de clases de reino-animal        
                  Animal
                    |
                    |
                Mamifero
                /       \
               /         \        
          Perro          Gato
*/


        Animal animal = new Animal();

        Mamifero mamifero = new Mamifero();

        Perro toby = new Perro();

        Gato isidoro = new Gato();
        isidoro.setPelos(4);

        animal = isidoro;

        Gato g;
        g = (Gato) animal;
        System.out.println("pelos de gato: " + g.getPelos());

        Animal array[] = new Animal[4];

        array[0] = animal;
        array[1] = mamifero;
        array[2] = toby;
        array[3] = isidoro;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Perro) {
                System.out.println("El objeto " + i + " es un perro");

                Perro p = (Perro) array[i];
                p.ladrar();
            }

            if (array[i] instanceof Gato) {
                System.out.println("El objeto " + i + " es un gato");

                Gato anigato = (Gato) array[i];
                anigato.maullar();
            }
        }

    }
}
