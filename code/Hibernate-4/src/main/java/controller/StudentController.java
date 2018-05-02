package controller;

import model.Student;
import service.ActivityService;
import service.TableService;
import view.AdminView;
import view.StudentView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(StudentView view) {
        this.view = view;
        view.setAddStudentListener(new StudentAddListener());
        view.setRemoveStudentListener(new StudentRemoveListener());
        view.setUpdateStudentListener(new StudentUpdateListener());
        view.setHomeStudentListener(new StudentHomeListener());
        view.setLoadStudentListener(new StudentLoadListener());
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    private class StudentAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameText = view.getName();
            String identityCardNumberText = view.getIdentityCardNumber();
            String personalNumericCodeText = view.getPersonalNumericCode();
            String addressText = view.getAddress();
            String groupText = view.getGroup();
            String usernameText = view.getStudentUsername();
            String passwordText = view.getStudentPassword();

            view.getStudentService().addStudent(nameText, identityCardNumberText, personalNumericCodeText, addressText, groupText, usernameText, passwordText);
            ActivityService.addActivity("Added new student");

            try {
                view.getStudentTable().setModel(TableService.readTableStudents());
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    private class StudentRemoveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String idText = view.getStudentId();
            view.getStudentService().removeStudent(view.getStudentService().getStudentById(Integer.valueOf(idText)));
            //             ActivityService.addActivity("Deleted client", LoginView.puname);
            try {
                view.getStudentTable().setModel(TableService.readTableStudents());
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    private class StudentUpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int idText = Integer.valueOf(view.getStudentId());
            String nameText = view.getStudentName();
            String identityCardNumberText = view.getIdentityCardNumber();
            String personalNumericCodeText = view.getPersonalNumericCode();
            String addressText = view.getAddress();
            String groupText = view.getGroup();
            String usernameText = view.getStudentUsername();
            String passwordText = view.getStudentPassword();

            view.getStudentService().updateStudent(idText, nameText, identityCardNumberText, personalNumericCodeText, addressText, groupText, usernameText, passwordText);
            ActivityService.addActivity("Updated student");

            try {
                view.getStudentTable().setModel(TableService.readTableStudents());
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    private class StudentLoadListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try {
                view.getStudentTable().setModel(TableService.readTableStudents());
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    }

    private class StudentHomeListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            AdminView paneladmin;
            try {
                paneladmin = new AdminView();
                paneladmin.setVisible(true);
                view.dispose();
            } catch (Exception ex) {
                // TODO Auto-generated catch block
                ex.printStackTrace();
            }
        }
    }
}
