import java.io.*;
import java.net.*;

public class TCPClienteHolaMundo {
    public static void main(String[] args) {
        String servidor = "localhost"; // Dirección IP o nombre del servidor
        int puerto = 12345; // Puerto de conexión

        try {
            // Conectar con el servidor
            Socket socket = new Socket(servidor, puerto);

            // Obtener el flujo de salida para enviar el mensaje
            OutputStream salida = socket.getOutputStream();
            PrintWriter escritor = new PrintWriter(salida, true);

            // Enviar el mensaje "Hola Mundo"
            escritor.println("Hola Mundo");

            // Cerrar la conexión
            socket.close();
        } catch (IOException e) {
            System.out.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }
}
