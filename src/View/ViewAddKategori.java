package View;

import javax.swing.*;
import java.awt.*;

public class ViewAddKategori extends JFrame {
    JLabel title = new JLabel("ADD KATEGORI");

    JLabel lKategori = new JLabel("Nama Kategori: ");
    public JTextField tfKategori = new JTextField();


    public JButton btnHome = new JButton("Home");
    public JButton btnAdd = new JButton("Add");
    public JButton btnReset = new JButton("Reset");

    Color salem = new Color(249, 239, 234);
    Color red2 = new Color(150, 54, 54);
    Color red = new Color(212, 76, 76);
    Color green2 = new Color(61, 99, 65);
    Color green = new Color(85, 138, 90);
    Color yellow = new Color(255, 196, 33);
    Color pink = new Color(255, 148, 177);
    Color blue2 = new Color(51, 56, 173);
    Color blue = new Color(176, 208, 211);
    Color puce = new Color(192, 132, 151);
    Color orange = new Color(247, 175, 157);
    Color peach = new Color(247, 227, 175);
    Color yellow2 = new Color(243, 238, 195);

    ImageIcon img = new ImageIcon("src\\Assets\\supplier.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond", Font.ITALIC, 20);
    Font font2 = new Font("Garamond", Font.PLAIN, 20);

    public ViewAddKategori() {
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400, 50, 1200, 700);

        add(title);
        title.setBounds(350, 100, 800, 50);
        title.setFont(new Font("Garamond", Font.BOLD, 45));
        title.setForeground(orange);

        add(logo);
        logo.setBounds(800, 200, 313, 313);

        add(lKategori);
        lKategori.setBounds(350, 200, 200, 35);
        lKategori.setFont(font2);
        add(tfKategori);
        tfKategori.setBounds(350, 230, 300, 35);
        tfKategori.setBackground(peach);

        add(btnAdd);
        btnAdd.setBounds(350, 355, 100, 40);
        btnAdd.setFont(font);
        btnAdd.setBackground(green);

        add(btnReset);
        btnReset.setBounds(350, 410, 100, 40);
        btnReset.setFont(font);
        btnReset.setBackground(red);

        add(btnHome);
        btnHome.setBounds(30, 55, 75, 50);
        btnHome.setFont(font);
        btnHome.setBackground(blue);
        btnHome.setForeground(blue2);
    }

    public String getKategori() {
        return tfKategori.getText();
    }

}
