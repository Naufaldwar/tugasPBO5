package tugas5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author User
 */
public class PersegiPanjang implements MenghitungBidang {
    public double panjang, lebar;

    public void setPanjang(double inputPanjang) {
        panjang = inputPanjang;
    }

    public void setLebar(double inputLebar) {
        lebar = inputLebar;
    }

    

    @Override
    public double hitungKeliling(){
        return 2*(panjang+lebar);
    }

    @Override
    public double hitungLuas(){
        return panjang*lebar;
    }

    
    
}
