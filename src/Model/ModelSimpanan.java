package Model;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSimpanan {
    Statement statement;

    public int getBanyakData(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM (`simpan` JOIN `kategori` ON `simpan`.`kategori` = `kategori`.`kategori`)JOIN `pengguna` ON `simpan`.`pengguna` = `pengguna`.`pengguna`";
            statement = DataBase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    public String[][] readSimpan(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData()][5];
            String query = "SELECT * FROM ((`simpan` JOIN `kategori` ON `simpan`.`kategori` = `kategori`.`kategori`)JOIN `pengguna` ON `simpan`.`pengguna` = `pengguna`.`pengguna`) ORDER BY 'id_simpan'";
            ResultSet resultSet = statement.executeQuery(query);
            int i = 1;
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id_simpan");
                data[jmlData][1] = resultSet.getString("kategori");
                data[jmlData][2] = resultSet.getString("pengguna");
                data[jmlData][3] = resultSet.getString("nama_barang");
                data[jmlData][4] = resultSet.getString("jumlah");
                jmlData++;
                i++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    public void insertSimpanan(String nama_barang, String jumlah, String kategori, String pengguna){
        try{
            String query = "INSERT INTO `simpan` (`id_simpan`, `kategori`, `pengguna`,`nama_barang`,`jumlah` ) VALUES ('0','"+kategori+"','"+pengguna+"','"+nama_barang+"','"+jumlah+"')";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public ArrayList<String> readNamaBarang(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `simpan`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("nama_barang"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public int getBanyakData2(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `kategori`";
            statement = DataBase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }
    public String[][] readKategori(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData2()][1];
            String query = "SELECT * FROM `kategori`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("kategori");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }
    public ArrayList<String> readNamaKategori(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "Select * from `kategori`";
            statement = DataBase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("kategori"));
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public int getBanyakData3(){
        try {
            int jmlData = 0;
            String query = "SELECT * FROM `pengguna`";
            statement = DataBase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            return 0;
        }
    }
    public String[][] readPengguna(){
        try {
            int jmlData = 0;
            String data[][] = new String[getBanyakData3()][2];
            String query = "SELECT * FROM `pengguna`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("pengguna");
                data[jmlData][1] = resultSet.getString("kontak");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<String> readNamaPengguna(){
        try {
            ArrayList<String> data = new ArrayList<>();
            String query = "SELECT * FROM `pengguna`";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data.add(resultSet.getString("pengguna"));
            }
            return data;
        } catch (SQLException e) {
            return null;
        }
    }

    public void updateSimpan(String nama_barang,String jumlah,String kategori,String pengguna){
        try {
            String query = "UPDATE `simpan` SET `nama_barang` = '"+nama_barang+"',`jumlah`='" + jumlah + "',`kategori`='" +kategori +"', `pengguna`='" +pengguna +"'WHERE `nama_barang` = '" + nama_barang + "'";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void deleteSimpan(String id_simpan){
        try {
            String query = "DELETE FROM `simpan` WHERE `id_simpan` = '" + id_simpan + "'";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}

