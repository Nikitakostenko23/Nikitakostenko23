package SummerPractice;

//Класс для вычисления максимальной невязки
public class Max_discrepancy {
    private double maximum;
    private int index;
    Max_discrepancy(double []Y1, double []Y2){
        double maximum = 0;
        int index=0;
        for (int i=0; i<Y1.length; i++){
            if (Math.abs(Y1[i] - Y2[i]) > maximum) {
                maximum =  Math.abs(Y1[i] - Y2[i]);
                index = i;
            }
        }
        this.maximum = maximum;
        this.index=index;
    }
    double getMax_discrepancy(){
        return  maximum;
    }
    int getIndex(){
        return index;
    }
}