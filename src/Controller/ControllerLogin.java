package Controller;
import MVC.MVC_AddSimpanan;
import MVC.MVC_SignUp;
import Model.ModelLogin;
import View.ViewLogin;
import MVC.MVC_Home;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ControllerLogin {
    ViewLogin viewLogin;
    ModelLogin modelLogin;
    public ControllerLogin(ModelLogin modelLogin, ViewLogin viewLogin){
        this.modelLogin = modelLogin;
        this.viewLogin = viewLogin;

        viewLogin.btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (viewLogin.getUser().equals(" ")){
                    JOptionPane.showMessageDialog(null,"Username Tidak Boleh Kosong");
                }else if (viewLogin.getPass().equals("")){
                    JOptionPane.showMessageDialog(null, "Password Tidak Boleh Kosong");
                }else {
                    try{
                        String Username = viewLogin.getUser();
                        String Password = viewLogin.getPass();
                        String data[][] = modelLogin.logIn(Username, Password);
                        if ( Username.equals(data[0][1]) && Password.equals(data[0][2])) {
                            System.out.println("Login Success");
                            JOptionPane.showMessageDialog(null, "Login Berhasil!");
                            viewLogin.setVisible(false);
                            MVC_Home mvc_home = new MVC_Home();
                        } else {
                            System.out.println("Login Gagal");
                            JOptionPane.showMessageDialog(null, "Username/Password Salah");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                    }
                }
            }
        });

        viewLogin.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewLogin.setVisible(false);
                MVC_SignUp mvc_signUp = new MVC_SignUp();
            }
        });

    }
}
