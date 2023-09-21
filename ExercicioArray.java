/* 
Multiplicar cada número da matriz por 5 
    */
public class ExercicioArray {
    public static void main(String[] args) {
        int[][] myNumbers = {{1,  2,  3,  4},
                             {5,  6,  7,  8},
                             {9, 10, 11, 12}};
        for (int l = 0; l < myNumbers.length; l++){
            for (int c = 0; c < myNumbers[l].length; c++){
                myNumbers[l][c] *= 5;
                System.out.print(" " + myNumbers[l][c] + " ");
            }
            System.out.println("");
        }
    }
}
