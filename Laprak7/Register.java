package Laprak7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JFrame {
    private JTextField txt_nama;
    private JTextField txt_nim;
    private JComboBox cb_prodi;
    private JTextField txt_telp;
    private JRadioButton rb_laki;
    private JRadioButton rb_perempuan;
    private JTextArea ta_alamat;
    private JButton saveButton;
    private JPanel jpanel;
    private JButton clearButton;
    private ButtonGroup JK;

    public Register() {
        super("Form Registrasi");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        this.setSize(800, 600);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_nama.setText("");
                txt_nim.setText("");
                txt_telp.setText("");
                ta_alamat.setText("");
                cb_prodi.setSelectedIndex(0);
                JK.clearSelection();
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txt_nama.getText();
                String nim = txt_nim.getText();
                String telp = txt_telp.getText();
                String alamat = ta_alamat.getText();
                String prodi = cb_prodi.getSelectedItem().toString();

                String jk;
                if(rb_laki.isSelected()){
                    jk = "Laki-Laki";
                } else if (rb_perempuan.isSelected()) {
                    jk = "Peremepuan";
                }else{
                    jk = "Belum dipilih";
                }
                if(nama.isEmpty() || nim.isEmpty() || alamat.isEmpty() || prodi.isEmpty() || jk.isEmpty() || telp.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Data tidak boleh kosong" );
                }else {
                    JOptionPane.showMessageDialog(null,"Data "+ nama + " berhasil disimpan");
                }
            }
        });
    };

    public static void main(String[] args) {
        JFrame frame = new Register();
        frame.setVisible(true);
    }
}
