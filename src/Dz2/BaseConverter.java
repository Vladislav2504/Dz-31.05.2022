package Dz2;

public class BaseConverter extends Degrees{

    public BaseConverter(double degrees){
        super(degrees);
    }

    public  double kelvins(){
        double kelvins = getDegrees() + 273.15;
        return kelvins;
    }

    public double faragates(){
        double faragates = (getDegrees() * 9/5) + 32;
        return faragates;
    }

    public double reomura(){
        double reomura = (getDegrees() * 0.8);
        return reomura;
    }

    public double rankin(){
        double rankin = (getDegrees() + 273.15) * 9/5;
        return rankin;
    }

    public  double newton(){
        double newton = getDegrees() * 0.33;
        return newton;
    }


}
