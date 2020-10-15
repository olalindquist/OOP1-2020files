public class Geometry {

    public static double sphereVolume(double r){
        double answer = (4*Math.PI*Math.pow(r,3))/3;
        return answer;
    }
    public static double sphereSurface(double r){
        double answer = (4*Math.PI*Math.pow(r,2));
        return answer;
    }
    public static double cylinderVolume(double r, double h){
        double answer =Math.PI *Math.pow(r,2)*h;*h
        return answer;
    }
    public static double cylinderSurface(double r, double h){
        double answer = Math.PI*2*r*h+Math.PI*Math.pow(r,2);
        return answer;
    }




}
