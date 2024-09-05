import java.util.*;
public class Student implements Comparator <Student> {
    String fio, adress;
    int clNumber;
    char clSimvol;
    Student(String fio, String adress, int clNumber, char clSimvol) {
        this.fio = fio;
        this.adress = adress;
        this.clNumber = clNumber;
        this.clSimvol=clSimvol;
    }
    Student(){
        fio="Ivanov";
        adress="Lg121";
        clNumber=11;
        clSimvol='B';
    }
    public String getFio() {
        return fio;
    }

    public String getAdress() {
        return adress;
    }

    public int getClNumber() {
        return clNumber;
    }
    public char getClSimvol(){return clSimvol;}

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setClNumber(int cl) {
        this.clNumber = cl;
    }
    public void setClSimvol (char cl){this.clSimvol=cl;}


    public String print() {
        return "ФИО: " + fio + " адрес: " + adress + " класс: " + clNumber + " " + clSimvol;
    }
    public int compare(Student o1, Student o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            return o1.getFio().compareTo(o2.getFio());
        }
    };
    public static Comparator<Student> ClassComparator = new Comparator<Student>() {
        public int compare(Student o1, Student o2) {
            if (o1.getClNumber()==o2.getClNumber()){
                if (o1.getClSimvol()==o2.getClSimvol()) return 0;
                if (o1.getClSimvol()>o2.getClSimvol()) return 1;
                return -1;
            }
            return o1.getClNumber()-o2.getClNumber();
        }

    };
}