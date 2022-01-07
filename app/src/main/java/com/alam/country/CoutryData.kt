package com.alam.country

object CoutryData {
    private val countryName = arrayOf(
        "Indonesia",
        "Malaysia",
        "Brazil",
        "China",
        "Amerika Serikat",
        "Arab Saudi",
        "Prancis",
        "Jepang",
        "Korea Selatan",
        "Italia"
    )

    private val countryCapital = arrayOf(
        "Jakarta",
        "Kuala Lumpur",
        "Brasilia",
        "Beijing",
        "Washinton DC",
        "Riyadh",
        "Paris",
        "Tokyo",
        "Seoul",
        "Roma"
    )

    private val countryDetail = arrayOf(
        "Republik Indonesia (RI) adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Oseania, serta antara Samudra Pasifik dan Samudra Hindia. Indonesia adalah negara kepulauan terbesar di dunia yang terdiri dari 17.504 pulau. Nama alternatif yang biasa dipakai adalah Nusantara. Dengan populasi mencapai 270.203.917 jiwa pada tahun 2020, Indonesia menjadi negara berpenduduk terbesar keempat di dunia dan negara berpenduduk Muslim terbesar di dunia, dengan penganut lebih dari 230 juta jiwa.",
        "Malaysia adalah sebuah negara federal yang terdiri dari tiga belas negeri (negara bagian) dan tiga wilayah federal di Asia Tenggara dengan luas 330.803 km persegi. Ibu kotanya adalah Kuala Lumpur, sedangkan Putrajaya menjadi pusat pemerintahan federal. Jumlah penduduk negara ini mencapai 32.730.000 jiwa pada tahun 2020. Negara ini dipisahkan ke dalam dua kawasan — Malaysia Barat dan Malaysia Timur — oleh Kepulauan Natuna, wilayah Indonesia di Laut Tiongkok Selatan. Malaysia berbatasan dengan Thailand, Indonesia, Singapura, Brunei, dan Filipina. Negara ini terletak di dekat khatulistiwa dan beriklim tropika.",
        "Republik Federatif Brasil atau Republik Federal Brasil adalah negara dengan ukuran wilayah dan populasi terbesar di Amerika Selatan. Negara ini merupakan negara paling timur di Benua Amerika Selatan dan berbatasan dengan Pegunungan Andes dan Samudra Atlantik. Nama Brasil diambil dari nama Kayu Brasil, sejenis kayu lokal. Brasil merupakan tempat pertanian ekstensif dan hutan hujan tropis.",
        "Tiongkok, atau nama lengkapnya Republik Rakyat Tiongkok atau Republik Rakyat China adalah sebuah negara yang terletak di Asia Timur. Negara ini memiliki jumlah penduduk terbanyak di dunia (sekitar 1,4 miliar jiwa, mayoritas merupakan suku Han) dan luas daratan 9,59 juta kilometer persegi, menjadikannya negara ke-3 terbesar di dunia. Negara ini didirikan pada tahun 1949 setelah berakhirnya Perang Saudara Tiongkok, dan sejak saat itu dipimpin oleh sebuah partai tunggal, yaitu Partai Komunis Tiongkok (PKT).",
        "Amerika Serikat, disingkat dengan AS adalah sebuah negara republik konstitusional federal yang terdiri dari lima puluh negara bagian dan sebuah distrik federal. Negara ini terletak di bagian tengah Amerika Utara, yang menjadi lokasi dari empat puluh delapan negara bagian yang saling bersebelahan, beserta distrik ibu kota Washington, D.C.. Amerika Serikat diapit oleh Samudra Pasifik dan Atlantik di sebelah barat dan timur, berbatasan dengan Kanada di sebelah utara, dan Meksiko di sebelah selatan. Dua negara bagian lainnya, yaitu Alaska dan Hawaii, terletak terpisah dari dataran utama Amerika Serikat.",
        "Arab Saudi secara resmi dikenal sebagai Kerajaan Arab Saudi atau Kingdom of Saudi Arabia (KSA), adalah sebuah negara Arab di Asia Barat yang mencakup hampir keseluruhan wilayah Semenanjung Arabia. Arab Saudi secara geografis merupakan negara terbesar ke lima di Asia dan kedua terbesar di Dunia Arab setelah Aljazair. Arab Saudi berbatasan langsung dengan Yordania dan Irak ke utara, Kuwait ke timur laut, Qatar, Bahrain, dan Uni Emirat Arab ke timur, Oman ke tenggara, dan Yaman ke selatan. Negara ini terpisah dengan Israel dan Mesir oleh Teluk Aqaba. Negara ini adalah satu-satunya negara yang memiliki dua pesisir penting, yakni Laut Merah dan Teluk Persia, dan sebagian besar wilayah Arab Saudi merupakan gurun pasir.",
        "Prancis , secara resmi disebut sebagai Republik Prancis adalah sebuah negara yang teritori metropolitannya terletak di Eropa Barat dan juga memiliki berbagai pulau dan teritori seberang laut yang terletak di benua lain. Prancis Metropolitan memanjang dari Laut Mediterania hingga Selat Inggris dan Laut Utara, dan dari Rhine ke Samudera Atlantik. Orang Prancis sering menyebut Prancis Metropolitan sebagai \"L'Hexagone\" (\"Heksagon\") karena bentuk geometris teritorinya. Prancis adalah sebuah republik kesatuan semi-presidensial. Ideologi utamanya tercantum dalam Deklarasi Hak Asasi Manusia dan Warga Negara dan Sekuler garis keras",
        "Jepang adalah sebuah negara kepulauan di Asia Timur. Letaknya di ujung barat Samudra Pasifik, di sebelah timur Laut Jepang, dan bertetangga dengan Republik Rakyat Tiongkok, Korea Selatan, dan Rusia. Pulau-pulau paling utara berada di Laut Okhotsk, dan wilayah paling selatan berupa kelompok pulau-pulau kecil di Laut Tiongkok Timur, tepatnya di sebelah selatan Okinawa yang bertetangga dengan Taiwan (Republik Tiongkok).",
        "Republik Korea atau biasa dikenal sebagai Korea Selatan adalah sebuah negara di Asia Timur yang meliputi bagian selatan Semenanjung Korea. Di sebelah utara, Republik Korea berbataskan Korea Utara, di mana keduanya bersatu sebagai sebuah negara hingga tahun 1948. Laut Kuning di sebelah barat, Jepang berada di seberang Laut Jepang (disebut \"Laut Timur\" oleh orang-orang Korea) dan Selat Korea berada di bagian tenggara. Negara ini dikenal dengan nama Hanguk (한국; 韓國). oleh penduduk Korea Selatan dan disebut Namchosŏn (남조선; 南朝鮮; \"Chosŏn Selatan\") di Korea Utara.",
        "Italia adalah sebuah negara kesatuan republik parlementer di Eropa Terletak di jantung Laut Mediterania. Italia berbatasan dengan Prancis, Swiss, Austria, Slovenia, San Marino dan Vatikan. Dilihat dari bentuknya, peta Italia berbentuk seperti sepatu bot atau di Italia sering disebut lo Stivale. Dengan jumlah penduduk mencapai 61 juta jiwa, Italia merupakan negara anggota Uni Eropa ketiga yang paling banyak penduduknya setelah Jerman dan Prancis."
    )

    private val countryLead = arrayOf(
        "Joko Widodo",
        "Ismail Sabri Yaakob",
        "Jair Bolsonaro",
        "Xi Jinping",
        "Joe Biden",
        "Salman bin Abdul-Aziz al-Saud",
        "Emmanuel Macron",
        "Naruhito",
        "Moon Jae-in",
        "Sergio Mattarella"
    )

    private val countryLanguage = arrayOf(
        "Bahasa Indonesia",
        "Bahasa Melayu",
        "Bahasa Portugis",
        "Bahasa Mandarin",
        "Tidak ada bahasa resmi di tingkat federal",
        "Bahasa Arab",
        "Bahasa Prancis",
        "Bahasa Jepang",
        "Bahasa Korea",
        "Bahasa Italia"
    )

    private val countryArea = arrayOf(
        "1.904.569 kilometer persegi",
        "330.803 kilometer persegi",
        "8.515.767 kilometer persegi",
        "9.596.961 kilometer persegi",
        "9.826.675 kilometer persegi",
        "2.149.690 kilometer persegi",
        "547.030 kilometer persegi",
        "377.974 kilometer persegi",
        "100.363 kilometer persegi",
        "301.338 kilometer persegi"
    )

    private val countryMoney = arrayOf(
        "Rupiah (Rp)",
        "Ringgit (RM)",
        "Real (R$)",
        "Renminbi (yuan; ¥)",
        "Dolar Amerika Serikat (US$)",
        "Riyal Saudi (ر.س)",
        "Euro (€)",
        "Yen (¥)",
        "Won Republik Korea (₩)",
        "Euro (€)"
    )

    private val countryImages = intArrayOf(
        R.drawable.indonesia,
        R.drawable.malaysia,
        R.drawable.brazil,
        R.drawable.china,
        R.drawable.us,
        R.drawable.arab_saudi,
        R.drawable.france,
        R.drawable.japan,
        R.drawable.south_korea,
        R.drawable.italy
    )

    val listData: ArrayList<Country>
    get() {
        val list = arrayListOf<Country>()
        for (position in countryName.indices) {
            val country = Country()
            country.name = countryName[position]
            country.capital = countryCapital[position]
            country.detail = countryDetail[position]
            country.lead = countryLead[position]
            country.language = countryLanguage[position]
            country.area = countryArea[position]
            country.money = countryMoney[position]
            country.photo = countryImages[position]
            list.add(country)
        }
        return list
    }

}