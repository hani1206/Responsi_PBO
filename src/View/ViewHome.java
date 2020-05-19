package View;

import javax.swing.*;
import java.awt.*;

public class ViewHome extends JFrame{
    JLabel title = new JLabel("PENITIPAN BARANG");
    JLabel title2 = new JLabel("HANOY OY");

    public JButton btnSee = new JButton("Lihat Simpanan");
    public JButton btnAdd = new JButton("Tambah Simpanan");
    public JButton btnEdit = new JButton("Edit Simpanan");
    public JButton btnAdd2 = new JButton("Tambah Pengguna");
    public JButton btnAdd3 = new JButton("Tambah Kategori");
    public JButton btnOut = new JButton("Log Out");


    Color salem  = new Color(249, 239, 234);
    Color red2 = new Color(150, 54, 54);
    Color red = new Color(212, 76, 76);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(85, 138, 90);
    Color yellow = new Color(255, 196, 33);
    Color pink = new Color(255, 148, 177);
    Color blue2 = new Color(51, 56, 173);
    Color blue = new Color(176, 208, 211);
    Color puce = new Color(192, 132, 151);
    Color orange  = new Color(247, 175, 157);
    Color peach = new Color(247, 227, 175);
    Color yellow2 = new Color(243, 238, 195);

    ImageIcon img = new ImageIcon("src\\Assets\\home.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond",Font.ITALIC,35);
    Font font2 = new Font ("Garamond", Font.BOLD,  50);

    public ViewHome(){
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400,50,1200,700);

        add(title);
        title.setBounds(50,50,800,50);
        title.setFont(font2);
        title.setForeground(blue);

        add(title2);
        title2.setBounds(150,110,500,50);
        title2.setFont(font2);
        title2.setForeground(blue);

        add(logo);
        logo.setBounds(50,180,626,444);

        add(btnSee);
        btnSee.setBounds(800, 30, 250, 60);
        btnSee.setFont(font);
        btnSee.setBackground(blue);
        btnSee.setForeground(blue2);

        add(btnAdd);
        btnAdd.setBounds(800, 130, 250, 60);
        btnAdd.setFont(font);
        btnAdd.setBackground(blue);
        btnAdd.setForeground(blue2);

        add(btnEdit);
        btnEdit.setBounds(800, 230, 250, 60);
        btnEdit.setFont(font);
        btnEdit.setBackground(blue);
        btnEdit.setForeground(blue2);

        add(btnAdd2);
        btnAdd2.setBounds(800, 330, 250, 60);
        btnAdd2.setFont(new Font("Garamond",Font.ITALIC,35));
        btnAdd2.setBackground(blue);
        btnAdd2.setForeground(blue2);

        add(btnAdd3);
        btnAdd3.setBounds(800, 430, 250, 60);
        btnAdd3.setFont(new Font("Garamond",Font.ITALIC,35));
        btnAdd3.setBackground(blue);
        btnAdd3.setForeground(blue2);

        add(btnOut);
        btnOut.setBounds(800, 530, 250, 60);
        btnOut.setFont(new Font("Garamond",Font.BOLD, 35));
        btnOut.setBackground(salem);
        btnOut.setForeground(orange);


    }
}



