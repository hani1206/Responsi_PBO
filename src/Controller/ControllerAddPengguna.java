package Controller;

import MVC.MVC_Home;
import Model.ModelAddPengguna;
import View.ViewAddPengguna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAddPengguna {
    ViewAddPengguna viewAddPengguna;
    ModelAddPengguna modelAddPengguna;

    public ControllerAddPengguna(ViewAddPengguna viewAddPengguna, ModelAddPengguna modelAddPengguna){
        this.viewAddPengguna = viewAddPengguna;
        this.modelAddPengguna = modelAddPengguna;

        viewAddPengguna.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddPengguna.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewAddPengguna.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = viewAddPengguna.getNama();
                String kontak = viewAddPengguna.getKontak();
                modelAddPengguna.addPengguna(nama,kontak);
            }
        });

        viewAddPengguna.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddPengguna.tfPengguna.setText("");
                viewAddPengguna.tfKontak.setText("");
            }
        });
    }
}
