package Controller;

import MVC.MVC_Home;
import Model.ModelAddKategori;
import View.ViewAddKategori;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerAddKategori {
    ViewAddKategori viewAddKategori;
    ModelAddKategori modelAddKategori;
    public ControllerAddKategori(ViewAddKategori viewAddKategori, ModelAddKategori modelAddKategori) {
        this.viewAddKategori = viewAddKategori;
        this.modelAddKategori = modelAddKategori;

        viewAddKategori.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddKategori.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });

        viewAddKategori.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String kategori = viewAddKategori.getKategori();
                modelAddKategori.addKategori(kategori);
            }
        });
        viewAddKategori.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddKategori.tfKategori.setText("");
            }
        });
    }
}
