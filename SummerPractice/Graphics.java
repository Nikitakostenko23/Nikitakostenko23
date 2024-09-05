package SummerPractice;

import org.knowm.xchart.*;
import org.knowm.xchart.style.lines.SeriesLines;
import java.awt.*;
import java.util.Scanner;
public class Graphics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Начальные условия для задачи Коши
        double x0 = 1, y0 = 0.5;
        System.out.print("Введите соответствующее число разбиений n=");
        int n = sc.nextInt();
        int a = 1, b = 2;
        double h = (b - a) / (double) n;

        //Заполнение массива точек аргумента х
        double [] x1 = new double [n+1];
        for (int i=0; i<=n; i++){
            x1[i]=a + i*h;
        }
        double [] x2;
        if (n<100) {
            x2 = new double[101];
            double t = (b-a)/(double)100;
            for (int i=0; i<=100; i++){
                x2[i]=a + i*t;
            }
        }
        else{
            x2 = new double[n+1];
            for (int i=0; i<=n; i++)  x2[i]=a + i*h;
        }

        //Получение частного и точного решений задачи Коши
        Solution_Euler_method y1 = new Solution_Euler_method(x1, x0, y0, h);
        Partial_solution y2 = new Partial_solution(x2, y0);
        Partial_solution y21 = new Partial_solution(x1, y0);

        //Нахождение максимальной невязки
        Max_discrepancy m = new Max_discrepancy(y1.getY(), y21.getY());
        double [] y3 = {y1.getY()[m.getIndex()], y21.getY()[m.getIndex()]};
        double [] x3 = {x1[m.getIndex()], x1[m.getIndex()]};

        //Построение графиков
        XYChart chart = new XYChartBuilder().width(600).height(500).title("Сравнение графиков точного и приближённого решений задачи Коши при заданном числе n=" + n + " разбиений").xAxisTitle("X").yAxisTitle("Y").build();
        chart.addSeries("Решение задачи Коши методом Эйлера", x1, y1.getY());
        chart.getStyler().setMarkerSize(1);
        XYSeries series = chart.addSeries("Аналитическое решение задачи Коши", x2, y2.getY());
        series.setLineStyle(SeriesLines.DASH_DASH).setLineColor(Color.red);
        chart.addSeries("Максимальная невязка=" + m.getMax_discrepancy(), x3, y3);
        new SwingWrapper(chart).displayChart();
    }
}