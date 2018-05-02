package controller;

import model.Teacher;
import view.TeacherView;

public class TeacherController {
    private Teacher model;
    private TeacherView view;

    public TeacherController(Teacher model, TeacherView view) {
        this.model = model;
        this.view = view;
    }

    public Teacher getModel() {
        return model;
    }

    public void setModel(Teacher model) {
        this.model = model;
    }

    public TeacherView getView() {
        return view;
    }

    public void setView(TeacherView view) {
        this.view = view;
    }
}
