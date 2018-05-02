package controller;

import model.Enrollment;
import view.EnrollmentView;

public class EnrollmentController {
    private Enrollment model;
    private EnrollmentView view;

    public EnrollmentController(Enrollment model, EnrollmentView view) {
        this.model = model;
        this.view = view;
    }

    public Enrollment getModel() {
        return model;
    }

    public void setModel(Enrollment model) {
        this.model = model;
    }

    public EnrollmentView getView() {
        return view;
    }

    public void setView(EnrollmentView view) {
        this.view = view;
    }
}
