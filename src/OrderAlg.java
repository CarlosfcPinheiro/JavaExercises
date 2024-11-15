public class OrderAlg {
    // Selection Sort
    public static int[] selectionSort(int[] vector){
        // Iteração para cada valor do vetor
        // vector.length-1 => Para não realizar a iteração do último elemento do vetor
        for (int i=0; i<vector.length-1; i++){
            int min = i;
            // Iteração para cada intervalo do valor atual e o resto do vetor
            // j = i+1 (Recebe o ponto de partida da iteração)
            for (int j=i+1; j<vector.length; j++){
                if (vector[j] < vector[min]){
                    // A variável min assume como valor a posição do menor valor encontrado na iteração
                    min = j;
                }
            }
            // Variável auxiliar para armazenar o valor inicial
            int aux = vector[i];
            // Troca dos valores atual e menor
            vector[i] = vector[min];
            vector[min] = aux;
        }

        return vector;
    }
    // Insertion Sort em ordem crescente
    public static int[] insertionSort(int[] vector){
        // Iteração para percorrer cada elemento do vetor
        for (int i=1; i<vector.length; i++){
            // Armazenar o elemento da iteração atual
            int aux = vector[i];
            // variável de controle para percorrer o vetor da posição atual, para esquerda do vetor
            int j = i-1;
            //
            while ((j>=0) && (vector[j] > aux)){
                vector[j+1] = vector[j];
                j--;
            }
            vector[j+1] = aux;
        }

        return vector;
    }
    // Inserction Sort em ordem decrescente
    public static int[] DecInsertionSort(int[] vector){
        for (int i = 1; i < vector.length; i++){
            int aux = vector[i]; // Elemento atual a ser inserido
            int j = i-1;

            // Move os elementos do array[0..i-1] que são menores que a chave
            // para uma posição à frente de sua posição atual
            while ((j >= 0) && (vector[j] < aux)){
                vector[j + 1] = vector[j];
                j--;
            }
            // Insere a chave na posição correta
            vector[j + 1] = aux;
        }
        return vector;
    }
    // Selection Sort em ordem decrescente
    public static int[] DecSelectionSort(int[] vector){
        for (int i=0; i<vector.length; i++){
            int max = i;

            for (int j=i+1; j<vector.length; j++){
                if (vector[j] > vector[max]){
                    max = j;
                }
            }
            int aux = vector[max];
            vector[max] = vector[i];
            vector[i] = aux;
        }
        return vector;
    }

    public static void showVector(int[] vector){
        System.out.print("\n[");
        for (int i=0; i<vector.length; i++){
            System.out.print(" " + vector[i] + " ");
        }
        System.out.print("]");
    }

    public static void main (String[] args){
        int[] vector = {8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        // 1° Questão
        // vector = selectionSort(vector);
        // showVector(vector);
        // 2° Questão
        // vector = insertionSort(vector);
        // showVector(vector);
        // 3° Questão
        // A principal alteração foi a mudança da condição da seleção do valor que é identificado como maior/menor do que o valor da iteração atual que, ao final desse laço de repetição, é realizada a troca por esse maior elemento
        // vector = DecSelectionSort(vector);
        // showVector(vector);
        // 4° Questão
        // Mudança na condição de continuação do loop while, que interrompe a execução quando é identificado que o elemento que está sendo iterado posteriormente ao elemento atual, é menor que o elemento da iteração atual.
        // vector = DecInsertionSort(vector);
        // showVector(vector);
        // 5° Questão
        // a. Ambos os algoritmos possuem complexidade O(n²) em médios e piores casos.
        // b. O algoritmo de inserção pode ser mais vantajoso para uma quantidade menor de dados. Já o algoritmo de seleção pode ser mais vantajoso em casos onde o custo de memória para movimentar os elementos podem ser muito altos, devido ao seu baixo número de trocas por elemento.
        // c. Tempo de execução dos métodos
        int[] newVector = {
                83, 27, 92, 15, 48, 56, 72, 31, 19, 67,
                44, 79, 36, 54, 29, 63, 10, 92, 88, 21,
                97, 51, 35, 18, 66, 75, 12, 43, 94, 17,
                39, 70, 41, 85, 14, 58, 99, 25, 61, 32,
                49, 11, 26, 60, 55, 13, 95, 68, 76, 23,
                87, 33, 74, 42, 59, 34, 22, 53, 80, 98,
                20, 50, 30, 81, 24, 65, 9, 77, 52, 47,
                16, 69, 45, 78, 8, 62, 5, 84, 28, 40,
                96, 57, 64, 6, 7, 73, 3, 93, 38, 86,
                1, 90, 37, 46, 4, 82, 2, 91, 100, 89
        };

        long timeInit = System.nanoTime();
        selectionSort(newVector);
        long timeFinal = System.nanoTime();
        System.out.print("Tempo de execução: " + (timeFinal-timeInit));
        showVector(newVector);

        timeInit = System.nanoTime();
        insertionSort(newVector);
        timeFinal = System.nanoTime();
        System.out.print("\nTempo de execução: " + (timeFinal-timeInit));
        showVector(newVector);
    }
}
