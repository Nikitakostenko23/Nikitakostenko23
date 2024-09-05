
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends Panel {
    JLabel field_add, field_fio, field_adess, field_cl;
    JTextField input_fio, input_adress, input_clNumber, input_clSimvol;
    JButton add_student;

    StudentSchool st;

    JLabel field_printer, field_remove;
    JTextArea field_output;
    JTextField remove_input;
    JButton sort_By_Fio, sort_By_Cl, button_del;

    MyPanel() {
        field_add = new JLabel("Добавьте ученика:");
        add(field_add);

        field_fio = new JLabel("ФИО: ");
        field_adess = new JLabel("Адрес: ");
        field_cl = new JLabel("Класс: ");

        input_fio = new JTextField();
        input_fio.setColumns(10);
        input_adress = new JTextField();
        input_adress.setColumns(10);
        input_clNumber = new JTextField();
        input_clNumber.setColumns(3);
        input_clSimvol = new JTextField();
        input_clSimvol.setColumns(3);

        add_student = new JButton("Добавить");
        AddingListener adding_listener = new AddingListener();
        add_student.addActionListener(adding_listener);

        add(field_fio);
        add(input_fio);
        add(field_adess);
        add(input_adress);
        add(field_cl);
        add(input_clNumber);
        add(input_clSimvol);

        add(add_student);

        st = new StudentSchool();

        sort_By_Fio = new JButton("Сортировка по фио");
        SortByFioListener sbn_listener = new SortByFioListener();
        sort_By_Fio.addActionListener(sbn_listener);

        add(sort_By_Fio);

        sort_By_Cl= new JButton("Сортировка по классу");
        SortByClListener sbd_listener = new SortByClListener();
        sort_By_Cl.addActionListener(sbd_listener);

        add(sort_By_Cl);

        field_printer = new JLabel("Список учеников школы:");
        add(field_printer);
        field_output = new JTextArea(5, 50);
        add(field_output);

        field_remove = new JLabel("Кто выбыл? ");
        remove_input = new JTextField(10);
        button_del = new JButton("Удалить");
        RemoveListener removeListener = new RemoveListener();
        button_del.addActionListener(removeListener);
        add(field_remove);
        add(remove_input);
        add(button_del);


    }
    void printList() {
        field_output.setText(st.print());
    }

    class AddingListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fio = input_fio.getText();
            input_fio.setText("");
            String adress = input_adress.getText();
            input_adress.setText("");
            int clNumber = Integer.parseInt(input_clNumber.getText());
            input_clNumber.setText("");
            String clSimvol = input_clSimvol.getText();
            input_clSimvol.setText("");

            System.out.println("ФИО: " + fio + ", Адресс: " + adress + ", Класс: " + clNumber + " \"" + clSimvol +"\" ");
            st.add(new Student(fio, adress, clNumber, clSimvol.charAt(0)));

            printList();
        }
    }

    class SortByFioListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            st.SortByFio();
            printList();
        }
    }

    class SortByClListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            st.SortByCl();
            printList();
        }
    }

    class RemoveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            st.del(remove_input.getText());
            printList();
        }
    }
}

