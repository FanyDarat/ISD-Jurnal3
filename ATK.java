public class ATK implements Comparable<ATK>, Deleteable {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stokBarang;

    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        this.stokBarang = stokBarang;
    }

    public String getkodeBarang() {
        return kodeBarang;
    }

    public String getjenisBarang() {
        return jenisBarang;
    }

    public String getnamaBarang() {
        return namaBarang;
    }

    public int getstokBarang() {
        return stokBarang;
    }

    @Override
    public String toString() {
        return "ATK KodeBarang=" + kodeBarang + "\nJenisBarang=" + jenisBarang + "\nNamaBarang=" + namaBarang
                + "\nStokBarang=" + stokBarang + "\n";
    }

    @Override
    public int compareTo(ATK o) {
        return getkodeBarang().compareTo(o.kodeBarang);
    }

    @Override
    public String toRemove() {
        return getkodeBarang();
    }

}
