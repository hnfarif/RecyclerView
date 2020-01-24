package com.example.bestuniversity;

import java.util.ArrayList;

public class UniversityData {

    private static String[] universityNames = {
            "University of Oxford",
            "California Institute of Technology",
            "University of Cambridge",
            "Stanford University",
            "Massachusetts Institute of Technology",
            "Princeton University",
            "Harvard University",
            "Yale University",
            "University of Chicago",
            "Imperial College London"
    };

    private static String[] universityDetails = {
            "Meskipun data tentang berdirinya universitas ini masih belum terungkap, sejarah keberadaan Oxford University sudah terlacak pada akhir abad ke-11. Universitas ini terletak di Wellington Square, Oxford dan saat ini memiliki 20.000 mahasiswa. Ada empat divisi akademik di sini, yaitu Humaniora, Ilmu Medis, Matematika, Fisika & Ilmu Alam, dan Ilmu Sosial. Beberapa program yang ditawarkan diantaranya, sains, biokimia, kimia, komputer, ornitologi, ilmu teknik, Studi Islam, Material, Matematika, dan lain-lain.",
            "California Institute of Technology yang berlokasi di California, didirikan pada 1891. Penerimaan mahasiswa baru mencapai sekitar 2.100 orang. Jurusan yang tersedia di universitas ini seperti Biologi, Kimia dan Teknik Kimia, Teknik dan Sains Terapan, Ilmu Geologi dan ilmu Planet, Humaniora dan Ilmu Sosial, Fisika Matematika dan Astronomi dan program antardisiplin ilmu. Kampus menjamin akomodasi bagi semua mahasiswa sarjana dan tahun pertama bagi semua mahasiswa pascasarjana.",
            "University of Cambridge didirikan tahun 1209. Jumlah mahasiswa di kampus ini mencapai 17.000 orang, dan 3.000 diantaranya adalah mahasiswa internasional. Universitas Cambridge sangat menonjol di bidang matematika. Mahasiswa harus mengikuti ujian masuk jika ingin mengambil jurusan Seni, yang merupakan jurusan andalan di Cambridge. Ada enam sekolah yang ditawarkan, yaitu Seni dan Humaniora, Ilmu Biologi, Klinik Kedokteran, Humaniora dan Ilmu Sosial, Ilmu Fisika, dan Teknologi. Masing-masing jurusan mencakup kelompok fakultas tertentu. ",
            "Standford university pertama kali membuka pintu kelasnya untuk para mahasiswa pada tahun 1981, setelah melewati enam bulan masa perencanaan dan pembangunan; universitas ini terletak di Stanford, California. Sekolah-sekolah yang ditawarkan di universitas ini diantaranya, Sekolah Humaniora dan Sains, Sekolah Teknik, Sekolah Ilmu Kebumian, sekolah Pendidikan, Sekolah Bisnis Pascasarjana, Sekolah Hukum Stanford dan Sekolah Kedokteran Universitas Stanford. Sekolah-sekolah tersebut menawarkan program-program sarjana dan pascasarjana di berbagai bidang. ",
            "The Massachusetts Institute of Technology (MIT) menerima mahasiswa pertama kali pada 1865. Berlokasi di Charles River Basin, Cambridge, MIT diakreditasi oleh New England Association of Schools and Colleges. Beragam program studi tersedia di Fakultas Arsitektur dan perenecanaan, Fakultas Teknik, Fakultas Humaniora, Seni, dan Ilmu Sosial, Sekolah Manajemen Sloan, Fakultas Sains dan Sekolah Ilmu Kesehatan Whitaker. MIT memiliki enam kampus yang menyediakan akomodasi bagi mahasiswanya.",
            "Princeton University adalah sebuah universitas riset yang berlokasi di Princeton, New Jersey. Didirikan tahun 1746, awalnya bernama College of New Jersey. Kini ada sekitar 7.145 mahasiswa sarjana dan pascasarjana terdaftar di universitas ini. Mahasiswa tingkat sarjana memperoleh gelar Sarjana Seni (S.Sn) atau Sarjana Sains (S.Sc) dari berbagai jurusan yang berbeda. Sekolah Pascasarjana menawarkan jenjang lanjutan untuk jurusan Humaniora, Ilmu Sosial, Sains dan Teknik umum. Untuk kandidat doktor dengan gelar Ph.D dapat melakukan penelitian dalam berbagai program, antara lain: Matematika, Geosains, Filsafat, Religi, Sosiologi, Musik, Klasik, dan Psikologi. ",
            "Harvard College didirikan tahun 1636. Kampus utama Harvard berada di Cambridge dan Boston. Program studi di universitas ini tersebar di Fakultas Seni dan Sains, Sekolah Bisnis, Sekolah Desain, Sekolah Keagamaan, Sekolah Pascasarjana Pendidikan, Sekolah Pemerintahan JFK, Sekolah Hukum, Sekolah Kedokteran dan Sekolah Kesehatan Masyarakat. Selain menyelenggarakan pendidikan jenjang sarjana, pascasarjana, dan profesi, universitas ini juga punya program studi lanjutan dan summer program (program musim panas). Fasilitas yang tersedia di kampus ini di antaranya Museum Seni Harvard dan perpustakaan.",
            "Yale University didirikan tahun 1701. Termasuk anggota Ivy League, Yale merupakan universitas swasta di New haven, Connectitut. Yale University terbagi menjadi tiga komponen akademik: Yale College (untuk program sarjana), Graduate School of Arts and Sciences (Sekolah Pascasarjana Seni dan Sains), dan sekolah profesi. Universitas menawarkan program studi dan riset di 11 sekolah profesi dan pascasarjana: sekolah pascasarjana seni dan sains, keagamaan, kehutanan dan studi lingkungan, hukum, manajemen, kedokteran, keperawatan; dan empat sekolah tinggi seni: arsitektur, seni, drama, dan musik. ",
            "University of Chicago membuka kelas pertamanya pada 1892, berlokasi di Chicago, Illinois. Universitas ini menawarkan gelar Sarjana Seni dan Sains. Program sarjana tersebut meliputi bidang biologi, fisika, ilmu sosial, humaniora, dan studi antar cabang ilmu pengetahuan. Program master yang ditawarkan diselenggarakan di Sekolah Pascasarjana Bisnis, Studi Kebijakan Publik, Sekolah Hukum, Kedokteran dan Administrasi Layanan Sosial.",
            "Imperial College dibangun pada tahun 1907 untuk membantu pengembangan kajian interdisipliner, juga menawarkan berbagai fasilitas riset. Kampus utamanya berlokasi di Kensington Selatan, sementara kampus lainnya tersebar di Hammersmith, Silwood Park, Royal Brompton, Nortwick Park, Charing Cross, St Marys, Wye, Chelsea, dan Westminster. Ada sekitar 12.129 mahasiswa penuh-waktu yang terdaftar di universitas ini. Program yang ditawarkan adalah Fakultas Teknik, Fakultas Kedokteran, Sekolah Bisnis Imperial College, dan Fakultas Ilmu Alam. ",
    };

    private static int[] universityImages = {
            R.drawable.oxford_university,
            R.drawable.cit_university,
            R.drawable.university_of_cambridge,
            R.drawable.stanford_university,
            R.drawable.mit_university,
            R.drawable.princeton_university,
            R.drawable.harvard_university,
            R.drawable.yale_university,
            R.drawable.chicago_university,
            R.drawable.imperial_college
    };

    static ArrayList<University> getListData() {
        ArrayList<University> list = new ArrayList<>();
        for (int position = 0; position < universityNames.length; position++) {
            University hero = new University();
            hero.setName(universityNames[position]);
            hero.setDetail(universityDetails[position]);
            hero.setPhoto(universityImages[position]);
            list.add(hero);
        }
        return list;
    }


}
