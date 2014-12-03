/*
 * Programa en java que crea dos hilos y los ejecuta.
 * Los hilos escriben 5 veces el número de iteración del bucle y su nombre.
 * En cada iteración, después de escribir su nombre,
 * se bloquean durante un tiempo aleatorio de segundos y después vuelven a estar disponibles para su ejecución. 
 */
package repaso5;

/**
 *
 * @author findag
 */
public class Repaso5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        // Definimos nuestros hilos.
        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        
        // lanzamos los hilos.
        hilo1.start();
        hilo2.start();
        
    }
    
}
