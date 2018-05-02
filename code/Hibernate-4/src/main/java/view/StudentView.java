package view;

import service.ActivityService;
import service.LoginService;
import service.StudentService;
import service.TableService;
import utils.CustomTextField;
import utils.HibernateUtil;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StudentView extends JFrame {

    public String getStudentId() {
        return id.getText();
    }

    public String getStudentName() {
        return name.getText();
    }

    public String getIdentityCardNumber() {
        return identityCardNumber.getText();
    }

    public String getPersonalNumericCode() {
        return personalNumericCode.getText();
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public String getAddress() {

        return address.getText();
    }

    public String getGroup() {
        return group.getText();
    }

    public String getStudentUsername() {
        return username.getText();
    }

    public String getStudentPassword() {
        return password.getText();
    }

    public JTable getStudentTable() {
        return table;
    }

    private JPanel contentPane;
    private CustomTextField id;
    private CustomTextField name;
    private CustomTextField identityCardNumber;
    private CustomTextField personalNumericCode;
    private CustomTextField address;
    private CustomTextField group;
    private CustomTextField username;
    private CustomTextField password;
    private JTable table;

    JButton addNewStudent = new JButton("ADD");
    JButton removeStudent = new JButton("REMOVE");
    JButton updateStudent = new JButton("UPDATE");
    JButton loadStudents = new JButton("LOAD");
    JButton homeButton = new JButton("HOME");

    private StudentService studentService = new StudentService();

    public void setAddStudentListener(ActionListener actionListener){
        addNewStudent.addActionListener(actionListener);
    }

    public void setRemoveStudentListener(ActionListener actionListener){
        removeStudent.addActionListener(actionListener);
    }

    public void setUpdateStudentListener(ActionListener actionListener){
        updateStudent.addActionListener(actionListener);
    }

    public void setLoadStudentListener(ActionListener actionListener){
        loadStudents.addActionListener(actionListener);
    }

    public void setHomeStudentListener(ActionListener actionListener){
        homeButton.addActionListener(actionListener);
    }

    public StudentView() throws Exception {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1316, 530);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        id = new CustomTextField(10);
        id.setBounds(105, 49, 237, 34);
        id.setPlaceholder("Id");
        contentPane.add(id);

        name = new CustomTextField(10);
        name.setBounds(105, 94, 237, 34);
        name.setPlaceholder("Name");
        contentPane.add(name);

        identityCardNumber = new CustomTextField(10);
        identityCardNumber.setBounds(105, 139, 237, 34);
        identityCardNumber.setPlaceholder("Identity Card Number");
        contentPane.add(identityCardNumber);

        personalNumericCode = new CustomTextField(10);
        personalNumericCode.setBounds(105, 186, 237, 34);
        personalNumericCode.setPlaceholder("Personal Numerical Code");
        contentPane.add(personalNumericCode);

        address = new CustomTextField(10);
        address.setBounds(105, 233, 237, 34);
        address.setPlaceholder("Address");
        contentPane.add(address);

        group = new CustomTextField(10);
        group.setBounds(105, 278, 237, 34);
        group.setPlaceholder("Group");
        contentPane.add(group);

        username = new CustomTextField(10);
        username.setBounds(105, 323, 237, 34);
        username.setPlaceholder("Username");
        contentPane.add(username);

        password = new CustomTextField(10);
        password.setBounds(105, 368, 237, 34);
        password.setPlaceholder("Password");
        contentPane.add(password);

        JLabel lblNewLabel_1 = new JLabel("Student Panel");
        lblNewLabel_1.setFont(new Font("Constantia", Font.PLAIN, 24));
        lblNewLabel_1.setBounds(12, 15, 323, 46);
        contentPane.add(lblNewLabel_1);

        addNewStudent.setBounds(445, 139, 155, 34);
        contentPane.add(addNewStudent);

        removeStudent.setBounds(445, 186, 155, 34);
        contentPane.add(removeStudent);

        updateStudent.setBounds(445, 233, 155, 34);
        contentPane.add(updateStudent);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(695, 25, 591, 320);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        loadStudents.setBounds(445, 94, 155, 34);
        contentPane.add(loadStudents);

        JLabel lblnoteThatFor = new JLabel("**Note that for UPDATE and ADD all fields must be completed while for REMOVE only the Personal Numerical Code must be filled out.");
        lblnoteThatFor.setBounds(12, 435, 736, 34);
        contentPane.add(lblnoteThatFor);

        homeButton.setBounds(445, 280, 157, 34);
        contentPane.add(homeButton);

        JButton logOut = new JButton("LogOut");
        logOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LoginView loginView;
                try {
                    loginView = new LoginView();
                    loginView.setVisible(true);
                    dispose();
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
        logOut.setBounds(1201, 358, 97, 25);
        contentPane.add(logOut);
    }
}