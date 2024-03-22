package BangunRuang;

import java.util.Scanner;
    public class Tabung extends BangunRuang implements Tabungg {
        Scanner scanner = new Scanner(System.in);
        private double tinggi;
        private double jari_jari;

        public Tabung(String tabung) {
            super(tabung);
        }

        @Override
        public void inputNilai() {
            super.inputNilai();
            System.out.print("Input tinggi: ");
            tinggi = scanner.nextDouble();
            System.out.print("Input jari-jari: ");
            jari_jari = scanner.nextDouble();
        }

        @Override
        public void luasPermukaan() {
            double hasil = 2 * 3.14 * jari_jari + 2 * 3.14 * jari_jari * tinggi;
            super.luasPermukaan();
            System.out.println("Hasil luas permukaan: " + hasil);
        }

        @Override
        public void volume() {
            double hasil = 3.14 * jari_jari * jari_jari * tinggi;
            super.volume();
            System.out.println("Hasil volume: " + hasil);
        }
    }
