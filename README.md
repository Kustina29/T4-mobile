## NAMA : BAIQ KUSTINA AMRIANA
## NIM  : F1D02310043

## Deskripsi Aplikasi
Aplikasi Student Contact App adalah aplikasi sederhana berbasis Android yang digunakan untuk menampilkan daftar mahasiswa serta mengelola informasi pengguna. Aplikasi ini memiliki fitur login untuk autentikasi pengguna, penyimpanan sesi login menggunakan SharedPreferences, serta navigasi utama menggunakan Bottom Navigation yang terdiri dari Home, Search, dan Profile.
Pada halaman Home, pengguna dapat melihat sambutan serta daftar mahasiswa. Halaman Search digunakan sebagai fitur pencarian data, sedangkan halaman Profile menampilkan informasi akun pengguna serta pengaturan aplikasi seperti mode gelap, notifikasi, dan fitur logout.
Aplikasi ini dirancang untuk menerapkan konsep dasar Android seperti Activity, Fragment, SharedPreferences, serta pengelolaan navigasi antar halaman.

## Screenshoot Aplikasi
## Tampilan Login
<img width="1080" height="2340" alt="login" src="https://github.com/user-attachments/assets/4f1f7bbd-463b-4125-bfb9-9b496d6391be" />

## Tampilan Main Screen
<img width="1080" height="2340" alt="main screen" src="https://github.com/user-attachments/assets/45216967-def4-4470-ad4f-9ee3ee478fe5" />

## Tampilan Profile
<img width="1080" height="2340" alt="setting" src="https://github.com/user-attachments/assets/85c3bda2-5e44-441a-ae43-86767c52fb8a" />

## Penyimpanan yang digunakan
Aplikasi ini menggunakan SharedPreferences sebagai metode penyimpanan data lokal  untuk menyimpan data sederhana seperti status login, username, dan pengaturan aplikasi sepertidark mode, notifikasi, dan lain-lain.
Alasan penggunaan SharedPreferences adalah karena metode ini ringan, mudah digunakan, dan cocok untuk menyimpan data kecil yang tidak membutuhkan database kompleks. Selain itu, data yang disimpan tetap aman tersimpan di perangkat meskipun aplikasi ditutup.

## Kendala yang dihadapi
Selama proses pengembangan, terdapat beberapa kendala, seperti error pada pengaturan Bottom Navigation, fragment yang tidak muncul, serta kesalahan penempatan file menu XML yang menyebabkan aplikasi gagal berjalan.
Kendala tersebut diatasi dengan memastikan struktur folder sudah benar (menu, layout, drawable), melakukan pengecekan kembali pada ID di XML dan Kotlin, serta melakukan rebuild project agar resource dikenali oleh sistem Android Studio. Selain itu, debugging juga dilakukan untuk memastikan setiap fragment terhubung dengan benar melalui MainActivity.

Sebelumnya mohon maaf saya cuma bisa kerjakan Hands-on 1 karena kendala laptop, laptop saya nge-lag pak dan sempat ngfreez juga, jadi saya kerjakan sebisa saya, karena takut nanti malah tidak kekumpul, mohon maaf sekali lagi🙏
