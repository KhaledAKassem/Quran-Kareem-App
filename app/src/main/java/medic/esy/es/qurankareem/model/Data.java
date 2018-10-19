package medic.esy.es.qurankareem.model;


import java.util.ArrayList;



public class Data {
    String name;
    String linkName;
    String server;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String serverName) {
        this.server = serverName;
    }

    public static ArrayList<String> getReaderName() {

        String readerName1[] = {
                "Reader / Ahmed Alhazhify", "Reader / Ahmad Alhawashy", "Reader /  Ahmed Eltrabolsy",
                "Reader / Ahmed Alagamy","Reader / Ahmed Eltrabolsy","Reader / Ahmed Masoud",
                "Reader / Ahmed Saber","Reader / Ahmed Amer","Reader / Ahmed Neinaa",
                "Reader / Akhil Abdulhayy Rawa ","Reader / Akram Alalaqmi","Reader / Ibrahim Al Akhdar",
                "Reader / Idris Abkar",
                "Reader /  Ibrahim Al-Jebreen"
                ,"Reader / Ibrahim El Garmy",
                "Reader / Ibrahim Eldosery","Reader / Ibrahim Eldosery"
                ,"Reader / Ibrahem Assadan",
                "Reader / Ibrahim Al-Asiri","Reader / Professor Zamra"
                ,"Reader / Al Husseiny Al Azzazy","Reader /Doukkali Mohammed Al Alem",
                "Reader / Alzain Mohamed Ahmed","Reader / Alashri Omran"
                ,"Reader / Al-Ayoune Al-Kouchi","Reader /Alfateh Alzubair"
                ,"Reader / Yasin ","Reader / Bandar Baleela","Reader / Tawfik Al Sayegh"
                ,"Reader / Jamal Al-Din Al-Zylaeei","Reader / Jamal Shaker Abdullah"
                ,"Reader / Gaman Alasamy ","Reader / Hatem farid Al Wair",
                "Reader / Hussein Al Sheikh","Reader / Hamad_Aldgriry",
                "Reader / Khalid Al Galil ","Reader / Khalid Al-Shoraimy","Reader / Khalid Al Ghamdi"
                ,"Reader / Khaled Al Qahtani","Reader / Khaled el Mahna","Reader / Khaled Elwahabi",
                "Reader / Khaled Abdelkafy","Reader / Khalifa Eltenagy",
                "Reader / Dawood Hamza","Reader / Rami Eldeasy",
                "Reader / Rachid","Reader / Rachid-Belalia"
                ," Reader / Rodziah Abdulrahman",
                "Reader / Raad Al kurdy"," Reader / Rogayah Sulong"
                ,"Reader / Ramadan Chakour",
                "Reader /  Zakaria Hamamah","Reader / Zaki Daghistani"
                ,"Reader /  Sapinah Mamat",
                "Reader /  Sami Al-Hasn ","Reader /  Sami Al Dosari",
                "Reader / Saad Al Ghamidi","Reader /  Saoud Shuraim",
                "Reader / Salman Al-Otaibi",
                "Reader / Sahl Yaaseen ","Reader / Sayed Ramadan",
                "Reader / Saidin Abdulrahman ",
                "Reader / Shaban Al-Sayiaad","Reader / Abu bakr shatri"
                ,"Reader / Shirazad Taher",
                "Reader / Saber Abdulhakm","Reader / Saleh Al-Talib",
                "Reader / Saleh Alsahood","Reader / Saleh Al-Habdan",
                "Reader / Salah Al Budair","Reader / Salah Alhashim",
                "Reader / Salah Alhashem","Reader / Salah Bukhatir",
                "Reader / Tareq Abdulgani daawob",
                "Reader / Adel Alkalbani","Reader / Adel Rayan","Reader / Abdul Bari ats-Tsubaiti",
                "Reader / Abdulbari Mohammad","Reader / Abdulbari Mohammad","Reader /  ABDULBASIT ABDUSSAMAD",
                "Reader /  ABDULBASIT ABDUSSAMAD","Reader /  ABDULBASIT ABDUSSAMAD","Reader / Abdul Rahman Al-Sudais",
                "Reader / Abd rahman al ossi","Abdulrahman Al-Majed","Reader / Abdul Rachid Soufi",
                "Reader / Abdul Rachid Soufi","Reader / Abdul Aziz Al Ahmad","Reader / Abdelaziz Alzhrani",
                "Reader / Abdulghani Abdullah (From Malaysia)","Reader / Abdallah Al Buraimi ","Reader / Abdullah Albuajan",
                "Reader / Abdullah Al Kandari","Reader / Abdullah Matroud","Reader /  Abdullaah Basfar",
                "Reader / Abdullah Abdul Ghani Al-Khayat","Reader / Abdallah Awad","Reader / Abdullah Algilaan ",
                "Reader / Abdullah Fahmi","Reader / Abdulmajeed Al-Arkani ","Reader / Abdulmohsin Al-Harthy",
                "Reader /  Abdulmohsin Al-Obaikan ","Reader /  Abdulmohsin Al-Askar","Reader / Abdulmehsin Al-Qasim ",
                "Reader / Abdulhadi Kanakeri","Reader /  Abdulwadood Haneef","Reader /  Abdulwali Al-Arkani",
                "Reader / Othman Al-Ansary","Reader / Ali Abo-Hashim","Reader / Ali Al Houdayfi",
                "Reader / Ali Alhuthaifi ","Reader /  Ali Abdullah Jaber ","Reader / Ali Hajjaj Alsouasi",
                "Reader / Emad Hafez","Reader / Omar Al-Qazabri","Reader / Faris Abbad",
                "Reader / Fahad Otibi","Reader / Fahad  Elkandary","Reader / Fawaz Alkabi",
                "Reader / Lafi elaony","Reader / Majed Al-Zamil","Reader /  Majed Al-Enezi",
                "Reader / Malik shaibat Alhamed","Reader /  Maher Al Maaiqli","Reader / Maher Al Maaiqli",
                "Reader / Maher Chkashiro","Reader / Muhammad Ayyub ","Reader / Mohamed Eleraway",
                "Reader / Mohamed el barak ","Reader / Mohamed Al Hafez","Reader / Mohammad Al-Tablaway",
                "Reader / Muhammad Al- Luhaidan","Reader / Muhammad al-Mohaisany","Reader / Mohamed Elmonshed",
                "Reader / Mohammed jebril","Reader / Mohamed Ali","Reader / Mohamed Khalil",
                "Reader / Muhammed Khairul Anuar","Reader / Mohammad Rashad Al Shareef","Reader /  Mohammad Saleh Alim Shah",
                "Reader / Mohammed El Menshawy","Reader / Mohamed Siddiq El-Minshawi","Reader / Mohammed El Menshawy",
                "Reader / Mohammad Al-Abdullah","Reader / Mohammad Al-Abdullah",
                "Reader / Mohamed Abdelkarim","Reader / Mohammad Abdullkarem","Reader / Mohammed Osman Khan (from India)",
                "Reader /  Mahmoud Rifaii ","Reader / MahmodAlshimi","Reader / Mahmoud Khalil Al-Hussary",
                "Reader / Mahmoud Khalil Al Hosari","Reader / Mahmoud Khalil Al-Hussary","Reader / Mahmud Ali El-Benna",
                "Reader / Mahmoud Ali Al-Banna","Reader / Mishary Rashid Alafasy","Reader / Mishary Rashid Alafasy ",
                "Reader /  Mostafa Ismaeel","Reader / Mustafa Al-Lahoni","Reader / Mustafa raad Alazawy",
                "Reader / Muamar","Listen quran kareem","Reader / Muftah Alsaltany",
                "Listen quran kareem ","Reader / Muftah Alsaltany",
                "Reader / Muftah Alsaltany","Reader / Meftah Moahamad Soltani ","Reader / Mousa Bilal",
                "Reader / Nasser Al obaid","Reader / Nasser Alqatami","Reader / Nabil Al Rifay ",
                "Reader /  Neamah Al-Hassan","Reader / Hani alrefai ","Reader / Hazza Alblushi",
                "Reader / Wasel Almethen","Reader / Wadee Al Yamani","Reader / Wishear Hayder Arbili",
                "Reader /  Walid Al-Dulaimi","Reader /  Waleed Alnaehi","Reader / Yasser Al-Dosari",
                "Reader /  Yasser Al-Faylakawi","Reader / yasser al qurashy","Reader / Yasser Al-Mazroyee",
                "Reader / Yasser Salama","Reader / Yahya Hawwa","Reader / Youssef Edghouch",
                "Reader / Yousef Alshoaey","Reader / Muftah Alsaltany"
        };



        String readerName2[] = {
                "القارئ أحمد الحذيفي | حفص عن عاصم", "القارئ أحمد الحواشي | حفص عن عاصم", "القارئ أحمد الطرابلسي | حفص عن عاصم",
                "القارئ أحمد بن علي العجمي | حفص عن عاصم","القارئ أحمد خضر الطرابلسي | قالون عن نافع","القارئ أحمد سعود | حفص عن عاصم",
                "القارئ أحمد صابر | حفص عن عاصم","القارئ أحمد عامر | حفص عن عاصم","القارئ أحمد نعينع | حفص عن عاصم",
                "القارئ أخيل عبدالحي روا (من ماليزيا) | حفص عن عاصم","القارئ أكرم العلاقمي | حفص عن عاصم","القارئ إبراهيم الأخضر | حفص عن عاصم",

                "القارئ إدريس أبكر | حفص عن عاصم",
                "القارئ ابراهيم الجبرين | حفص عن عاصم"
                ,"القارئ ابراهيم الجرمي | حفص عن عاصم",
                "القارئ ابراهيم الدوسري | ورش عن نافع","القارئ ابراهيم الدوسري | حفص عن عاصم"
//17

                ,"القارئ ابراهيم السعدان | حفص عن عاصم",
                "القارئ ابراهيم العسيري | حفص عن عاصم","القارئ استاذ زامري (من ماليزيا) | حفص عن عاصم"
                ,"القارئ الحسيني العزازي | المصحف المعلم","القارئ الدوكالي محمد العالم | قالون عن نافع",
                "القارئ الزين محمد أحمد | حفص عن عاصم","القارئ العشري عمران | حفص عن عاصم"
                ,"القارئ العيون الكوشي | ورش عن نافع","القارئ الفاتح محمد الزبير | الدوري عن أبي عمرو"
//26
                ,"القارئ القارئ ياسين | ورش عن نافع","القارئ بندر بليله | حفص عن عاصم","القارئ توفيق الصايغ | حفص عن عاصم"
                ,"القارئ جمال الدين الزيلعي | حفص عن عاصم","القارئ جمال شاكر عبدالله | حفص عن عاصم"
                ,"القارئ جمعان العصيمي | حفص عن عاصم","القارئ حاتم فريد الواعر | حفص عن عاصم",
                "القارئ حسين آل الشيخ | حفص عن عاصم","القارئ حمد الدغريري | حفص عن عاصم",
//35
                "القارئ خالد الجليل | حفص عن عاصم","القارئ خالد الشريمي | حفص عن عاصم","القارئ خالد الغامدي | حفص عن عاصم"
                ,"القارئ خالد القحطاني | حفص عن عاصم","القارئ خالد المهنا | حفص عن عاصم","القارئ خالد الوهيبي | حفص عن عاصم",
                "القارئ خالد عبدالكافي | حفص عن عاصم","القارئ خليفة الطنيجي | حفص عن عاصم",
                "القارئ داود حمزة | حفص عن عاصم","القارئ رامي الدعيس | حفص عن عاصم",
//45
                "القارئ رشيد إفراد | ورش عن نافع","القارئ رشيد بلعالية | حفص عن عاصم"
                ,"القارئ رضية عبدالرحمن ( من ماليزيا ) | حفص عن عاصم",
                "القارئ رعد محمد الكردي | حفص عن عاصم","القارئ رقية سولونق ( من ماليزيا ) | حفص عن عاصم"
                ,"القارئ رمضان شكور | حفص عن عاصم",
                "القارئ زكريا حمامة | حفص عن عاصم","القارئ زكي داغستاني | حفص عن عاصم"
//53
                ,"القارئ سابينة مامات ( من ماليزيا ) | حفص عن عاصم",
                "القارئ سامي الحسن | حفص عن عاصم","القارئ سامي الدوسري | حفص عن عاصم",
                "القارئ سعد الغامدي | حفص عن عاصم","القارئ سعود الشريم | حفص عن عاصم",
//58

                "القارئ سلمان العتيبي | حفص عن عاصم",

                "القارئ سهل ياسين | حفص عن عاصم","القارئ سيد رمضان | حفص عن عاصم",
                "القارئ سيدين عبدالرحمن ( من ماليزيا ) | حفص عن عاصم",

                "القارئ شعبان الصياد | حفص عن عاصم","القارئ شيخ أبو بكر الشاطري | حفص عن عاصم"
                ,"القارئ شيرزاد عبدالرحمن طاهر | حفص عن عاصم",

                "القارئ صابر عبدالحكم | حفص عن عاصم","القارئ صالح آل طالب | حفص عن عاصم",
                "القارئ صالح الصاهود | حفص عن عاصم","القارئ صالح الهبدان | حفص عن عاصم",
                "القارئ صلاح البدير | حفص عن عاصم","القارئ صلاح الهاشم | قالون عن نافع",
                "القارئ صلاح الهاشم | حفص عن عاصم","القارئ صلاح بو خاطر | حفص عن عاصم",
                "القارئ طارق عبدالغني دعوب | قالون عن نافع",


                "القارئ عادل الكلباني | حفص عن عاصم","القارئ عادل ريان | حفص عن عاصم","القارئ عبدالبارئ الثبيتي | حفص عن عاصم",
                "القارئ عبدالبارئ محمد | المصحف المعلم","القارئ عبدالبارئ محمد | حفص عن عاصم","القارئ عبدالباسط عبدالصمد | حفص عن عاصم",
                "القارئ عبدالباسط عبدالصمد | ورش عن نافع","القارئ عبدالباسط عبدالصمد | المصحف المجود","القارئ عبدالرحمن السديس | حفص عن عاصم",
                "القارئ عبدالرحمن العوسي | حفص عن عاصم","القارئ عبدالرحمن الماجد | حفص عن عاصم","القارئ عبدالرشيد صوفي | السوسي عن أبي عمرو",
                "القارئ عبدالرشيد صوفي | خلف عن حمزة","القارئ عبدالعزيز الأحمد | حفص عن عاصم","القارئ عبدالعزيز الزهراني | حفص عن عاصم",
                "القارئ عبدالغني عبدالله ( من ماليزيا ) | حفص عن عاصم","القارئ عبدالله البريمي | حفص عن عاصم","القارئ عبدالله البعيجان | حفص عن عاصم",
                "القارئ عبدالله الكندري | حفص عن عاصم","القارئ عبدالله المطرود | حفص عن عاصم","القارئ عبدالله بصفر | حفص عن عاصم",
                "القارئ عبدالله خياط | حفص عن عاصم","القارئ عبدالله عواد الجهني | حفص عن عاصم","القارئ عبدالله غيلان | حفص عن عاصم",
                "القارئ عبدالله فهمي ( من ماليزيا ) | حفص عن عاصم","القارئ عبدالمجيد الأركاني | حفص عن عاصم","القارئ عبدالمحسن الحارثي | حفص عن عاصم",
                "القارئ عبدالمحسن العبيكان | حفص عن عاصم","القارئ عبدالمحسن العسكر | حفص عن عاصم","القارئ عبدالمحسن القاسم | حفص عن عاصم",
                "القارئ عبدالهادي أحمد كناكري | حفص عن عاصم","القارئ عبدالودود حنيف | حفص عن عاصم","القارئ عبدالولي الأركاني | حفص عن عاصم",
                "القارئ عثمان الأنصاري | حفص عن عاصم","القارئ علي أبو هاشم | حفص عن عاصم","القارئ علي الحذيفي | قالون عن نافع",
                "القارئ علي بن عبدالرحمن الحذيفي | حفص عن عاصم","القارئ علي جابر | حفص عن عاصم","القارئ علي حجاج السويسي | حفص عن عاصم",
                "القارئ عماد زهير حافظ | حفص عن عاصم","القارئ عمر القزابري | ورش عن نافع","القارئ فارس عباد | حفص عن عاصم",
                "القارئ فهد العتيبي | حفص عن عاصم","القارئ فهد الكندري | حفص عن عاصم","القارئ فواز الكعبي | حفص عن عاصم",
                "القارئ لافي العوني | حفص عن عاصم","القارئ ماجد الزامل | حفص عن عاصم","القارئ ماجد العنزي | حفص عن عاصم",
                "القارئ مالك شيبة الحمد | حفص عن عاصم","القارئ ماهر المعيقلي | المصحف المعلم","القارئ ماهر المعيقلي | حفص عن عاصم",
                "القارئ ماهر شخاشيرو | حفص عن عاصم","القارئ محمد أيوب | حفص عن عاصم","القارئ محمد الأيراوي | ورش عن نافع من طريق أبي بكر الأصبهاني",
                "القارئ محمد البراك | حفص عن عاصم","القارئ محمد الحافظ ( من ماليزيا ) | حفص عن عاصم","القارئ محمد الطبلاوي | حفص عن عاصم",
                "القارئ محمد اللحيدان | حفص عن عاصم","القارئ محمد المحيسني | حفص عن عاصم","القارئ محمد المنشد | حفص عن عاصم",
                "القارئ محمد جبريل | حفص عن عاصم","القارئ محمد حفص علي ( من ماليزيا ) | حفص عن عاصم","القارئ محمد خليل القارئ | حفص عن عاصم",
                "القارئ محمد خير النور ( من ماليزيا ) | حفص عن عاصم","القارئ محمد رشاد الشريف | حفص عن عاصم","القارئ محمد صالح عالم شاه | حفص عن عاصم",
                "القارئ محمد صديق المنشاوي | المصحف المعلم","القارئ محمد صديق المنشاوي | المصحف المجود","القارئ محمد صديق المنشاوي | حفص عن عاصم",
                "القارئ محمد عبدالحكيم سعيد العبدالله | البزي وقنبل عن ابن كثير","القارئ محمد عبدالحكيم سعيد العبدالله | الدوري عن الكسائي",
                "القارئ محمد عبدالكريم | حفص عن عاصم","القارئ محمد عبدالكريم | ورش عن نافع من طريق أبي بكر الأصبهاني","القارئ محمد عثمان خان ( من الهند ) | حفص عن عاصم",
                "القارئ محمود الرفاعي | حفص عن عاصم","القارئ محمود الشيمي | الدوري عن الكسائي","القارئ محمود خليل الحصري | ورش عن نافع",
                "القارئ محمود خليل الحصري | المصحف المجود","القارئ محمود خليل الحصري | حفص عن عاصم","القارئ محمود علي البنا | المصحف المجود",
                "القارئ محمود علي البنا | حفص عن عاصم","القارئ مشاري العفاسي | حفص عن عاصم","القارئ مشاري العفاسي | الدوري عن الكسائي",
                "القارئ مصطفى إسماعيل | حفص عن عاصم","القارئ مصطفى اللاهوني | حفص عن عاصم","القارئ مصطفى رعد العزاوي | حفص عن عاصم",
                "القارئ معمر الأندونيسي | حفص عن عاصم","القارئ معيض الحارثي | حفص عن عاصم","القارئ مفتاح السلطني | الدوري عن أبي عمرو",
                "القارئ مفتاح السلطني | الدوري عن الكسائي","القارئ مفتاح السلطني | ابن ذكوان عن ابن عامر",
                "القارئ مفتاح السلطني | حفص عن عاصم","القارئ مفتاح السلطني | شعبة عن عاصم","القارئ موسى بلال | حفص عن عاصم",
                "القارئ ناصر العبيد | حفص عن عاصم","القارئ ناصر القطامي | حفص عن عاصم","القارئ نبيل الرفاعي | حفص عن عاصم",
                "القارئ نعمة الحسان | حفص عن عاصم","القارئ هاني الرفاعي | حفص عن عاصم","القارئ هزاع البلوشي | حفص عن عاصم",
                "القارئ واصل المذن | حفص عن عاصم","القارئ وديع اليمني | حفص عن عاصم","القارئ وشيار حيدر اربيلي | حفص عن عاصم",
                "القارئ وليد الدليمي | حفص عن عاصم","القارئ وليد النائحي | قالون عن نافع من طريق أبي نشيط","القارئ ياسر الدوسري | حفص عن عاصم",
                "القارئ ياسر الفيلكاوي | حفص عن عاصم","القارئ ياسر القرشي | حفص عن عاصم","القارئ ياسر المزروعي | قراءة يعقوب الحضرمي بروايتي رويس وروح",
                "القارئ ياسر سلامة | حفص عن عاصم","القارئ يحيى حوا | حفص عن عاصم","القارئ يوسف الدغوش ( من المغرب ) | حفص عن عاصم",
                "القارئ يوسف الشويعي | حفص عن عاصم","القارئ يوسف بن نوح أحمد | حفص عن عاصم"
        };
        ArrayList<String>readerName=new ArrayList<>();
        for (int i=0;i<readerName2.length;i++){
               String reader=readerName1[i]+" | "+readerName2[i];

               readerName.add(reader);

           }

        return readerName;
    }
    public static String [] getServerName() {

        String serverName[] = {
                "8", "11", "10", "10","10","11","8","10","11","12","9","6","6","6","11","10","10","10","6","12",
                "8","7","9","9","11","6","11","6","6","11","6","6","11","11","6","10","12","6","10","11",
                "11","11","12","9","6","12","6","12","6","12","6","9","9","12","8","8","7","7","11","6",
                "12",
                "12","11","11","12","12","9","8","6","6","12","12","8","10","8","8","6","10","12","7","10",
                "13","11","6","10","9","9","11","9","12","8","8","10","8","6","12","13","8","12","7","6",
                "12","6","8","6","8","6","11","9","9","9","11","9","6","9","8","8","11","8","6","9",
                "8","9","12","12","10","8","6","13","12","12","8","11","10","8","12","8","12","10","12","6",
                "11","10","9","12","12","7","6","11","10","9","9","13","8","8","8","8","8","6","8","6",
                "8","9","6","11","10","11","11","11","6","9","8","8","11","11","6","11","8","9","11","6",
                "9","9","12","12","7","9","8"
        };


        return serverName;
    }
    public static String [] getNameOfLink() {
        String nameOfLink[] = {
                "ahmad_huth", "hawashi", "trabulsi", "ajm","trablsi","saud","saber","Aamer","ahmad_nu","malaysia/akil",
                "akrm","akdr","abkr","jbreen","jormy","ibrahim_dosri_warsh","ibrahim_dosri_hafs","IbrahemSadan","3siri",
                "malaysia/zamri","3zazi","dokali","alzain","omran","koshi","fateh","qari","balilah","twfeeq","zilaie",
                "jamal","jaman","hatem","alshaik","hamad","jleel","shoraimy","ghamdi","qht","mohna","whabi","kafi","tnjy",
                "hamza","rami","ifrad","bl3","malaysia/rziah","kurdi","malaysia/rogiah","shakoor","zakariya","zaki",
                "malaysia/mamat","sami_hsn","sami_dosr","s_gmd","shur","salman","shl","sayed","malaysia/sideen","shaban","shatri",
                "taher","hkm","tlb","sahood","habdan","s_bud","salah_hashim","salah_hashim_m","bu_khtr","tareq",
                "a_klb","ryan","thubti","bari_molm","bari","basit","basit_warsh","basit_mjwd","sds","aloosi","a_majed",
                "soufi","soufi_klf","a_ahmed","zahrani","malaysia/abdulgani","brmi","buajan","Abdullahk","mtrod","bsfr",
                "kyat","jhn","gulan","malaysia/fhmi","m_arkani","mohsin_harthi","obk","askr","qasm","kanakeri","wdod",
                "arkani","Othmn","abo_hashim","huthifi_qalon","hthfi","a_jbr","hajjaj","hafz","omar_warsh","frs_a","fahad_otibi",
                "kndri","fawaz","lafi","zaml","majd_onazi","shaibat","maher_m","maher","shaksh","ayyub","earawi","braak",
                "malaysia/hafz","tblawi","lhdan","mhsny","monshed","jbrl","malaysia/hfs","m_qari","malaysia/nor","rashad",
                "shah","minsh_molm","minsh_mjwd","minsh","abdullah","abdullah_dori","m_krm","m_kreem_warsh","khan","mrifai","sheimy",
                "husr_warsh","husr_mjwd","husr","bna_mjwd","bna","afs","afs_dori","mustafa","lahoni","ra3ad","muamr","harthi","sultany",
                "saltany_kisaia","muftah_thakwan","muftah","muftah_shobah","bilal","obaid","qtm","nabil","namh","hani","hazza",
                "wasel","wdee3","wishear","dlami","waleed","yasser","fyl","qurashi","mzroyee","salamah","yahya","dgsh","yousef","noah"
        };
        return nameOfLink;
    }

    public static ArrayList<Data> getData(){

        ArrayList<Data> datalist = new ArrayList<>();
        String [] link = getNameOfLink();
        ArrayList<String> name = getReaderName();
        String [] server = getServerName();
        for (int i = 0; i < link.length ; i++){
            Data data = new Data();
            data.setName(name.get(i));
            data.setLinkName(link[i]);
            data.setServer(server[i]);
            datalist.add(data);
        }
        return datalist;
    }


}

