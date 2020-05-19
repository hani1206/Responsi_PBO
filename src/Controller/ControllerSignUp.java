package Controller;

import MVC.MVC_Login;
import Model.ModelLogin;
import View.ViewLogin;
import View.ViewSignUp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerSignUp {
    ModelLogin modelLogin;
    ViewLogin viewLogin;
    ViewSignUp viewSignUp;

    public ControllerSignUp(ModelLogin modelLogin, ViewLogin viewLogin, ViewSignUp viewSignUp) {
        this.modelLogin = modelLogin;
        this.viewLogin = viewLogin;
        this.viewSignUp = viewSignUp;

        viewSignUp.btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String User = viewSignUp.getUser();
                String Pass = viewSignUp.getPass();
                modelLogin.insertUser(User,Pass);
                String data[][] = modelLogin.insertUser(User,Pass);
                //modelLogin.insertUser(data[0][0]);
            }
        });
        viewSignUp.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLogin.setVisible(false);
                MVC_Login mvc_login = new MVC_Login();
            }
        });
    }
}
