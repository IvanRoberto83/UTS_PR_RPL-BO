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
    <li><b>Tiket(String idTiket, double hargaDasar, Film film)</b><br>
        Constructor untuk menginisialisasi ID tiket, harga dasar, dan film.
    </li>
    <li><b>getIdTiket()</b><br>
        Mengembalikan ID tiket.
    </li>
    <li><b>getHargaDasar()</b><br>
        Mengembalikan harga dasar tiket.
    </li>
    <li><b>setHargaDasar(double hargaDasar)</b><br>
        Mengubah nilai harga dasar tiket.
    </li>
    <li><b>getFilm()</b><br>
        Mengembalikan objek Film yang terkait dengan tiket.
    </li>
    <li><b>getInfo()</b><br>
        Mengembalikan informasi lengkap tiket (ID, film, harga).
    </li>
    <li><b>validasiId(String idTiket)</b><br>
        Memvalidasi apakah ID tiket sesuai dengan format tertentu.
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
    <li><b>hitungHarga()</b><br>
        Menghitung harga tiket reguler (sama dengan harga dasar).
    </li>
    <li><b>scan()</b><br>
        Mengembalikan pesan hasil pemindaian tiket reguler.
    </li>
</ul>

<h3>4. Class TiketVIP</h3>
<p>
Subclass dari Tiket yang merepresentasikan tiket VIP.
Biasanya memiliki tambahan biaya dari harga dasar.
</p>
<ul>
    <li><b>hitungHarga()</b><br>
        Menghitung harga tiket VIP (naik 25% dari harga dasar).
    </li>
    <li><b>scan()</b><br>
        Mengembalikan pesan hasil pemindaian tiket VIP.
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
TEST 1 - Validasi ID (Materi: Manipulasi String dan Regex) : 10 <br>
TEST 2 - Invalid ID (Materi: Manipulasi String dan Regex) : 10 <br>
TEST 3 - Hitung Harga Reguler (Materi: Inheritance & Abstract Class) : 15 <br>
TEST 4 - Hitung Harga VIP (Materi: Overriding & Abstract Class) : 15 <br>
TEST 5 - Interface Scan (Materi: Interface dan Polimorfisme) : 15 <br>
TEST 6 - Polymorphism & Transaksi (Materi: Interface dan Polimorfisme) : 15 <br>
TEST 7 - Jumlah Tiket (Materi: Collection ArrayList) : 20 <br>

<h3> Total Poin : 70</h3>