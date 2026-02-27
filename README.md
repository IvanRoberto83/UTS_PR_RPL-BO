<h1 style="text-align: center;">UTS - Ticketing Bioskop</h1>

<div style="display: flex; justify-content: center; align-items: center; flex-direction: column;">
    <div style="
        text-align: center;
        border: 1px solid black;
        border-radius: 10px;
        width: 75%;
        padding: 10px;
        ">
        <h2>Diagram</h2>
        <img src="./diagram.jpg">
    </div>
</div>

<h2>Penjelasan Class & Function</h2>

<h3>1. Class Film</h3>
<p>Merepresentasikan data film yang ditonton.</p>
<ul>
    <li><b>Film(String judul, int durasi)</b><br>
        Constructor untuk membuat objek film dengan judul dan durasi tertentu.
    </li>
    <li><b>getJudul()</b><br>
        Mengembalikan judul film.
    </li>
    <li><b>getDurasi()</b><br>
        Mengembalikan durasi film dalam bentuk menit.
    </li>
</ul>

<h3>2. Abstract Class Tiket</h3>
<p>
Class dasar (parent class) untuk semua jenis tiket.
Berisi atribut umum dan method yang wajib dimiliki semua turunan tiket.
</p>
<ul>
    <li><b>Tiket(String idTiket, Film film)</b><br>
        Constructor untuk menginisialisasi ID tiket dan Film. Tambahkan juga kondisi yang dapat mengatur hargaDasar. Ikuti ketentuan ini:
        <br>
        - Film "Merah Putih One For All" memiliki harga Rp80.000 <br>
        - Film "Demon Slayer: Infinity Castle" memiliki harga Rp50.000 <br>
        - Film "Spider-Man No Way Home" memiliki harga Rp55.000
        <br>
        Jangan lupa juga untuk memanggil method validasiId(String idTiket) di sini. Jika ID Tiket tidak valid, maka keluarkan output : "Format ID tiket tidak valid!".
        <br>
        <i>Tips: Gunakan throw new IllegalArgumentException("Pesan")</i>
    </li>
    <li><b>getIdTiket()</b><br>
        Mengembalikan ID tiket.
    </li>
    <li><b>getHargaDasar()</b><br>
        Mengembalikan harga dasar tiket.
    </li>
    <li><b>getInfo()</b><br>
        Mengembalikan informasi lengkap tiket (ID, Film, Harga).
    </li>
    <li><b>validasiId(String idTiket)</b><br>
        Memvalidasi apakah ID tiket sesuai dengan format berikut:
        <br>
        - Film "Merah Putih One For All" memiliki format MOFA-YYYY-XXXX <i>(Contoh: MOFA-2026-0001)</i> <br>
        - Film "Demon Slayer: Infinity Castle" format DSIC-YYYY-XXXX <i>(Contoh: DSIC-2026-0001)</i> <br>
        - Film "Spider-Man No Way Home" memiliki format SNWH-YYYY-XXXX <i>(Contoh: SNWH-2026-0001)</i>
        <br>
        <i>Tips: Gunakan Pattern.matches()</i>
    </li>
    <li><b>hitungHarga()</b> (abstract)<br>
        Method abstrak untuk menghitung harga akhir tiket.
        Wajib diimplementasikan oleh subclass.
    </li>
</ul>

<h3>3. Class TiketReguler</h3>
<p>
Subclass dari Tiket yang merepresentasikan tiket reguler.
</p>
<ul>
    <li><b>TiketReguler(String idTiket, Film film)</b><br>
        Constructor untuk menginisialisasi ID tiket dan Film.
    </li>
    <li><b>hitungHarga()</b><br>
        Menghitung harga tiket reguler (sama dengan harga dasar).
    </li>
    <li><b>scan()</b><br>
        Mengembalikan pesan hasil pemindaian tiket reguler. Formatnya : "Tiket Reguler (idTiket) berhasil discan"
    </li>
</ul>

<h3>4. Class TiketVIP</h3>
<p>
Subclass dari Tiket yang merepresentasikan tiket VIP. Memiliki tambahan biaya dari harga dasar.
</p>
<ul>
    <li><b>TiketVIP(String idTiket, Film film)</b><br>
        Constructor untuk menginisialisasi ID tiket dan Film.
    </li>
    <li><b>hitungHarga()</b><br>
        Menghitung harga tiket VIP (naik 25% dari harga dasar).
    </li>
    <li><b>scan()</b><br>
        Mengembalikan pesan hasil pemindaian tiket VIP. Formatnya : "Tiket VIP (idTiket) berhasil discan"
    </li>
</ul>

<h3>5. Interface Scannable</h3>
<p>
Interface yang mewajibkan class implementasinya memiliki method scan().
</p>
<ul>
    <li><b>scan()</b><br>
        Digunakan untuk mensimulasikan proses pemindaian tiket.
    </li>
</ul>

<h3>6. Class Transaksi</h3>
<p>
Class yang menangani kumpulan tiket dalam satu transaksi pembelian.
</p>
<ul>
    <li><b>tambahTiket(Tiket tiket)</b><br>
        Menambahkan objek tiket ke dalam daftar transaksi.
    </li>
    <li><b>hitungTotal()</b><br>
        Menghitung total harga semua tiket dalam transaksi.
    </li>
    <li><b>getJumlahTiket()</b><br>
        Mengembalikan jumlah tiket dalam transaksi.
    </li>
</ul>

<h2>Poin Penilaian</h2>
TEST 1 - Validasi ID : 10 <br>
TEST 2 - Invalid ID : 10 <br>
TEST 3 - Hitung Harga Reguler : 10 <br>
TEST 4 - Hitung Harga VIP : 10 <br>
TEST 5 - Interface Scan : 10 <br>
TEST 6 - Transaksi : 10 <br>
TEST 7 - Jumlah Tiket : 10 <br>

<h3> Total Poin : 70</h3>