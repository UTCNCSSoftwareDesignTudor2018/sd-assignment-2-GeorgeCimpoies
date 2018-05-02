package controller;

import view.AdminView;

public class AdminController {
    private AdminView view;

    public AdminController(AdminView view) {
        this.view = view;
    }

    public AdminView getView() {
        return view;
    }

    public void setView(AdminView view) {
        this.view = view;
    }
}
