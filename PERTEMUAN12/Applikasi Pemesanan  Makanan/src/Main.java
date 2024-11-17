import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        // Buat frame utama
        JFrame frame = new JFrame("APLIKASI PEMESANAN");
        frame.setSize(500, 600);
        frame.setLayout(new FlowLayout());
        
        // Panel untuk data pelanggan
        JPanel panelCustomer= new JPanel(new GridLayout(3,2,5,5));
        panelCustomer.setPreferredSize(new Dimension(450, 120));
        panelCustomer.setBorder(BorderFactory.createTitledBorder("Data Pelanggan"));
        
        JLabel labelNama = new JLabel("Nama  :");
        JTextField textNama = new JTextField(30);
        JLabel labelAlamat = new JLabel("Alamat:");
        JTextField textAlamat = new JTextField(30);
        JLabel labelTelp = new JLabel("No HP :");
        JTextField textTelp = new JTextField(30);
        
        panelCustomer.add(labelNama);
        panelCustomer.add(textNama);
        panelCustomer.add(labelAlamat);
        panelCustomer.add(textAlamat);
        panelCustomer.add(labelTelp);
        panelCustomer.add(textTelp);
                // Panel untuk menu makanan
        JPanel panelMenu = new JPanel();
        panelMenu.setPreferredSize(new Dimension(450, 150));
        panelMenu.setBorder(BorderFactory.createTitledBorder("Menu Makanan"));
        
        // Harga menu
        int hargaSteak = 100000;
        int hargaSpaghetti = 40000;
        int hargaPizza = 80000;
        
        JCheckBox checkSteak = new JCheckBox("Steak - Rp " + hargaSteak);
        JCheckBox checkSpaghetti = new JCheckBox("Spaghetti - Rp " + hargaSpaghetti);
        JCheckBox checkPizza = new JCheckBox("Pizza - Rp " + hargaPizza);
        
        panelMenu.add(checkSteak);
        panelMenu.add(checkSpaghetti);
        panelMenu.add(checkPizza);
        
        // Label untuk total bayar
        JLabel labelTotal = new JLabel("TOTAL BAYAR: Rp 0");
        labelTotal.setFont(new Font("Arial", Font.BOLD, 16));
        
        // Button pesan
        JButton buttonPesan = new JButton("PESAN SEKARANG!");
        buttonPesan.setBackground(Color.GREEN);
        buttonPesan.setForeground(Color.WHITE);
        
        // Area untuk struk pesanan
        JTextArea strukArea = new JTextArea(15, 38);
        strukArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(strukArea);
        
        // Fungsi untuk menghitung total
        ActionListener hitungTotal = e -> {
            int total = 0;
            if(checkSteak.isSelected()) total += hargaSteak;
            if(checkSpaghetti.isSelected()) total += hargaSpaghetti;
            if(checkPizza.isSelected()) total += hargaPizza;
            labelTotal.setText("TOTAL BAYAR: Rp " + total);
        };
        
        // Tambahkan listener ke checkbox
        checkSteak.addActionListener(hitungTotal);
        checkSpaghetti.addActionListener(hitungTotal);
        checkPizza.addActionListener(hitungTotal);
        
        // Fungsi untuk button pesan
        buttonPesan.addActionListener(e -> {
            // Validasi input
            if(textNama.getText().isEmpty() || textAlamat.getText().isEmpty() || textTelp.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Mohon isi semua data pelanggan!");
                return;
            }
            
            if(!checkSteak.isSelected() && !checkSpaghetti.isSelected() && !checkPizza.isSelected()) {
                JOptionPane.showMessageDialog(frame, "Pilih minimal satu menu!");
                return;
            }
            
            // Buat struk
            StringBuilder struk = new StringBuilder();
            struk.append("=== STRUK PESANAN ===\n\n");
            struk.append("Nama    : ").append(textNama.getText()).append("\n");
            struk.append("Alamat  : ").append(textAlamat.getText()).append("\n");
            struk.append("No HP   : ").append(textTelp.getText()).append("\n\n");
            struk.append("PESANAN:\n");
            
            int total = 0;
            if(checkSteak.isSelected()) {
                struk.append("- Steak      Rp ").append(hargaSteak).append("\n");
                total += hargaSteak;
            }
            if(checkSpaghetti.isSelected()) {
                struk.append("- Spaghetti  Rp ").append(hargaSpaghetti).append("\n");
                total += hargaSpaghetti;
            }
            if(checkPizza.isSelected()) {
                struk.append("- Pizza      Rp ").append(hargaPizza).append("\n");
                total += hargaPizza;
            }
            
            struk.append("\n===================");
            struk.append("\nTOTAL     : Rp ").append(total);
            struk.append("\n===================\n\n");
            
            strukArea.setText(struk.toString());
        });
        
        // Tambahkan semua komponen ke frame
        frame.add(panelCustomer);
        frame.add(panelMenu);
        frame.add(labelTotal);
        frame.add(buttonPesan);
        frame.add(scrollPane);
        
        // Tampilkan frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}