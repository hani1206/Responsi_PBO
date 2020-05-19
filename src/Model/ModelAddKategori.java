package Model;

import javax.swing.*;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelAddKategori {
    Statement statement;
    public void addKategori(String kategori){
        try {
            String query = "INSERT INTO `kategori`(`kategori`) " + "VALUES ('"+kategori+"')";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukkan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
