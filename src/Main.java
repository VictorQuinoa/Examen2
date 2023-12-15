import javax.swing.*;

public class Main {
    public static void main(String ars[]){


        Datos sing = Datos.getInstance();

        sing.setDatos(2);

        /**
         * atributos y objetos de la clase
         *
         */

        Juego ju = new Juego;
        Record re = new Record;

        private int i =0;
        private int a =0;

        do{

            System.out.println("Introduce un número:");

            /**
             * metodos del juego(generar,introducir,comprobar)
             * El for da 3 oportunidades, en caso de acertar se acaba el bucle.
              */
            for (a=0;a<=2;a++){
                ju.genenerarNumero();

                ju.introducirNumero();

                ju.comprobarNumero();

                //si el numero es correcto:


                /**
                 * Si se adivina se guarda y muestra el record
                 */


                if (generado == adivinado) {
                    /**
                     * guarda y muestra el record
                     * @return record
                     */
                    re.guardarRecord();

                    a=3;
                }
            }
            /**
             * Pregunta si volver a jugar
             * Al decir que no termina el juego
             */
            System.out.println("Continuar?");
            a = Integer.parseInt(JOptionPane.showConfirmDialog(null,"Continuar?"));


        }while (a=0);

        Record.mostrarRecord();


        System.out.println("Fin del juego");


    }
}
