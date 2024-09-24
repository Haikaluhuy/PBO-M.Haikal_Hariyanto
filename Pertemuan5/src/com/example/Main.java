package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data Mahasiswa
        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Agus", "2101"),
            new Mahasiswa("Budi", "2102"),
            new Mahasiswa("Cici", "2103"),
            new Mahasiswa("Dedi", "2104"),
            new Mahasiswa("Evi", "2105"),
            new Mahasiswa("Fajar", "2106"),
            new Mahasiswa("Gina", "2107"),
            new Mahasiswa("Hadi", "2108"),
            new Mahasiswa("Ika", "2109"),
            new Mahasiswa("Joko", "2110")
        };

        // Data Dosen
        Dosen[] dosen = {
            new Dosen("Yadhi Aditya P.", "KO052N"),
            new Dosen("Yudi Widhiyasana", "KO013N"),
            new Dosen("Suprihanto", "KO022N"),
            new Dosen("Trisna Gelar A.", "KO078N"),
            new Dosen("Ade Chandra Nugraha", "KO001N"),
            new Dosen("Muhammad Rizqi S.", "KO074N"),
            new Dosen("Santi Sundari", "KO009N"),
            new Dosen("Irwan Setiawan", "KO045N"),
            new Dosen("Irawan Thamrin", "KO006N"),
            new Dosen("Zulkifli Arsyad", "KO061N"),
            new Dosen("Ade Hodijah", "KO060N")
        };

        // Data Mata Kuliah
        MataKuliah mk1 = new MataKuliah("Pemrograman Berorientasi Objek");
        MataKuliah mk2 = new MataKuliah("Komputer Grafik");
        MataKuliah mk3 = new MataKuliah("Matematika Diskrit II");
        MataKuliah mk4 = new MataKuliah("Basis Data");
        MataKuliah mk5 = new MataKuliah("Aljabar Linear");
        MataKuliah mk6 = new MataKuliah("Pengantar Rekayasa Perangkat Lunak");
        MataKuliah mk7 = new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web");

        // Data Ruangan
        Ruangan r1 = new Ruangan("D217");
        Ruangan r2 = new Ruangan("D101");
        Ruangan r3 = new Ruangan("D102-Lab. MT");
        Ruangan r4 = new Ruangan("D106-Lab. SDB");

        // Data Jadwal
        Jadwal[] jadwal = {
            new Jadwal("Senin", mk1, dosen[0], r1),
            new Jadwal("Senin", mk2, dosen[1], r1),
            new Jadwal("Senin", mk3, dosen[2], r1),
            new Jadwal("Senin", mk2, dosen[3], r3),
            new Jadwal("Selasa", mk4, dosen[4], r2),
            new Jadwal("Selasa", mk5, dosen[5], r2),
            new Jadwal("Selasa", mk6, dosen[6], r2),
            new Jadwal("Rabu", mk7, dosen[3], r3),
            new Jadwal("Kamis", mk6, dosen[0], r4),
            new Jadwal("Jumat", mk4, dosen[10], r4)
        };

        while (true) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Menampilkan Mahasiswa");
            System.out.println("2. Menampilkan Dosen");
            System.out.println("3. Menampilkan Jadwal");
            System.out.println("4. Keluar");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa m : mahasiswa) {
                        System.out.println(m);
                    }
                    break;

                case 2:
                    System.out.println("Daftar Dosen:");
                    for (Dosen d : dosen) {
                        System.out.println(d);
                    }
                    break;

                case 3:
                    System.out.println("Jadwal Kuliah:");
                    for (Jadwal j : jadwal) {
                        System.out.println(j);
                    }
                    break;

                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
    }
}
