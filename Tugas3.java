import java.util.HashMap;
import java.util.Map;

public class Tugas3 {
    public static void main(String[] args) {
        // Contoh data untuk array 1D
        int[] array1D = {12, 1, 12, 1, 10};

        // Menghitung elemen ganda di array 1D
        System.out.println("- Output 1D:");
        findDuplicateInArray(array1D);

        // Contoh data untuk array 2D
        int[][] array2D = {
            {12, 5, 3},
            {1, 2, 12},
            {10, 7, 1}
        };

        // Menghitung elemen ganda di array 2D
        System.out.println("- Output 2D:");
        findDuplicateIn2DArray(array2D);
    }

    private static void findDuplicateInArray(int[] array) {
        Map<Integer, String> duplicateMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            duplicateMap.put(array[i], duplicateMap.getOrDefault(array[i], "") + "[" + i + "] dan ");
        }

        int count = 1;
        for (Map.Entry<Integer, String> entry : duplicateMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.println("Elemen ganda " + count++ + ": " + entry.getKey());
                System.out.println("Lokasi : " + entry.getValue().substring(0, entry.getValue().length() - 5)); // Menghapus " dan "
            }
        }
    }

    private static void findDuplicateIn2DArray(int[][] array) {
        Map<Integer, String> duplicateMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                duplicateMap.put(array[i][j],
                                 duplicateMap.getOrDefault(array[i][j], "") + "[" + i + "]" + "[" + j + "] dan ");
            }
        }

        int count = 1;
        for (Map.Entry<Integer, String> entry : duplicateMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                System.out.println("Elemen ganda " + count++ + ": " + entry.getKey());
                System.out.println("Lokasi : " + entry.getValue().substring(0, entry.getValue().length() - 5)); // Menghapus " dan "
            }
        }
    }
}