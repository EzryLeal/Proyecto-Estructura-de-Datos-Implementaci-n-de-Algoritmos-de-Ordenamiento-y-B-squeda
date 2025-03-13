import java.util.*;

public class ProyectoOrdenamiento {

    public static void mostrarInformacion() {
        // Datos fijos del proyecto
        String universidad = "Universidad Da Vinci de Guatemala";
        String curso = "Estructura de Datos";
        String docente = "Docente Ing. Brandon Chitay";
        String estudianteNombre = "Ezry Leal";
        String carnet = "202200202";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del estudiante
        System.out.print("Ingrese su nombre: ");
        String estudiante = scanner.nextLine();

        // Listas de tareas completadas y pendientes
        List<String> puntosHechos = new ArrayList<>();
        List<String> puntosFaltantes = new ArrayList<>();

        // Se inicia el proyecto con los primeros puntos completados
        puntosHechos.add("1. Información del Desarrollador");
        puntosHechos.add("2. Menú Principal");

        // Lista de tareas restantes
        puntosFaltantes.add("3. Carga de Datos desde un CSV");
        puntosFaltantes.add("4. Algoritmo de Ordenamiento - Bubble Sort");
        puntosFaltantes.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
        puntosFaltantes.add("6. Algoritmo de Ordenamiento - Quick Sort");
        puntosFaltantes.add("7. Algoritmo de Ordenamiento - Selection Sort");
        puntosFaltantes.add("8. Algoritmo de Ordenamiento - Merge Sort");
        puntosFaltantes.add("9. Algoritmo de Búsqueda - Binary Search");
        puntosFaltantes.add("10. Presentación Final en YouTube");

        // Mostrar la información en consola
        System.out.println("\n========================================");
        System.out.println(universidad);
        System.out.println(curso);
        System.out.println(docente);
        System.out.println("Realizado por: " + estudianteNombre);
        System.out.println("Carnet: " + carnet + "\n");
        System.out.println("Nombre del estudiante: " + estudiante + "\n");

        // Mostrar tareas completadas
        for (String punto : puntosHechos) {
            System.out.println(punto);
        }

        // Mostrar tareas pendientes
        System.out.println("\nTareas pendientes:");
        for (String punto : puntosFaltantes) {
            System.out.println("[PENDIENTE] " + punto);
        }

        System.out.println("========================================");

        // Esperar a que el usuario presione Enter antes de continuar
        System.out.println("Presione Enter para continuar...");
        scanner.nextLine();  // Captura la entrada del usuario

        // Llamar al menú principal
        mostrarMenu(scanner, estudiante, puntosHechos);
    }

    public static void mostrarMenu(Scanner scanner, String estudiante, List<String> puntosHechos) {
        List<Integer> listaDatos = new ArrayList<>();
        int opcion;
        do {
            // Mostrar opciones
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            // Leer opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            // Ejecutar la acción correspondiente
            switch (opcion) {
                case 1:
                    CargarDatosCSV.opcionCargarDatos(listaDatos);
                    puntosHechos.add("3. Carga de Datos desde un CSV");
                    break;
                case 2:
                    BubbleSort.opcionBubbleSort(listaDatos);
                    puntosHechos.add("4. Algoritmo de Ordenamiento - Bubble Sort");
                    break;
                case 3:
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    puntosHechos.add("5. Algoritmo de Ordenamiento - Enhanced Bubble Sort");
                    break;
                case 4:
                    QuickSort.opcionQuickSort(listaDatos);
                    puntosHechos.add("6. Algoritmo de Ordenamiento - Quick Sort");
                    break;
                case 5:
                    SelectionSort.opcionSelectionSort(listaDatos);
                    puntosHechos.add("7. Algoritmo de Ordenamiento - Selection Sort");
                    break;
                case 6:
                    MergeSort.opcionMergeSort(listaDatos);
                    puntosHechos.add("8. Algoritmo de Ordenamiento - Merge Sort");
                    break;
                case 7:
                    BinarySearch.opcionBinarySearch(listaDatos);
                    puntosHechos.add("9. Algoritmo de Búsqueda - Binary Search");
                    break;
                case 8:
                    System.out.println("[SALIDA] Saliendo del programa...");
                    break;
                default:
                    System.out.println("[ERROR] Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);

        // Mostrar puntos hechos
        for (String punto : puntosHechos) {
            System.out.println(punto);
        }

        System.out.println("\nPresione Enter para continuar...");
        scanner.nextLine();
    }

    public static void main(String[] args) {
        mostrarInformacion();  // Llamamos a la función principal
    }
}
