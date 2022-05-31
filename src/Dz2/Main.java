package Dz2;

public class Main {
    public static void main(String[] args) {

        BaseConverter bc= new BaseConverter(16);

        double kelvins1 = bc.kelvins();
        System.out.println("Перевод " + bc.getDegrees() + " градусов цельсия в Кельвины: " + kelvins1);

        double faragates1 = bc.faragates();
        System.out.println("Перевод " + bc.getDegrees() + " градусов цельсия в Фарангейты: " + faragates1);

        double reomure1 = bc.reomura();
        System.out.println("Перевод " + bc.getDegrees() + " градусов цельсия в градусы Реомюра: " + reomure1);

        double rankin1 = bc.rankin();
        System.out.println("Перевод " + bc.getDegrees() + " градусов цельсия в градусы Ранкина: " + rankin1);

        double newton1 = bc.newton();
        System.out.println("Перевод " + bc.getDegrees() + " градусов цельсия в градусы Ньютона: " + newton1);



    }

}
