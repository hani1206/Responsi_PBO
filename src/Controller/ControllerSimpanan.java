package Controller;

import MVC.MVC_Home;
import Model.ModelSimpanan;
import View.ViewSimpanan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControllerSimpanan {
    ViewSimpanan viewSimpanan;
    ModelSimpanan modelSimpanan;

    public ControllerSimpanan(ViewSimpanan viewSimpanan, ModelSimpanan modelSimpanan){
        this.viewSimpanan = viewSimpanan;
        this.modelSimpanan = modelSimpanan;
        if (modelSimpanan.getBanyakData() != 0) {
            String data[][] = modelSimpanan.readSimpan();
            viewSimpanan.tabel.setModel((new JTable(data, viewSimpanan.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        viewSimpanan.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSimpanan.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewSimpanan.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewSimpanan.tabel.getSelectedRow();
                int kolom = viewSimpanan.tabel.getSelectedColumn();

                String dataterpilih = viewSimpanan.tabel.getValueAt(baris, 0).toString();
                System.out.println(dataterpilih);

                int input = JOptionPane.showConfirmDialog(null, "Apa anda ingin menghapus supply " + dataterpilih + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);
                if (input == 0) {
                    modelSimpanan.deleteSimpan(dataterpilih);
                    String newData[][] = modelSimpanan.readSimpan();
                    viewSimpanan.tabel.setModel(new JTable(newData,viewSimpanan.namaKolom).getModel());
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });

    }
}
