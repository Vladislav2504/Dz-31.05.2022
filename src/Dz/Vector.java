package Dz;

public class Vector extends Coordinates {


    public Vector(double x, double y, double z) {
        super(x, y, z);
    }

    public double length() {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());

    }

    public static double ScalarProduct(Vector vector, Vector vector1) {
        return vector.getX() * vector1.getX() + vector.getY() * vector1.getY() + vector.getZ() * vector1.getZ();

    }

    public static double VectorProduct1(Vector vector, Vector vector1) {
        double VectorProduct1 = (vector.getY() * vector1.getZ() - vector.getZ() * vector1.getY());
        return VectorProduct1;
    }

    public static double VectorProduct2(Vector vector, Vector vector1) {
        double VectorProduct2 = (vector.getZ() * vector1.getX() - vector.getX() * vector1.getZ());
        return VectorProduct2;
    }

    public static double VectorProduct3(Vector vector, Vector vector1) {
        double VectorProduct3 = (vector.getX() * vector1.getY() - vector.getY() * vector1.getX());
        return VectorProduct3;
    }

    public static double cos(Vector vector, Vector vector1) {
        double ScalarProduct = ScalarProduct(vector, vector1);
        double lengthA = vector.getX() * vector.getX() + vector.getY() * vector.getY() + vector.getZ() * vector.getZ();
        double lengthB = vector1.getX() * vector1.getX() + vector1.getY() * vector1.getY() + vector1.getZ() * vector1.getZ();
        double degrees = ScalarProduct / (Math.abs(lengthA) * Math.abs(lengthB));
        double angle = Math.cos(degrees);
        return Math.toDegrees(angle);
    }

    public static double sum1(Vector vector, Vector vector1) {
        double sum1 = vector.getX() + vector1.getX();
        return sum1;
    }
    public static double sum2(Vector vector, Vector vector1) {
        double sum2 = vector.getX() + vector1.getX();
        return sum2;
    }
    public static double sum3(Vector vector, Vector vector1) {
        double sum3 = vector.getZ() + vector1.getZ();
        return sum3;
    }


    public static double minus1(Vector vector, Vector vector1) {
        double minus1 = vector.getX() - vector1.getX();
        return minus1;
    }
    public static double minus2(Vector vector, Vector vector1) {
        double minus2 = vector.getX() - vector1.getX();
        return minus2;
    }
    public static double minus3(Vector vector, Vector vector1) {
        double minus3 = vector.getZ() - vector1.getZ();
        return minus3;
    }







}