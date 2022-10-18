import java.util.List;

public class GemachteProdukte {
    private Integer year;
    private List<Produkt> gemacht;

    public GemachteProdukte(Integer year, List<Produkt> gemacht) {
        this.year = year;
        this.gemacht = gemacht;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Produkt> getGemacht() {
        return gemacht;
    }

    public void setGemacht(List<Produkt> gemacht) {
        this.gemacht = gemacht;
    }
}
