package Controller;

import MVC.MVC_Home;
import Model.ModelSimpanan;
import View.ViewEditSimpanan;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControllerEditSimpanan {
    ViewEditSimpanan viewEditSimpanan;
    ModelSimpanan modelSimpanan;

    public ControllerEditSimpanan(ViewEditSimpanan viewEditSimpanan,  ModelSimpanan modelSimpanan){
        this.viewEditSimpanan = viewEditSimpanan;
        this.modelSimpanan = modelSimpanan;

        if (modelSimpanan.getBanyakData() != 0){
            String[][] readNamaBarang = modelSimpanan.readSimpan();
            viewEditSimpanan.table.setModel((TableModel) new JTable(readNamaBarang, viewEditSimpanan.namaKolom).getModel());
            updateDataCombo(modelSimpanan.readNamaBarang());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }
        if (modelSimpanan.getBanyakData2() != 0){
            String[][] readNamaKategori = modelSimpanan.readKategori();
            viewEditSimpanan.table.setModel((TableModel) new JTable(readNamaKategori, viewEditSimpanan.namaKolom).getModel());
            updateDataCombo2(modelSimpanan.readNamaKategori());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        if (modelSimpanan.getBanyakData3() != 0){
            String[][] readNamaSupplier = modelSimpanan.readPengguna();
            viewEditSimpanan.table.setModel((TableModel) new JTable(readNamaSupplier, viewEditSimpanan.namaKolom).getModel());
            updateDataCombo3(modelSimpanan.readNamaPengguna());
        } else {
            JOptionPane.showMessageDialog(null, "Data Masih Kosong");
        }

        viewEditSimpanan.btnHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewEditSimpanan.setVisible(false);
                MVC_Home mvc_home = new MVC_Home();
            }
        });
        viewEditSimpanan.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                viewEditSimpanan.tfJumlah.setText("");
            }
        });
        viewEditSimpanan.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_barang = viewEditSimpanan.getSimpanan();
                String jumlah = viewEditSimpanan.getJumlah();
                String kategori = viewEditSimpanan.getKategori();
                String pengguna = viewEditSimpanan.getPengguna();
                if (jumlah.equals("")){
                    JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
                } else {
                    modelSimpanan.updateSimpan(nama_barang, jumlah, kategori, pengguna);
                    String newData[][] = modelSimpanan.readSimpan();
                    viewEditSimpanan.table.setModel(new JTable(newData, viewEditSimpanan.namaKolom).getModel());
                    updateDataCombo(modelSimpanan.readNamaBarang());
                }

            }
        });

    }

    private void updateDataCombo3(ArrayList<String> readNamaPengguna) {
        viewEditSimpanan.cbPengguna.removeAllItems();
        for (String item : readNamaPengguna) {
            viewEditSimpanan.cbPengguna.addItem(item);
        }
    }

    private void updateDataCombo2(ArrayList<String> readNamaKategori) {
        viewEditSimpanan.cbKategori.removeAllItems();
        for (String item : readNamaKategori) {
            viewEditSimpanan.cbKategori.addItem(item);
        }
    }

    private void updateDataCombo(ArrayList<String> readNamaBarang) {
        viewEditSimpanan.cbSimpanan.removeAllItems();
        for (String item : readNamaBarang) {
            viewEditSimpanan.cbSimpanan.addItem(item);
        }
    }
}
