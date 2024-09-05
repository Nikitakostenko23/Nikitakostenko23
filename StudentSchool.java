import java.util.ArrayList;
import java.util.Comparator;
public class StudentSchool {
    ArrayList<Student> a;
    StudentSchool(){
        a = new ArrayList<Student>();
    }
    void find(String fio, int clNumber, char clSimvol){
        int p=-1;
        for (int i=0; i<a.size(); i++){
            if (fio.equalsIgnoreCase(a.get(i).getFio()) && clNumber==a.get(i).clNumber && clSimvol==a.get(i).clSimvol) p=i;
        }
        if (p>-1){
            System.out.println("Такой ученик есть, его номер - "+p);
        }
        else System.out.println("Такого ученика нет");
    }
    void add(Student s){a.add(s);}
    void del(String fio){
        int p=-1;
        for (int i=0; i<a.size(); i++){
            if (fio.equalsIgnoreCase(a.get(i).getFio())) p=i;
        }
        if (p>-1){
            a.remove(p);
            System.out.println("Выбыл ученик - "+fio);
        }
        else System.out.println("Такого ученика нет");
    }
    void SortByFio(){
        a.sort(Student.NameComparator);
    }
    void SortByCl(){
        a.sort(Student.ClassComparator);
    }
    public ArrayList <Student> get(){
        return a;
    }

    String print() {
        String s = "";
        for (int i = 0; i < a.size(); i++) s += a.get(i).print() +"\n";
        return s;
    }
}
