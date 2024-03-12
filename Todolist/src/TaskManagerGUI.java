import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TaskManagerGUI extends JFrame {
    private ArrayList<Task> tasks;
    private JList<String> taskList;
    private DefaultListModel<String> taskListModel;

    public TaskManagerGUI() {
        tasks = new ArrayList<>();
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);

        JButton addButton = new JButton("일정 추가");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.add(new JScrollPane(taskList), BorderLayout.CENTER);
        centerPanel.add(buttonPanel, BorderLayout.SOUTH);

        getContentPane().add(centerPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("일정 관리 프로그램");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addTask() {
        JFrame addTaskFrame = new JFrame("일정 추가");
        addTaskFrame.setSize(300, 200);
        addTaskFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("이름:"));

        JTextField nameField = new JTextField();
        panel.add(nameField);
        panel.add(new JLabel("설명:"));

        JTextField descriptionField = new JTextField();
        panel.add(descriptionField);
        panel.add(new JLabel("마감일:"));

        JTextField deadlineField = new JTextField();
        panel.add(deadlineField);

        JButton addButton = new JButton("추가");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String description = descriptionField.getText();
                String deadline = deadlineField.getText();

                tasks.add(new Task(name, description, deadline));
                taskListModel.addElement("이름: " + name + ", 설명: " + description + ", 마감일: " + deadline);
                addTaskFrame.dispose();
            }
        });
        panel.add(addButton);

        addTaskFrame.add(panel);
        addTaskFrame.setVisible(true);
    }
}