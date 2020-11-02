private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Deklarasi variabel
        double r, k, l; // double d kecil, double = bilangan pecahan
        
        // Konstanta untuk Pi lingkaran, bernilai 3.14
        final double PI = 3.14;
        
        /* mengambil nilai jari-jari pada variabel "variabel_jarijari" 
         "variabel_jarijari" ada pada jTextField */
        r = Double.valueOf(variabel_jarijari.getText()); // Double D besar
        
        
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
