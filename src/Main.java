import java.util.Scanner;

/*
Написать метод, принимающий на вход координаты двух точек и возвращающий длину отрезка между этими точками.
При тестировании координаты вводить с клавиатуры.
Подсказка: использовать класс Math и формулу расчета отрезка по координатам двух точек.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты первой точки (два целых числа, через пробел)");
        int point1_a = scanner.nextInt();
        int point2_a = scanner.nextInt();
        System.out.println("Введите координаты второй точки (два целых числа, через пробел)");
        int point1_b = scanner.nextInt();
        int point2_b = scanner.nextInt();
        scanner.close();
        double result = ptpDistance(point1_a,point2_a,point1_b,point2_b);
        System.out.printf("Расстояние между точками с координатами (%d,%d) и (%d,%d) равно %f",point1_a,point2_a,point1_b,point2_b,result);
    }
    static double ptpDistance(int point1_a,int point2_a,int point1_b,int point2_b){
        int powValue = 2;
        return Math.sqrt((Math.pow((point1_b - point1_a),powValue) + Math.pow((point2_b - point2_a),powValue))); // вычисление расстояния между двумя точками
    }
}