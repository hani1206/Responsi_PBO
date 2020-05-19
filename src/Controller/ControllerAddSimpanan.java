package Controller;

import MVC.MVC_Home;
import Model.ModelSimpanan;
import View.ViewAddSimpanan;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerAddSimpanan {
    ViewAddSimpanan viewAddSimpanan;
    ModelSimpanan modelSimpanan;

    public ControllerAddSimpanan(ViewAddSimpanan viewAddSimpanan,  ModelSimpanan modelSimpanan){
        this.viewAddSimpanan = viewAddSimpanan;
        this.modelSimpanan = modelSimpanan;

        if (modelSimpanan.getBanyakData2() != 0){
            String[][] readNamaKategori = modelSimpanan.readKategori();
            viewAddSimpanan.table.setModel((TableModel) new JTable(readNamaKategori, viewAddSimpanan.namaKolom).getModel());
            updateDataCombo(modelSimpanan.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelSimpanan.getBanyakData3() != 0){
            String[][] readNamaSupplier = modelSimpanan.readSimpan();
            viewAddSimpanan.table.setModel((TableModel) new JTable(readNamaSupplier, viewAddSimpanan.namaKolom).getModel());
            updateDataCombo2(modelSimpanan.readNamaPengguna());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        viewAddSimpanan.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSimpanan.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewAddSimpanan.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewAddSimpanan.tfSimpanan.setText("");
                viewAddSimpanan.tfJumlah.setText("");
            }
        });
        viewAddSimpanan.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_barang = viewAddSimpanan.getSimpanan();
                String jumlah = viewAddSimpanan.getJumlah();
                String kategori = viewAddSimpanan.getKategori();
                String pengguna = viewAddSimpanan.getPengguna();
                modelSimpanan.insertSimpanan(nama_barang, jumlah, kategori, pengguna);
            }
        });

    }

    private void updateDataCombo2(ArrayList<String> readNamaPengguna) {
        viewAddSimpanan.cbPengguna.removeAllItems();
        for (String item : readNamaPengguna) {
            viewAddSimpanan.cbPengguna.addItem(item);
        }
    }

    private void updateDataCombo(ArrayList<String> readNamaKategori) {
        viewAddSimpanan.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewAddSimpanan.cbKategori.addItem(item);
        }
    }

}