import java.util.List;

public class QuickSort {
    public static void ordenar(List<Integer> lista, int inicio, int fin) {
        if (inicio < fin) {
            int indicePivote = particion(lista, inicio, fin);
            ordenar(lista, inicio, indicePivote - 1);
            ordenar(lista, indicePivote + 1, fin);
        }
    }

    private static int particion(List<Integer> lista, int inicio, int fin) {
        int pivote = lista.get(fin);  // Elegimos el último elemento como pivote
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (lista.get(j) < pivote) {
                i++;
                // Intercambiar lista[i] y lista[j]
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        // Intercambiar el pivote con lista[i+1] para colocarlo en su posición final
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);

        return i + 1;  // Retornamos la posición del pivote
    }

    public static void opcionQuickSort(List<Integer> lista) {
        if (lista.isEmpty()) {
            System.out.println("[ERROR] No hay datos cargados. Cargue datos primero.");
            return;
        }
        ordenar(lista, 0, lista.size() - 1);
        System.out.println("[EXITO] Lista ordenada con Quick Sort.");
        System.out.println("[DATOS] Lista ordenada: " + lista);
    }
}
