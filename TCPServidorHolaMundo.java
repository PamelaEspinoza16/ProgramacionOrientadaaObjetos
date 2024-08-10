import java.io.*;
import java.net.*;

public class TCPServidorHolaMundo {
    public static void main(String[] args) {
        int puerto = 12345; // Puerto de conexión

        try {
            // Crear el socket del servidor
            ServerSocket servidor = new ServerSocket(puerto);
            System.out.println("Servidor en espera de conexion...");

            // Esperar la conexión de un cliente
            Socket socket = servidor.accept();
            System.out.println("Cliente conectado");

            // Obtener el flujo de entrada para recibir el mensaje
            InputStream entrada = socket.getInputStream();
            BufferedReader lector = new BufferedReader(new InputStreamReader(entrada));

            // Leer y mostrar el mensaje recibido
            String mensaje = lector.readLine();
            System.out.println("Mensaje recibido: " + mensaje);

            // Cerrar la conexión
            socket.close();
            servidor.close();
        } catch (IOException e) {
            System.out.println("Error en el servidor: " + e.getMessage());
        }
    }
}
