/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 * 1301154511
 * NABILA KUSUMA PUTRI
 * @author Nabila Kusuma
 */

public class Mahasiswa {
    private String Nama;
    private String NIM;
    private String Status;
    char[] Nilai;
    int i;
    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public void setNIM(String NIM){
        
        this.NIM = NIM;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getStatus() {
        return Status;
    }
    
   public Mahasiswa() {
       this.Status = "Tidak Lulus";
       this.i = 0;
       this.Nilai = new char[10];
   }
   
   public Mahasiswa(String a, String b) {
       this.Nama = a;
       this.NIM = b;
       this.Status = "Tidak Lulus";
       this.i = 0;
       this.Nilai = new char[10];
   }
   
   public void addNilai (char Nilai) {
       this.Nilai[i] = Nilai;
       i++;
   }
   
   public char getNilai(int i) {
       return this.Nilai[i];
   }
   
   public String toString() {
       String a = NIM+", "+Nama+", "+Status+", Nilai : ";
       for (int b=0 ; b<i ; b++) {
           a = a + Nilai[b] + ", ";
       }
        return a;
   }
   
   public char cekNilai(Mahasiswa m) {
       char z=0;
       for (char n='A' ; n<'E' ; n++) {
           for (int a=1 ; a<=i ; a++) {
               if (Nilai[a] == n) {
                   for (int c=1 ; c<=m.i ; c++) {
                       if (m.Nilai[c] == n) {
                           return n;
                       }
                   }
               }
           }
       }
       return z;
   }
}
