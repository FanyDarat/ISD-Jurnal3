public class Buku {
    private String judulBuku;
    private String penulis;
    private int tahun;

    public Buku(String judulBuku, String penulis, int tahun) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }

    @Override
    public String toString() {
        return "\nJudulBuku= " + judulBuku + " \nPenulis= " + penulis + "\nTahun= " + tahun + "\n";
    }

}