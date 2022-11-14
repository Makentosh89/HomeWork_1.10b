import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

         /*
        Яркости пикселей рисунка закодированы числами от 0 до 255 в виде матрицы.
        Преобразить рисунок в черно-белый по следующему алгоритму:
        Вычислить среднюю яркость пикселей по всему рисунку2.
        Все пиксели, яркость которых меньше средней, сделать черными (записать код 0),
        а остальные – белыми (код 255)
         */

        int sum = 0;
        int count = 0;
        int avg = 0;
        int matrix[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(256);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
                count++;
                avg = sum / count;

            }
        }
        System.out.println("Общая яркость пикселей = " + sum);
        System.out.println("Средняя яркость пикселей = " + avg);


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] < avg) {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j] + " ");
                }
                if (matrix[i][j] > avg) {
                    matrix[i][j] = 255;
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
