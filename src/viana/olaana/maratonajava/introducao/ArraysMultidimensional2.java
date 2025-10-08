package viana.olaana.maratonajava.introducao;

public class ArraysMultidimensional2 {
    public static void main(String[] args) {
        // Declaração de um array simples
        int[] array = {1, 2, 3};

        // Declaração e inicialização de um array multidimensional irregular (Jagged Array)
        int[][] arrayInt = new int[3][];

        // Inicializando cada sub-array individualmente
        arrayInt[0] = new int[2];
        arrayInt[1] = array; // Reutilizando o array simples como a segunda linha
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6}; // Inicialização direta

        int[][] arrayInt2 = {{10, 20}, {30, 40, 50}, {60}};

        // Percorrendo e imprimindo o arrayInt (o array irregular)
        for (int[] arrayBase : arrayInt) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
