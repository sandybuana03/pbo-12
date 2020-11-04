## APLIKASI PERHITUNGAN PANGKAT


### 1. Desain Form Seperti Gambar Dibawah kemudian sesuaikan penamaan VARIABEL untuk jTextField

![Penamaan Variabel](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/HitungPangkat/desain_variabel.png)

### 2. Klik 2x Tombol HASIL Kemudian masukkan kode berikut : DAN CERMATI BAIK_BAIK


```java

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Deklarasi variabel
        int angka, pangkat, hasil;
        
        // Mengambil nilai dari masing-masing variabel jTextField
        angka = Integer.valueOf(variabel_angka.getText());
        pangkat = Integer.valueOf(variabel_pangkat.getText());
        
        // Melakukan casting (mengubah tipe data) ke int bersamaan dengan perhitungan
        // Karena tipe data default Math.pow adalah double jadi harus diubah
        hasil = (int)Math.pow(angka,pangkat);
        
        // Ubah hasil ke String
        // simpan ke dalam variabel jawaban
        String jawaban = String.valueOf(hasil);
        
        // Tampilkan jawaban ke label_hasil
        label_hasil.setText("= " + jawaban);
    }
    
    
```


### BACA DAN CERMATI BAIK_BAIK KODINGAN DIATAS

### 3. Jalankan Program dan Berikut adalah Hasilnya :

![Hasil](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/HitungPangkat/hasil_pangkat.png)
