import java.io.*;
import java.util.*;

public class CargarDatosCSV {
    public static List<Integer> cargarDesdeCSV(String archivo) {
        List<Integer> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] numeros = linea.split(",");
                for (String num : numeros) {
                    try {
                        lista.add(Integer.parseInt(num.trim())); // Convertir y agregar a la lista
                    } catch (NumberFormatException e) {
                        System.out.println("[ERROR] Error al procesar el número: " + num);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("[ERROR] Error al leer el archivo: " + e.getMessage());
        }
        
        return lista;
    }

    public static void opcionCargarDatos(List<Integer> lista) {
        System.out.print("Ingrese la ruta del archivo CSV: ");
        @SuppressWarnings("resource")
        String archivo = new java.util.Scanner(System.in).nextLine();
        
        lista.clear();  // Limpiar la lista antes de cargar nuevos datos
        List<Integer> datosCargados = cargarDesdeCSV(archivo);
        
        if (datosCargados.isEmpty()) {
            System.out.println("[ERROR] No se cargaron datos del archivo.");
        } else {
            lista.addAll(datosCargados);
            System.out.println("[EXITO] Datos cargados correctamente.");
            System.out.println("[DATOS] Datos cargados: " + lista);
        }
    }
}
