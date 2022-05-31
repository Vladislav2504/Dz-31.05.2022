package Dz;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Vector vector1 = new Vector(5, 2, 7);

        Vector vector2 = new Vector(2, 5, 4);


        double length1 = vector1.length();
        System.out.printf("Vector1 = %.3f\n", length1);

        double length2 = vector2.length();
        System.out.printf("Vector2 = %.3f\n", length2);

        double ScalarProduct = Vector.ScalarProduct(vector1, vector2);
        System.out.printf("Скалярное произведение двух векторов: " + ScalarProduct);

        double VectorProduct1 = Vector.VectorProduct1(vector1, vector2);
        double VectorProduct2 = Vector.VectorProduct2(vector1, vector2);
        double VectorProduct3 = Vector.VectorProduct3(vector1, vector2);
        System.out.println("Векторное произведение векторов: " + VectorProduct1 + " "  + VectorProduct2 + " "+
              " "  + VectorProduct3);

        double cos = Vector.cos(vector1, vector2);
        System.out.println("Угол между векторами равен: " + cos + "градусов." );
        System.out.println();

        double sum1 = Vector.sum1(vector1, vector2);
        double sum2 = Vector.sum2(vector1, vector2);
        double sum3 = Vector.sum3(vector1, vector2);
        System.out.println("Сумма векторов: " + sum1 + " " + sum2 + " " + sum3);

        double minus1 = Vector.minus1(vector1, vector2);
        double minus2 = Vector.minus2(vector1, vector2);
        double minus3 = Vector.minus3(vector1, vector2);
        System.out.println("Разность векторов: " + minus1 + " " + minus2 + " " + minus3);
        System.out.println();



    }


}