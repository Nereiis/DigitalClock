

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Se inicializan las variables que representarán horas, minutos y segundos
        int hours = 0, minutes = 0, seconds = 0;

        // El bucle while se ejecuta indefinidamente (hasta que se interrumpa manualmente)
        while (true) {
            // Se agrega un cero al principio si las horas son menores que 10
            if (hours < 10) {
                System.out.print("0");
            }
            // Se imprime la cantidad de horas seguida de dos puntos
            System.out.print(hours + ":");

            // Se agrega un cero al principio si los minutos son menores que 10
            if (minutes < 10) {
                System.out.print("0");
            }
            // Se imprime la cantidad de minutos seguida de dos puntos
            System.out.print(minutes + ":");

            // Se agrega un cero al principio si los segundos son menores que 10
            if (seconds < 10) {
                System.out.print("0");
            }

            // Se imprime la cantidad de segundos
            System.out.println(seconds);

            // Se incrementa el contador de segundos
            seconds++;

            // Si los segundos llegan a 60, se reinician a 0 y se incrementa el contador de minutos
            if (seconds == 60) {
                seconds = 0;
                minutes++;

                // Si los minutos llegan a 60, se reinician a 0 y se incrementa el contador de horas
                if (minutes == 60) {
                    minutes = 0;
                    hours++;

                    // Si las horas llegan a 24, se reinician a 0
                    if (hours == 24) {
                        hours = 0;
                    }
                }
            }

            // Se pausa la ejecución del programa durante 1000 milisegundos (1 segundo)
            Thread.sleep(1000);
        }
    }
}
