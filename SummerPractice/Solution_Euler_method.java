package SummerPractice;
public class Solution_Euler_method {
    private double [] X;
    private double [] Y;
    Solution_Euler_method(double [] X, double x0, double y0, double h){
        this.X=X;
        double [] Y = new double[X.length];
        Y[0] = y0;
        double x1 = x0, y1 = y0;
        for (int i=1; i<X.length; i++){
            y1 += h*f(x1,y1);
            Y[i] = y1;
            x1 = X[i];
        }
        this.Y=Y;
    }
    double f(double x, double y){
        return y/(2*x) - Math.pow(y,3);
    }
    double [] getY(){
        return Y;
    }
}