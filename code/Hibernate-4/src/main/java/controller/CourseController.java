package controller;

import model.Course;
import view.CourseView;

public class CourseController {
    private Course model;
    private CourseView view;

    public CourseController(Course model, CourseView view) {
        this.model = model;
        this.view = view;
    }

    public Course getModel() {
        return model;
    }

    public void setModel(Course model) {
        this.model = model;
    }

    public CourseView getView() {
        return view;
    }

    public void setView(CourseView view) {
        this.view = view;
    }
}
