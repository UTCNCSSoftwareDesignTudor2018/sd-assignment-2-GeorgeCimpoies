package controller;

import model.Exam;
import view.ExamView;

public class ExamController {
    private Exam model;
    private ExamView view;

    public ExamController(Exam model, ExamView view) {
        this.model = model;
        this.view = view;
    }

    public Exam getModel() {
        return model;
    }

    public void setModel(Exam model) {
        this.model = model;
    }

    public ExamView getView() {
        return view;
    }

    public void setView(ExamView view) {
        this.view = view;
    }
}
