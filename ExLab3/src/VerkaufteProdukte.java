import java.util.List;

public class VerkaufteProdukte {
    private Integer year;
    private List<Produkt> verkaufte;

    public VerkaufteProdukte(Integer year, List<Produkt> verkaufte) {
        this.year = year;
        this.verkaufte = verkaufte;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Produkt> getVerkaufte() {
        return verkaufte;
    }

    public void setVerkaufte(List<Produkt> verkaufte) {
        this.verkaufte = verkaufte;
    }
}
