public class Array {
    public static void main(String[] args) {
        
        /* Declarando um Array de strings */
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        /* Imprimindo o tamanho do Array */
        System.out.println("========= TAMANHO DO ARRAY =========");
        System.out.println("Comprimento do array: " + cars.length + "\n");
        
        /* Imprimindo as strings em determinada posição do Array */
        System.out.println("========= IMPRIMINDO ELEMENTOS DO ARRAY =========");
        System.out.println(cars[0]);
        System.out.println(cars[1] + "\n");
    
        
        /* Criando um For para percorrer o tamanho do Array e imprimir cada elemento */
        System.out.println("========= FOR I =========");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        
        System.out.println("");

        /* Criando um For Each para percorrer e imprimir cada elemento do Array */
        System.out.println("========= FOR EACH =========");
        for (String carros : cars) {  /*Foreach -> Para cada */
            System.out.println(carros);
        }

        System.out.println("");

        /* Declarando um Array bidimensional de números inteiros -> Matriz 2:2 */
        int[][] myNumbers = {{1,2,3},
                             {4,5,6}};
        
                /*      0  1  2    */
                /*   0 [1, 2, 3]   */
                /*   1 [4, 5, 6]   */

        /* Imprimindo o numéro que está na linha 0 e na coluna 0 */                   
        System.out.println("========= IMPRIMINDO ELEMENTOS DO ARRAY =========");
        System.out.println(myNumbers[0][0]);

        /* Atribuindo o número 9 para o Array myNumbers na linha 0 e coluna 0*/
        myNumbers[0][0] = 9;
       
        /* Imprimindo o numéro que está na linha 0 e na coluna 0 que foi atribuído anteriormente*/  
        System.out.println(myNumbers[0][0] + "\n");
    
        /* Declarando um Array bidimensional de números inteiros */
        int[][] numbers = {{1,2,3,4},
                           {5,6,7}};
        
                /*      0  1  2  3    */
                /*   0 [1, 2, 3, 4]   */
                /*   1 [5, 6, 7]      */

        /* Imprimindo os números em forma de uma Matriz */
        System.out.println("========= IMPRIMINDO A MATRIZ =========");
        for (int l = 0; l < numbers.length; l++) { /* l -> linha */
            for (int c = 0; c < numbers[l].length; c++) { /* c -> coluna */
                System.out.print(" " + numbers[l][c] + " ");
            } 
            System.out.println("");
        }
    }
}

