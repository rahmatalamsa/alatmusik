package dina.net.alatmusik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listview)
        var list = mutableListOf<Musik>()

        list.add(Musik("Gitar", "Gitar adalah sebuah alat musik berdawai yang dimainkan dengan cara dipetik, " +
                "umumnya menggunakan jari maupun plektrum. Gitar terbentuk atas sebuah bagian tubuh pokok dengan " +
                "bagian leher yang padat sebagai tempat senar yang umumnya berjumlah enam didempetkan", R.drawable.gitar))

        list.add(Musik("Biola", "Biola adalah sebuah alat musik dawai yang dimainkan dengan cara digesek. " +
                "Biola memiliki empat senar yang disetel berbeda satu sama lain dengan interval sempurna kelima. " +
                "Nada yang paling rendah adalah G", R.drawable.biola))

        list.add(Musik("Suling", "Suling adalah alat musik dari keluarga alat musik tiup kayu atau terbuat dari bambu. " +
                "Suara suling berciri lembut dan dapat dipadukan dengan alat musik lainnya dengan baik. " +
                "Suling modern untuk para ahli umumnya terbuat dari perak, emas atau campuran keduanya", R.drawable.suling))

        list.add(Musik("Ukulele", "Ukulele adalah alat musik petik sejenis gitar berukuran kecil, sekitar 20 inci, " +
                "dan merupakan alat musik asli Hawaii ditemukan sekitar tahun 1879, Alat musik 'Ukulele' " +
                "dalam bahasa hawaii artinya 'kutu loncat'. Lihat pada Ukulele History, dan A little History of Ukulele", R.drawable.ukulele))

        list.add(Musik("Flute", "Flute adalah alat musik dari keluarga alat musik tiup kayu atau terbuat dari bambu. " +
                "Suara suling berciri lembut dan dapat dipadukan dengan alat musik lainnya dengan baik. " +
                "Suling modern untuk para ahli umumnya terbuat dari perak, emas atau campuran keduanya", R.drawable.flute))

        list.add(Musik("Drum", "Drum adalah kelompok alat musik perkusi yang terdiri dari kulit yang " +
                "direntangkan dan dipukul dengan tangan atau sebuah batang. Selain kulit, drum juga " +
                "digunakan dari bahan lain, misalnya plastik", R.drawable.drum))

        list.add(Musik("Piano", "Piano adalah alat musik tuts yang diklasifikasikan sebagai instrumen dawai dan " +
                "perkusi yang dimainkan dengan menekan tuts-tuts pada papan piano. Setiap tuts " +
                "tersambung ke palu yang ada di dalam piano dan menekan senar di dalamnya, " +
                "sehingga menghasilkan bunyi", R.drawable.piano))

        list.add(Musik("Cello", "Selo, adalah sebuah alat musik dawai dan anggota dari keluarga biola. Orang yang memainkan selo " +
                "disebut cellis. Selo adalah alat musik yang populer dalam banyak segi: sebagai instrumen tunggal, " +
                "dalam musik kamar, dan juga sebagai fondasi dalam suara orkestra modern. Ukuran selo " +
                "masih lebih kecil daripada kontrabas", R.drawable.cello))

        list.add(Musik("Double Bass", "Kontrabas, disebut juga double bass atau bas betot, adalah alat musik dawai gesek terbesar " +
                "dengan nada terendah dalam orkestra modern. Dalam orkestra, alat musik ini termasuk dalam kelompok " +
                "alat musik gesek, serta orkes tiup, dan ditampilkan dalam musik concerto, " +
                "solo, dan kamar dalam musik klasik Barat", R.drawable.doublebass))

        list.add(Musik("Terompet", "Trompet adalah alat musik tiup logam. Terletak pada jajaran tertinggi di antara tuba, " +
                "eufonium, trombon, sousafon, French horn, dan Bariton. Trompet di-pitch di B♭. " +
                "Trompet hanya memiliki tiga tombol, dan pemain trompet harus menyesuaikan embouchure " +
                "untuk mendapatkan nada yang berbeda", R.drawable.terompet))
        listView.adapter = MusikAdapter(this, R.layout.alatmusik, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText( this, "Kamu memilih Gitar", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText( this, "Kamu memilih Biola", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText( this, "Kamu memilih Suling", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText( this, "Kamu memilih Ukulele", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText( this, "Kamu memilih Flute", Toast.LENGTH_SHORT).show()
                5 -> Toast.makeText( this, "Kamu memilih Drum", Toast.LENGTH_SHORT).show()
                6 -> Toast.makeText( this, "Kamu memilih Piano", Toast.LENGTH_SHORT).show()
                7 -> Toast.makeText( this, "Kamu memilih Cello", Toast.LENGTH_SHORT).show()
                8 -> Toast.makeText( this, "Kamu memilih Double Bass", Toast.LENGTH_SHORT).show()
                9 -> Toast.makeText( this, "Kamu memilih Terompet", Toast.LENGTH_SHORT).show()
            }
        }
    }
}