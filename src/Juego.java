public class Juego {

    private Datos dato;
    private int generado;
    private int adivinado;
    /**
     * Genera el numero a adivinar
     */
    public void genenerarNumero();{

    }

    /**
     * comprueba si los numeros son iguales , mayores o menores;
     * @return muestra el estado del juego;
     */
    public void comprobarNumero();{
       if(generado>adivinado){
           System.out.println("El número es mayor");

       }else if(generado<adivinado){
           System.out.println("El número es menor");
       }else if(generado=adivinado)
           System.out.println("Correcto");
    }


    /**
     * Detecta el numero introducido
     * @return el numero introducido
     */
    public void introducirNumero();{
      return adivinado;
    }



