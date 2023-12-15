public class Datos {
    public class Singleton {
        /**
         * número generado
         */
        private int numeroAleatorio;
        /**
         * numero intentos
         */
        private int intentos;
        /**
         * numero maximo de intentos
         */
        private int intentosMax;
        /**
         * puntuacion maxima de aciertos
         */
        private int record;
        /**
         * numero introducido para adivinar
         */
        private int numeroIntroducido;
        /**
         * nombre del jugador
         */
        private String alias;
        /**
         * contador de intentos
         */
        private int contadorIntentos;
        /**
         * puntos
         */
        private int puntuacion;
        /**
         * número de rondas
         */
        private int rondasPartida;
        /**
         * registro de ronda actual
         */
        private int rondaActual;

        private static Datos instance = null;

        private Singleton(){

        }

        public static Datos getInstance(){
            if (instance == null) {
                instance = new  ();
            }
            return instance;
        }

        /**
         * Todos los getters y setters
         * @return los distintos datos
         */
        public int getContadorIntentos(){
            return contadorIntentos;
        }

        public void setContadorIntentos(int contadorIntentos) {
            this.contadorIntentos = contadorIntentos;
        }

        public int getIntentos() {
            return intentos;
        }

        public void setIntentos(int intentos) {
            this.intentos = intentos;
        }

        public int getIntentosMax() {
            return intentosMax;
        }

        public void setIntentosMax(int intentosMax) {
            this.intentosMax = intentosMax;
        }

        public int getNumeroAleatorio() {
            return numeroAleatorio;
        }

        public void setNumeroAleatorio(int numeroAleatorio) {
            this.numeroAleatorio = numeroAleatorio;
        }

        public int getNumeroIntroducido() {
            return numeroIntroducido;
        }

        public void setNumeroIntroducido(int numeroIntroducido) {
            this.numeroIntroducido = numeroIntroducido;
        }

        public int getPuntuacion() {
            return puntuacion;
        }

        public void setPuntuacion(int puntuacion) {
            this.puntuacion = puntuacion;
        }

        public int getRecord() {
            return record;
        }

        public void setRecord(int record) {
            this.record = record;
        }

        public int getRondaActual() {
            return rondaActual;
        }

        public void setRondaActual(int rondaActual) {
            this.rondaActual = rondaActual;
        }

        public int getRondasPartida() {
            return rondasPartida;
        }

        public void setRondasPartida(int rondasPartida) {
            this.rondasPartida = rondasPartida;
        }
    }


}
