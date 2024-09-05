
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

    public class ArrayListWindowWithButton extends JFrame {

        private ArrayList<String> arrayList;
        private JTextArea textArea;

        public ArrayListWindowWithButton(ArrayList<String> arrayList) {
            this.arrayList = arrayList;

            // Настройки окна
            setTitle("ArrayList Window");
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Создаем компоненты интерфейса
            initComponents();

            // Отображаем окно
            setVisible(true);
        }

        private void initComponents() {
            // Создаем текстовую область для вывода содержимого ArrayList
            textArea = new JTextArea();
            textArea.setEditable(false);

            // Создаем панель прокрутки для текстовой области
            JScrollPane scrollPane = new JScrollPane(textArea);

            // Создаем кнопку
            JButton showButton = new JButton("Показать ArrayList");

            // Добавляем слушателя событий для кнопки
            showButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showArrayList();
                }
            });

            // Создаем панель для размещения кнопки
            JPanel buttonPanel = new JPanel();
            buttonPanel.add(showButton);

            // Создаем панель для размещения текстовой области и панели с кнопкой
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(scrollPane, BorderLayout.CENTER);
            mainPanel.add(buttonPanel, BorderLayout.SOUTH);

            // Добавляем панель в окно
            add(mainPanel);
        }

        private void showArrayList() {
            // Очищаем текстовую область
            textArea.setText("");

            // Заполняем текстовую область содержимым ArrayList
            for (String item : arrayList) {
                textArea.append(item + "\n");
            }
        }

        public static void main(String[] args) {
            // Пример использования: создаем ArrayList и передаем его окну
            ArrayList<String> sampleList = new ArrayList<>();
            sampleList.add("Элемент 1");
            sampleList.add("Элемент 2");
            sampleList.add("Элемент 3");

            SwingUtilities.invokeLater(() -> new ArrayListWindowWithButton(sampleList));
        }
    }

