/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.adobe.acrobat.Viewer;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.sql.SQLException;
import javax.swing.JPanel;
import ppl.koneksi;

/**
 *
 * @author JEE
 */
public class m_penyakit  extends JPanel {

    koneksi kon;
    private Viewer viewer;

    public m_penyakit() throws SQLException {
        kon = new koneksi("ppl", "root", "");
    }

    public String jerukcvpd() {
        String hasil = null;

        hasil = "CVPD\n"
                + "Apa Itu CVPD dan Mengapa Penting?\n"
                + "CVPD adalah nama penyakit jeruk, singkatan dari Citrus Vein Phloem Degeneration.\n"
                + "Dalam bahasa Indonesia nama ini berarti kerusakan pembuluh floem tanaman jeruk. Di luar\n"
                + "negeri penyakit ini dikenal dengan nama berbeda-beda di setiap negara. Nama CVPD sendiri,\n"
                + "meskipun dalam bahasa Inggris, adalah nama yang digunakan di Indonesia. Nama resmi yang\n"
                + "kini digunakan di seluruh dunia adalah huanglongbing, disingkat HLB, nama dalam bahasa\n"
                + "Mandarin yang berarti pucuk menguning.\n"
                + "Pembuluh floem adalah pembuluh yang terdapat pada kulit batang, berfungsi untuk\n"
                + "mengangkut bahan makanan, yang diolah tanaman pada daun, ke seluruh bagian tanaman.\n"
                + "Jika pembuluh floem mengalami keru-sakan maka bahan makanan tertumpuk pada daun\n"
                + "sehingga bagian lainnya mengalami kekurangan makanan. Akibatnya, pertumbuhan tanaman\n"
                + "me-rana dan tanaman menjadi mati secara pelan-pelan tetapi pasti. Pembuluh floem\n"
                + "mengalami kerusakan karena dijadikan tempat berkembang biak oleh\n"
                + "bakteri Candidatus Liberibacter asiaticus, penyebab penyakit CVPD.\n"
                + "Penyakit ini merupakan penyakit yang sangat ditakuti oleh petani jeruk di seluruh\n"
                + "dunia. Banyak pusat produksi jeruk di Indonesia telah dirusakkan oleh CVPD, demikian juga\n"
                + "pusat produksi jeruk di negara-negara lain. Penyakit ini ditakuti karena mudah menular dan\n"
                + "begitu tanaman terkena penyakit maka akhirnya pasti akan mati. Selama masih hidup\n"
                + "tanaman memang masih dapat berproduksi, tetapi buah jeruk menjadi berkurang, bentuk buah\n"
                + "menjadi tidak normal, ukuran buah menjadi lebih kecil, dan rasanya menjadi kecut.\n"
                + "B. Bagaimana Tanaman Jeruk Bisa Terkena CVPD?\n"
                + "Tanaman jeruk dapat terkena CVPD melalui salah satu dari dua cara penularan CVPD.\n"
                + "Pertama, CVPD dapat menular dengan perantaraan serangga kutu loncat jeruk Asia sebagai\n"
                + "vektor. Mengenai kutu loncat jeruk Asia ini akan diuraikan pada brosur tersendiri. Kedua,\n"
                + "melalui okulasi dengan menggunakan mata tempel yang diambil dari pohon induk\n"
                + "berpenyakit CVPD.\n"
                + "Vektor adalah mahluk hidup yang tubuhnya mengandung bibit penyakit tanpa harus\n"
                + "menjadi sakit, seperti nyamuk Anopeles yang tubuh-nya dapat mengandung plasmodium\n"
                + "tanpa harus menjadi sakit malaria atau nyamuk Aedes yang tidak perlu khawatir terkena\n"
                + "penyakit demam ber-darah dongue (DBD). Ketika kutu loncat jeruk Asia mengisap cairan\n"
                + "dari pucuk tanaman berpenyakit CVPD, cairan yang mengandung bakteri penyebab CVPD\n"
                + "masuk ke dalam tubuhnya. Cairan tersebut dapat dipin-dahkan ke tanaman sehat pada saat\n"
                + "kutu loncat tersebut menghisap cairan dari tanaman sehat.\n"
                + "C. Bagaimana Mengenali CVPD?\n"
                + "CPVD dapat dikenali dengan beberapa cara, dari cara yang seder-hana sampai cara\n"
                + "yang canggih. Cara sederhana biasanya kurang teliti, tetapi biayanya murah dan bila\n"
                + "dilakukan oleh orang yang berpengalaman, hasilnya bisa mendekati cara canggih yang\n"
                + "biayanya mahal. Dua cara sederhana untuk mengenali CVPD adalah pengamatan gejala dan\n"
                + "uji iodin. Pengamatan gejala adalah pengamatan yang dilakukan untuk melihat per-ubahan\n"
                + "yang terjadi pada tanaman yang menderita CVPD, sedangkan uji iodin adalah uji yang\n"
                + "dilakukan dengan meneteskan cairan iodium pada irisan daun yang diambil dari tanaman\n"
                + "sakit.\n"
                + "CVPD menimbulkan beberapa gejala khas yang dapat digunakan untuk mengenali\n"
                + "keberadaannya. Pada tanaman yang baru mulai menderita CVPD, salah satu cabangnya akan\n"
                + "tampak menguning (Gb. 1). Daun pada cabang tersebut tampak berbelang-belang hijaukuning secara tidak simetris antara bagian kanan dan kiri tulang daun utama (Gb. 2). Daun-daun kemudian akan mempunyai tulang daun yang lebih tebal dan ber-gabus, bagian daun\n"
                + "menguning yang semakin mencakup seluruh permuka-an daun, serta daun menjadi lebih\n"
                + "kaku, tumbuh lebih tegak, dan kadang-kadang berbentuk tidak normal . Lama kelamaan, daun\n"
                + "gugur dan cabang menjadi tumbuh meranggas, tanaman tampak tumbuh merana, sebelum\n"
                + "akhirnya tanaman mati .\n"
                + "Gejala belang hijau-kuning pada daun mirip dengan gejala keku-rangan unsur hara dan\n"
                + "gejala hama-penyakit lain. Namun bila dilakukan pengamatan dengan teliti maka akan\n"
                + "ditemukan perbedaannya sebagai-mana tampak pada Gb. 5-Gb. 8. Mengingat hal ini,\n"
                + "pengenalan penyakit CVPD dengan berdasarkan gejala sebaiknya tidak dilakukan terhadap\n"
                + "tanaman yang sudah sakit parah dan tidak dilakukan pada musim kemarau ketika tanaman\n"
                + "tidak dalam keadaan segar.\n"
                + "Gb. 5. Defisiensi Besi (Fe) Gb. 6. Defisiensi Seng (Zn)\n"
                + "Gb. 7. Defisiensi Mangan\n"
                + "(Mn)\n"
                + "Gb. 8. Defisiensi Magnesium\n"
                + "(Mg)\n"
                + "Buah tanaman yang menderita CVPD berukuran lebih kecil dan berbentuk tidak normal\n"
                + "(Gb. 9). Menjelang masak, buah menguning dari bagian pangkal (Gb. 10 dan Gb. 11), bukan\n"
                + "dari bagian ujung sebagaimana seharusnya. Bila buah dibelah melalui bagian pangkal,\n"
                + "tampak pembuluh berwarna cokelat muda (Gb. 12). Bila buah dibelah melintang, tampak biji\n"
                + "yang kisut dan menghitam (Gb. 13).\n"
                + "Gb. 9. Buah berukuran dan\n"
                + "berbentuk tidak normal\n"
                + "Gb. 10. Buah jeruk keprok\n"
                + "menguning dari pangkalGb. 11. Buah\n"
                + "jeruk manis\n"
                + "menguning\n"
                + "Gb. 12. Pembuluh\n"
                + "berwarna cokelat\n"
                + "muda\n"
                + "Gb. 13. Biji kisut dan\n"
                + "menghitam\n"
                + "Pada tanaman yang sudah sakit parah, gejala CVPD sangat sulit dapat dikenali. Untuk\n"
                + "lebih memastikan tanaman menderita CPVD, dapat dilakukan uji sederhana yang dikenal\n"
                + "dengan uji iodin. Untuk melakukan uji ini, terlebih dahulu perlu disiapkan larutan iodin\n"
                + "dengan mencampurkan 1 bagian cairan iodium tinktur (obat merah Betadine tidak boleh\n"
                + "digunakan) ke dalam 9 bagian air minum kemasan (1:9). Kemudian, diambil satu helai daun\n"
                + "bergejala CVPD dan diiris seperti tampak pada Gb. 14. Irisan daun kemudian dicelupkan ke\n"
                + "dalam larutan iodin selama 1,5 sampai 2 menit lalu diperhatikan perubahan warna yang\n"
                + "terjadi pada bagian tepi irisan daun. Bila warna tepi irisan berubah menjadi biru gelap maka\n"
                + "perubahan warna tersebut menandakan tanaman berpenyakit CVPD (Gb. 15), sebaliknya bila\n"
                + "warna tidak berubah menandakan tanaman sehat (Gb. 16). Bila perubahan warna kurang jelas\n"
                + "(Gb. 17), uji diulangi dengan membuat irisan baru dari daun lain sampai diperoleh hasil\n"
                + "seperti pada Gb. 15 atau Gb. 16.\n"
                + "Gb. 14. Cara memotong daun\n"
                + "untuk pelaksanaan uji iodin\n"
                + "Gb. 15. Tepi potongan daun\n"
                + "berwar-na biru gelap bila\n"
                + "berpenyakit CVPD\n"
                + "Gb. 16. Tepi potongan daun\n"
                + "tidak berwarna biru gelap\n"
                + "Gb. 17. Tepi potongan daun\n"
                + "berwar-na biru gelapbila tidak ber-penyakit\n"
                + "CVPD (sehat)\n"
                + "sebagian-sebagian, uji perlu\n"
                + "diulang\n"
                + "Pengenalan CVPD dengan menggunakan gejala dan uji iodin memang tidak dapat\n"
                + "memberikan hasil yang benar-benar akurat. Namun karena biayanya murah maka dapat\n"
                + "dilakukan dalam jumlah banyak, di-bandingkan misalnya dengan uji canggih yang biayanya\n"
                + "mahal. Mengingat tingkat akurasi uji iodin adalah 65% maka bila dari 100 pengujian ditemukan 80 hasil positif, setidak-tidaknya 52 pengujian adalah akurat. Untuk hasil yang benarbenar akurat dapat dilakukan uji PCR (polimerase chain reaction), tetapi uji ini hanya dapat\n"
                + "dilakukan di laboratorium di luar NTT. Bukan tidak mungkin selama pengangkutan ke\n"
                + "laboratorium sampel meng-alami kerusakan sehingga hasilnya juga dapat tidak benar-benar\n"
                + "akurat.";
        return hasil;
    }
    

}
