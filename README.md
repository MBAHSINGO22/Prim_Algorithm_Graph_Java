# Prim Algorithm Graph Java

Implementasi Algoritma Prim untuk Minimum Spanning Tree di Java

## 📖 Deskripsi Proyek
Proyek Java yang mengimplementasikan graf berbobot dengan matriks adjacensi dan algoritma Prim untuk menemukan Minimum Spanning Tree (MST).

### Komponen Utama
- **Vertex.java**: Kelas dasar untuk vertex dengan label karakter dan flag kunjungan.
- **Edge.java**: Kelas untuk merepresentasikan edge dengan sumber, tujuan, dan bobot, digunakan dalam algoritma Prim.
- **Graph.java**: Kelas utama untuk mengelola graf dengan metode addVertex, addEdge, dan implementasi algoritma Prim.
- **GraphMain.java**: Kelas utama untuk menguji algoritma Prim pada graf berbobot dengan 10 vertex, menampilkan edge MST dan total bobot.

Proyek ini terdiri dari empat file Java dalam paket `PERTEMUAN10`.

## 🧠 Teknologi
- Java

## 📂 Struktur File
```
Prim_Algorithm_Graph_Java/
├── src/PERTEMUAN10/
├── GraphMain.java           # Kelas utama untuk pengujian
├── Graph.java               # Kelas untuk graf dan algoritma Prim
├── Vertex.java              # Kelas vertex
├── Edge.java                # Kelas edge untuk MST
```

## 🟢 Catatan
- Graf diinisialisasi dengan maksimum 10 vertex dan matriks adjacensi diisi `-1` untuk edge yang tidak ada.
- Algoritma Prim menghasilkan MST dengan memilih edge berbobot minimum, dimulai dari vertex 0.

## 📈 Contoh Output
```
Prim Algorithm
(0 -> 1, Weight: 5)
(1 -> 3, Weight: 4)
(3 -> 2, Weight: 4)
(3 -> 5, Weight: 6)
(5 -> 6, Weight: 3)
(6 -> 7, Weight: 6)
(7 -> 8, Weight: 4)
(7 -> 9, Weight: 6)
(3 -> 4, Weight: 8)
Total weight is 46
```

## 👨‍💻 Pengembang
MBAHSINGO22  
🔗 GitHub
