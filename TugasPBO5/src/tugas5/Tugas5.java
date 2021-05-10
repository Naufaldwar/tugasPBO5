/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;
import java.awt.event.*;
import javax.swing.*; 



/**
 *
 * @author User
 */
public class Tugas5 {
    public static void main(String[] args) {
        GUI g = new GUI(); 
    }
}

class GUI extends JFrame implements ActionListener{
    JLabel jpanjang = new JLabel ("Panjang");
    final JTextField fpanjang = new JTextField (5);
    
    JLabel jlebar = new JLabel ("Lebar");
    final JTextField flebar = new JTextField (5);
    
    JLabel jtinggi = new JLabel ("Tingggi");
    final JTextField ftinggi = new JTextField (5);
    
    
    JButton bhitung = new JButton("HITUNG");
    
    JLabel hasil = new JLabel("Hasil Perhitungan : ");
    JLabel keliling = new JLabel();
    JLabel luas = new JLabel();
    JLabel luasPerm = new JLabel();
    JLabel volume = new JLabel();
    
    JButton breset = new JButton("RESET");
    
    public GUI(){
        setSize (300,500);
        
        setLayout(null);
        add(jpanjang);
        add(fpanjang);
        add(jlebar);
        add(flebar);
        add(jtinggi);
        add(ftinggi);
        add(hasil);
        add(bhitung);
        add(breset);
        
        jpanjang.setBounds(20,10,120,20);
        fpanjang.setBounds(130,10,120,20);
        jlebar.setBounds(20,40,120,20);
        flebar.setBounds(130,40,120,20);
        jtinggi.setBounds(20,70,120,20);
        ftinggi.setBounds(130,70,120,20);
        hasil.setBounds(20,130,200,40);
        bhitung.setBounds(20,100,100,20);
        breset.setBounds(150,100,100,20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        bhitung.addActionListener(this);
        breset.addActionListener(this);
    }
    

   @Override
     public void actionPerformed (ActionEvent a){
        if(a.getSource() == bhitung){
           try{
            double panjang,lebar,tinggi;
            panjang = Double.parseDouble(fpanjang.getText()); 
            lebar = Double.parseDouble(flebar.getText());
            tinggi = Double.parseDouble(ftinggi.getText());
            Balok balok = new Balok(panjang,lebar,tinggi);
            balok.setPanjang(panjang);
            balok.setLebar(lebar);
            balok.setTinggi(tinggi);
            
            
            keliling.setText("Keliling Persegi Panjang : "+ Double.toString(balok.hitungKeliling()));
            add(keliling);
            keliling.setBounds(20,190,200,20);
            
            luas.setText("Luas Persegi Panjang : "+ Double.toString(balok.hitungLuas()));
            add(luas);
            luas.setBounds(20,210,250,20);
           
            luasPerm.setText("Luas Permukaan Balok  : "+ Double.toString(balok.hitungLuasPermukaan()));
            add(luasPerm);
            luasPerm.setBounds(20,230,250,20);
            
            volume.setText("Volume Balok  : "+ Double.toString(balok.hitungVolume()));
            add(volume);
            volume.setBounds(20,250,180,20);
           }
           
           
           catch(NumberFormatException n)
           {
             JOptionPane.showMessageDialog(null,"" + n.getMessage());
             }
           } 
        
        if(a.getSource() == breset){
            fpanjang.setText(null);
            flebar.setText(null);
            ftinggi.setText(null);
            keliling.setText(null);
            luas.setText(null);
            luasPerm.setText(null);
            volume.setText(null);
        }
    }
    
}