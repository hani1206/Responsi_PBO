package Model;
import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelLogin {
    Statement statement;

    public String[][] logIn(String Username, String Password) {
        try{
            int jmlData = 0;

            String data[][] = new String[1][3];
            String query = "SELECT * FROM `user` WHERE `username` ='"+ Username + "'AND `password` = '"+Password+"'";
            statement = DataBase.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0][0] = resultSet.getString("id_user");
                data[0][1] = resultSet.getString("username");
                data[0][2] = resultSet.getString("password");
                jmlData++;
            }return data;
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL ERORR");
            return null;
        }
    }
    public String[][] insertUser(String username, String password) {
        try{
            String query = "INSERT INTO `user` (`username`, `password`) VALUES ('"+username+"','"+password+"')";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            System.out.println("User Successfully Added");
            JOptionPane.showMessageDialog(null, "User Successfully Added");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
        return new String[0][0];
    }

    public void deleteUser (int id_user) {
        try{
            String query = "DELETE FROM `user` WHERE `id_user` = '"+id_user+"'";
            statement = DataBase.getConnection().createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}
