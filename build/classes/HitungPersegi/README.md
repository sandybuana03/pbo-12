## APLIKASI PERHITUNGAN PERSEGI


### 1. Desain Form Seperti Gambar Dibawah kemudian sesuaikan penamaan VARIABEL untuk jTextField

![Penamaan Variabel](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/HitungPersegi/variabel_persegi.png)

### 2. Klik 2x Tombol Hitung Kemudian masukkan kode berikut : DAN CERMATI BAIK_BAIK


```java

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        double s,k,l; // deklarasi variabel
        
        s = Double.valueOf(variabel_sisi.getText()); // ambil nilai sisi
        
        k = 4 * s; // hitung keliling
        l = s * s; // hirung luas
        
        // ubah numerik ke string
        // mengubah nilai numerik k ke string dan simpan ke keliling
        String keliling = String.valueOf(k); 
        // mengubah nilai numerik l ke string dan simpan ke luas
        String luas = String.valueOf(l); 
        
        // men-set text untuk textField (variabel_keliling & variabel_luas)
        // dengan cara mengambil nilai dari variabel string diatas (keliling dan luas)
        variabel_keliling.setText(keliling);
        variabel_luas.setText(luas);
    }
    
    
```


### BACA DAN CERMATI BAIK_BAIK KODINGAN DIATAS

### 3. Jalankan Program dan Berikut adalah Hasilnya :

![Hasil](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/HitungPersegi/hasil_persegi.png)
