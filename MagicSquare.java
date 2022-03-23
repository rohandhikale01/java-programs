import java.util.Scanner;

public class MagicSquare {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Magic Square Size");
        int size = scan.nextInt();

        int arr[][] = new int[size][size];

        int row = 0;
        int col = (int) (size / 2);

        for (int i = 1; i <= size * size; i++) {
            if (arr[row][col] == 0) {
                arr[row][col] = i;

            } else if (arr[row][col] != 0) {
                row = (row + 2) % size;
                col = (col + 1) % size;
                arr[row][col] = i;

            }
            col = (col - 1) % size;
            row = (row - 1) % size;
            if (row < 0) {
                row = row + size;
            }
            if (col < 0) {
                col = col + size;
            }

        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(arr[i][j]<10)
                System.out.print(" "+arr[i][j] + " ");
                else
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

