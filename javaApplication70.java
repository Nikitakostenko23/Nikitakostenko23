import java.util.TreeSet;
public class javaApplication70 {
    public static void main(String [] args){
        TreeSet <Integer> set = new TreeSet<Integer>();
        MySet myset = new MySet(set);
        myset.filSet();
        myset.print();
        MySet simple = myset.simple();
        System.out.println("Новое множество");
        simple.print();
        /*TreeSet <Integer> s = new TreeSet<Integer>();
        MySet ms = new MySet(s);
        ms.filSet();
        MySet union = myset.union(ms);
        System.out.println("Объединение");
        union.print();*/
        TreeSet <Integer> s1 = new TreeSet<Integer>();
        MySet mi = new MySet(s1);
        mi.filSet();
        MySet intersection = myset.intersection(mi);
        System.out.println("Перечесение множеств:");
        intersection.print();
        /*
        TreeSet <Integer> s2 = new TreeSet<Integer>();
        MySet md = new MySet(s2);
        md.filSet();
        MySet difference = myset.difference(md);
        System.out.println("Разность множеств:");
        difference.print();*/
    }
}
