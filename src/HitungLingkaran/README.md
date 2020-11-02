## APLIKASI PERHITUNGAN LINGKARAN


### 1. Desain Form Seperti Gambar Dibawah kemudian sesuaikan penamaan VARIABEL untuk jTextField

![Penamaan Variabel](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/HitungLingkaran/variabel_lingkaran.png)

### 2. Klik 2x Tombol Hitung Kemudian masukkan kode berikut : DAN CERMATI BAIK_BAIK


```java

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Deklarasi variabel
        double r, k, l; // double d kecil, double = bilangan pecahan
        
        // Konstanta untuk Pi lingkaran, bernilai 3.14
        final double PI = 3.14;
        
        /* mengambil nilai jari-jari pada variabel "variabel_jarijari" 
         "variabel_jarijari" ada pada jTextField */
        r = Double.valueOf(variabel_jarijari.getText()); // Double D besar
                                                         // valueOf | v kecil | Of O gede
        
        /* Perhitungan Rumus Mulai */
        // Rumus UMUM Keliling Lingkaran = 2 * pi * jari-jari (2 pi eR)
        k = 2 * PI * r;
        
        // Rumus UMUM Luas Lingkaran = phi * jari-jari * jari-jari (pi eR Kuadrat)
        l = PI * (Math.pow(r, 2)); // Math.pow(angka, pangkatnya)
                                   // digunakan untuk menghitung perpangkatan
        /* Perhitungan Rumus Selesai */
        
        /* Nilai Hasil Perhitungan Masih bentuk numerik
           Jadi Harus diubah ke bentuk kalimat / String 
           Agar dapat ditampilkan pada jTextField
        */
        
        // Ubah ke String, dan deklarasi variabel
        /* cara lain mendeklarasikan variabel :
           tipeData namaVariabel = nilai; */
        String keliling = String.valueOf(k); // ubah k (numerik) ke keliling (string)
        String luas = String.valueOf(l); // ubah l (numerik) ke luas (string)
        
        // Tampilkan hasilnya ke jTextField
        variabel_keliling.setText(keliling);
        variabel_luas.setText(luas);
    }
    
    
```


### BACA DAN CERMATI BAIK_BAIK KODINGAN DIATAS

### 3. Jalankan Program dan Berikut adalah Hasilnya :

![Hasil](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/HitungLingkaran/hasil_lingkaran.png)
