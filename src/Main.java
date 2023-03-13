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
        int pointA1 = scanner.nextInt();
        int pointA2 = scanner.nextInt();
        System.out.println("Введите координаты второй точки (два целых числа, через пробел)");
        int pointB1 = scanner.nextInt();
        int pointB2 = scanner.nextInt();
        scanner.close();
        double result = ptpDistance(pointA1,pointA2,pointB1,pointB2);
        System.out.printf("Расстояние между точками с координатами (%d,%d) и (%d,%d) равно %f",
                pointA1,pointA2,pointB1,pointB2,result);
    }
    static double ptpDistance(int pointA1,int pointA2,int pointB1,int pointB2){
        int powValue = 2;
        return Math.sqrt((Math.pow((pointB1 - pointA1),powValue) +
                Math.pow((pointB2 - pointA2),powValue))); // вычисление расстояния между двумя точками
    }
}