package ARRAY_ZERO_TO_EXPERT.LEVEL_1_DAN_2;

public class RakSepatu1 {
    public static void main(String[] args) {
        // --- LOGIC TETAP SAMA ---
        String[] rak = new String[4]; 

        rak[0] = "Adidas";
        rak[1] = "Nike";
        rak[2] = "Vans";
        // Slot 3 null

        // --- BAGIAN DISPLAY (DIPERCANTIK) ---
        System.out.println("\n========================================");
        System.out.println("       SISTEM MANAJEMEN RAK SEPATU      ");
        System.out.println("========================================");

        // Update data
        System.out.println("LOG: Mengupdate data slot 2...");
        rak[1] = "Ortu Sight"; 
        System.out.println("LOG: Berhasil update menjadi 'Ortu Sight'\n");

        // --- MEMBUAT TABEL VISUAL ---
        System.out.println("+-------+----------------------+");
        System.out.println("| SLOT  | MERK SEPATU          |"); // Header Tabel
        System.out.println("+-------+----------------------+");

        // --- LOOPING (LOGIC SAMA, TAMPILAN BEDA) ---
        for (int i = 0; i < rak.length; i++) {
            
            // LOGIKA KOSMETIK (Ternary Operator): 
            // "Kalau rak[i] isinya null, tulis '[ KOSONG ]', kalau tidak, tulis isinya"
            // Ini biar mata tidak sakit melihat tulisan 'null'
            String tampilanIsi = (rak[i] == null) ? "[ KOSONG ]" : rak[i];

            // PRINTF (Format Print)
            // %-5d  : Siapkan 5 spasi untuk angka (d), rata kiri
            // %-20s : Siapkan 20 spasi untuk teks (s), rata kiri
            // %n    : Enter (garis baru)
            System.out.printf("| %-5d | %-20s |%n", (i + 1), tampilanIsi);
        }
        
        System.out.println("+-------+----------------------+");
        System.out.println("Total Kapasitas Rak: " + rak.length + " Ruang Sepatu");
    }
}
