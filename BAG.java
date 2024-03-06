public class BAG implements Comparable<BAG>, Deleteable {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int stokBarang;

    public BAG(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
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
        return "BAG KodeBarang=" + kodeBarang + "\nJenisBarang=" + jenisBarang + "\nNamaBarang=" + namaBarang
                + "\nStokBarang=" + stokBarang + "\n";
    }

    @Override
    public int compareTo(BAG o) {
        return getkodeBarang().compareTo(o.kodeBarang);
    }

    @Override
    public String toRemove() {
        return getkodeBarang();
    }
}
