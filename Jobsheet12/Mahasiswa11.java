package Jobsheet12;
public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa11(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public void tampil(){
        System.out.println(
            "NIM  : " + nim +
            "\nNama : " + nama +
            "\nKelas: " + kelas +
            "\nIPK  : " + ipk
        );
    }
}
