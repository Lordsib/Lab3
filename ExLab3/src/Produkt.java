import java.util.List;

public class Produkt {

    private String produktName;
    private Integer id;


    public Produkt(String produktName, Integer id) {
        this.produktName = produktName;
        this.id = id;
    }

    public String getProduktName() {
        return produktName;
    }

    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
