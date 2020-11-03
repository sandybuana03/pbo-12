## APLIKASI TAMPIL IDENTITAS SISWA


### 1. Desain Form Seperti Gambar Dibawah kemudian sesuaikan penamaan VARIABEL untuk jTextField

![Penamaan Variabel](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/Identitas/desain_variabel.png)

### 2. Klik 2x Tombol Tampilkan Kemudian masukkan kode berikut : DAN CERMATI BAIK_BAIK


```java

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // men set label [nama_variabel_jLabel.setText] dengan String dan mengambil nilai dari variabel jTextField
        // String selalu ditulis dalam tanda petik dua (" ISI_STRING ")
        // tanda plus (+) setelah string digunakan untuk menambah hal lain
        // hal lain disini adalah mengambil nilai dari masing-masing variabel jTextField [nama_variabel_jTextField.getText]
        label_nama.setText("Nama Siswa ; " + variabel_nama.getText());
        label_kelas.setText("Kelas            : " + variabel_kelas.getText());
        label_jurusan.setText("Jurusan       : " + variabel_jurusan.getText());
    }
    
```


### BACA DAN CERMATI BAIK_BAIK KODINGAN DIATAS

### 3. Jalankan Program dan Berikut adalah Hasilnya :

![Hasil](https://raw.githubusercontent.com/sandybuana03/pbo-12/main/src/Identitas/hasil.png)
