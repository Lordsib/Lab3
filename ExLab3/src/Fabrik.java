import java.util.*;

public class Fabrik {
    private List<GemachteProdukte> geschichteGemacht;
    private List<VerkaufteProdukte> geschichteVerkauft;

    public Fabrik(List<GemachteProdukte> geschichteGemacht, List<VerkaufteProdukte> geschichteVerkauft) {
        this.geschichteGemacht = geschichteGemacht;
        this.geschichteVerkauft = geschichteVerkauft;
    }

    public List<GemachteProdukte> getGeschichteGemacht() {
        return geschichteGemacht;
    }

    public void setGeschichteGemacht(List<GemachteProdukte> geschichteGemacht) {
        this.geschichteGemacht = geschichteGemacht;
    }

    public List<VerkaufteProdukte> getGeschichteVerkauft() {
        return geschichteVerkauft;
    }

    public void setGeschichteVerkauft(List<VerkaufteProdukte> geschichteVerkauft) {
        this.geschichteVerkauft = geschichteVerkauft;
    }

    public Map<String, Integer> sortProd(Integer num)
    {
        Map<String,Integer> data1 = new TreeMap<>();

            for(int j = 0; j < geschichteVerkauft.get(num).getVerkaufte().size(); j++)
            {
                List<Produkt> lP1 = geschichteVerkauft.get(num).getVerkaufte();
                if(data1.containsKey(lP1.get(j).getProduktName()))
                {
                        data1.replace(lP1.get(j).getProduktName(), data1.get(lP1.get(j).getProduktName()) + 1);
                }
                else {
                    data1.put(lP1.get(j).getProduktName(), 1);
                }
            }


        ArrayList<Integer> list = new ArrayList<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : data1.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int i : list) {
            for (Map.Entry<String, Integer> entry : data1.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }


        return sortedMap;
    }
    public String getKat(Produkt p)
    {
        Integer nr1 = 0;
        for(int i = 0; i < geschichteVerkauft.get(0).getVerkaufte().size(); i++)
        {
            if(geschichteVerkauft.get(0).getVerkaufte().get(i).getProduktName().equals(p.getProduktName()))
            {
                nr1 += 1;
            }
        }

        Integer nr2 = 0;
        for(int i = 0; i < geschichteVerkauft.get(1).getVerkaufte().size(); i++)
        {
            if(geschichteVerkauft.get(1).getVerkaufte().get(i).getProduktName().equals(p.getProduktName()))
            {
                nr2 += 1;
            }
        }

        if(nr2 > nr1)
        {
            return "steigent";
        }
        if(nr2.equals(nr1))
        {
            return "stagnierenden";
        }
        return "fallenden";
    }

    public Integer ideal(Produkt p){
        String s = this.getKat(p);

        Integer nr = 0;
        for(int i = 0; i < geschichteVerkauft.get(1).getVerkaufte().size(); i++)
        {
            if(geschichteVerkauft.get(1).getVerkaufte().get(i).getProduktName().equals(p.getProduktName()))
            {
                nr += 1;
            }
        }

        if(s.equals("steigent"))
        {
            return Math.round(nr + nr/2);
        }
        if(s.equals("stagnierenden"))
        {
            return Math.round(nr + nr/10);
        }
        else {
            return Math.round(nr - nr/10);
        }
    }
}
