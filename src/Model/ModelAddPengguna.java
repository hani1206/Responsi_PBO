package Model;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelAddPengguna {
    Statement statement;
    public void addPengguna(String pengguna, String kontak) {
        try{
            String query = "INSERT INTO `pengguna` (`pengguna`,`kontak`) VALUES ('"+pengguna+"','"+kontak+"')";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Pengguna Berhasil Ditambahkan");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }

}
