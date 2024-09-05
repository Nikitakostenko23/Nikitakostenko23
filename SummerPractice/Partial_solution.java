package SummerPractice;

public class Partial_solution {
    private double []X;
    private double []Y;
    Partial_solution(double []X, double y0){
        this.X = X;
        double [] Y = new double [X.length];
        Y[0] = y0;
        for (int i=1; i<X.length; i++){
            Y[i]=y(X[i]);
        }
        this.Y=Y;
    }
    double y(double x){
        return Math.sqrt(x/(3+Math.pow(x,2)));
    }
    double [] getY(){
        return Y;
    }
}