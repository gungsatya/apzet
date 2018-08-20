# DOKUMENTASI

## A.	Alat dan Bahan
Pembuatan aplikasi APZET menggunakan aplikasi Android Studio versi 2.2 yang dibuat oleh Google. Dalam tahap pembuatan, aplikasi ini dikerjakan oleh dua orang dengan masing-masing laptop adalah Asus X450J dan Asus X455L. Aplikasi APZET tidak memerlukan bahan-bahan dalam pembuatannya.

## B.	Proses Pembuatan
Awal dari proses pembuatan aplikasi ini diawali dengan mencari metode-metode apa saja yang bisa digunakan untuk mengetahui apakah pasien adalah penderita alzheimer atau tidak. Ditemukan 3 metode mengetahui hal tersebut yaitu Memory Impairment Screen (MIS), Brief Alzheimer Screen (BAS) Screening Test dan Six Item Cognitive Impairment Test (6CIT). 
Tahap selanjutnya adalah perancangan aplikasi dimana pada tahap ini mempelajari cara untuk memasukan ketiga metode tes Alzheimer tersebut ke dalam aplikasi APZET. Selain itu pada tahap ini diperlukan penyesuaian desain aplikasi dengan pengguna aplikasi, dimana pasien Alzheimer identik diderita oleh pasien lanjut usia (lansia) yang memiliki keterbatasan dalam mengetik tulisan dengan cepat, tidak familiar menggunakan aplikasi smartphone dan keterbatasan dalam membaca tulisan dengan jelas. Untuk itu diperlukan tatap muka aplikasi yang relevan untuk dipergunakan oleh lansia. Seperti pemilihan huruf-huruf yang lebih besar, petunjuk dimasing-masing sesi pertanyaan dan beberapa dari sesi pertanyaan dirancang harus diisi oleh penguji untuk mempermudah penggunaannya.  
Setelah tahap perancangan, dilanjutkan dengan tahap pengkodean atau tahap pembuatan aplikasi. Pembuatan aplikasi dikerjakan selama satu minggu dengan 2 orang pekerja. 
Tahap akhir dari pembuatan aplikasi ini adalah tahap uji coba aplikasi untuk mengetahui apakah aplikasi tidak mengalami eror pada saat penggunaannya. Tahap ini juga menguji apakah aplikasi sudah bisa digunakan di smartphone yang berbeda-beda.

## C.	Kode Program
Kode program tidak secara rinci akan dijelaskan dikarenakan kode program dari aplikasi APZET yang banyak dan tidak bisa dijelaskan satu per satu. Untuk itu, pada bagian ini akan dijelaskan secara garis besar kode program java yang ada didalam aplikasi APZET.
No.	Nama Kode (.java)	Penjelasan
1	LogTest -	Kode program ini berfungsi untuk berhubungan langsung dengan data yang ada dalam database local SQLite.
2	MainActivity - Kode program dari halaman main menu di APZET yang berfungsi sebagai portal menuju metode-metode tes. 
3	SignInActivity -	Kode program dari halaman sign in untuk mencatat data dari pengguna aplikasi dan dimasukan kedalam basis data.
4	SplashScreen -	Kode program dari tampilan awal saat membuka aplikasi yang sering disebut dengan splash screen.
5	TodoCursorAdapter -	Kode program dari program untuk menampilkan data yang diperoleh dari basisdata.
6	ViewResultAcitivity -	Kode program yang berfungsi menampilkan rekaman data hasil tes dari pengguna aplikasi.
7	BASQuest1Activity -	Kode program dari pertanyaan 1 metode BAS
8	BASQuest2Activity -	Kode program dari pertanyaan 2 metode BAS
9	BASQuest3Activity -	Kode program dari pertanyaan 3 metode BAS
10	BASQuest4Activity -	Kode program dari pertanyaan 4 metode BAS
11	BASQuest5Activity -	Kode program dari pertanyaan 5 metode BAS
12	MISQuest1Activity -	Kode program dari pertanyaan 1 metode MIS
13	MISQuest2Chap1Activity -	Kode program dari pertanyaan 2 bagian 1 MIS
14	MISQuest2Chap2Activity -	Kode program dari pertanyaan 2 bagian 2 MIS
15	MISQuest2Chap3Activity -	Kode program dari pertanyaan 2 bagian 3 MIS
16	MISQuest2Chap4Activity -	Kode program dari pertanyaan 2 bagian 4 MIS
17	MISQuest2Chap5Activity -	Kode program dari pertanyaan 2 bagian 5 MIS
18	MISQuest3Activity -	Kode program dari pertanyaan 3 metode MIS
19	MISQuest4Activity -	Kode program dari pertanyaan 4 metode MIS
20	MISQuest5Activity -	Kode program dari pertanyaan 5 metode MIS
21	SCITQuest1Activity -	Kode program dari pertanyaan 1 metode 6CIT
22	SCITQuest2Activity -	Kode program dari pertanyaan 2 metode 6CIT
23	SCITQuest3Activity -	Kode program dari pertanyaan 3 metode 6CIT
24	SCITQuest4Activity -	Kode program dari pertanyaan 4 metode 6CIT
25	SCITQuest5Activity -	Kode program dari pertanyaan 5 metode 6CIT
26	SCITQuest6Activity -	Kode program dari pertanyaan 6 metode 6CIT
27	SCITQuest7Activity -	Kode program dari pertanyaan 7 metode 6CIT
28	BASResultActivity -	Kode program untuk menampilkan hasil dari metode BAS
29	MISResultActivity -	Kode program untuk menampilkann hasil dari metode MIS
30	SCITResultActivity -	Kode program untuk menampilkan hasil dari merode 6CIT



