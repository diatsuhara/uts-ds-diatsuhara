public class Mahasiswa {
    private int id;
    private String nama;
    private String kelas;
    private int tanggalMasuk;

    public Mahasiswa(int id, String nama, String kelas, int tanggalMasuk) {
        this.id = id;
        this.nama = nama;
        this.kelas = kelas;
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public int getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(int tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                ", tanggalMasuk=" + tanggalMasuk +
                '}';
    }
}
