package View;

import javax.swing.*;
import java.awt.*;

public class ViewAddPengguna extends JFrame {
    JLabel title = new JLabel("ADD PENGGUNA");

    JLabel lPengguna = new JLabel("Nama Pengguna: ");
    public JTextField tfPengguna = new JTextField();
    JLabel lKontak = new JLabel("Contact: ");
    public JTextField tfKontak = new JTextField();

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

    ImageIcon img = new ImageIcon("src\\Assets\\pengguna.jpg");
    JLabel logo = new JLabel(img);

    Font font = new Font("Garamond", Font.ITALIC, 20);
    Font font2 = new Font("Garamond", Font.PLAIN, 20);

    public ViewAddPengguna() {
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setBounds(400, 50, 1200, 700);

        add(title);
        title.setBounds(250, 100, 800, 50);
        title.setFont(new Font("Garamond", Font.BOLD, 45));
        title.setForeground(orange);

        add(logo);
        logo.setBounds(600,60,826,617);

        add(lPengguna);
        lPengguna.setBounds(350, 200, 200, 35);
        lPengguna.setFont(font2);
        add(tfPengguna);
        tfPengguna.setBounds(350, 230, 200, 35);
        tfPengguna.setBackground(orange);

        add(lKontak);
        lKontak.setBounds(350, 270, 200, 35);
        lKontak.setFont(font2);
        add(tfKontak);
        tfKontak.setBounds(350, 300, 300, 35);
        tfKontak.setBackground(orange);

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

    public String getNama() {

        return tfPengguna.getText();
    }

    public String getKontak() {
        return tfKontak.getText();
    }

}
