package ARRAY_ZERO_TO_EXPERT.LEVEL_1_DAN_2; 
public class RakSepatu {
    public static void main(String[] args) {
        // --- BAGIAN 1: MEMBUAT ARRAY (Wadah) ---
        // Kita siapkan rak dengan 4 slot kosong
        String[] rak = new String[4]; 

        // --- BAGIAN 2: MENGISI DATA ---
        // Kita taruh sepatu di slot tertentu
        rak[0] = "Adidas";
        rak[1] = "Nike";
        rak[2] = "Vans";
        // Slot ke-3 (index 3) sengaja kita kosongkan (null)

        // --- BAGIAN 3: MEMBEDAH (Akses & Ubah) ---
        System.out.println("Isi rak nomor 2: " + rak[1]); // Harusnya muncul Nike
        
        // Kita ganti isi rak 1
        rak[1] = "Ortu Sight"; // Sudah diganti dari Nike
        System.out.println("Isi rak nomor 2 sekarang: " + rak[1]);

        // --- BAGIAN 4: MELIHAT SEMUA ISI (Looping) ---
        // TRICK DISINI: (i + 1)
        // Saat i = 0, yang ditampilkan (0 + 1) = 1
        // Saat i = 1, yang ditampilkan (1 + 1) = 2
        System.out.println("\n--- Cek Seluruh Rak ---");
        // Kita tetap mulai i dari 0, karena array butuh index 0.
        for (int i = 0; i < rak.length; i++) {
            // System.out.println("Slot ke-" + i + " berisi: " + rak[i]); // versi lama hitung dari slot dari 0 - computer proses
            System.out.println("Slot ke-" + (i + 1) + " berisi: " + rak[i]); // hitung dari 1 lebih manusiawi
        }
    }
}