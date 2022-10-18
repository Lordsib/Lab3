import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
        Produkt p1 = new Produkt("Pants", 1036);
        Produkt p2 = new Produkt("Shirt", 3012);
        Produkt p3 = new Produkt("Hat", 5923);
        Produkt p4 = new Produkt("Hat", 5924);
        Produkt p5 = new Produkt("Shoe", 7223);
        Produkt p6 = new Produkt("Shirt", 3023);
        List<Produkt> lgProd1 = new ArrayList<Produkt>();
        lgProd1.add(p1);
        lgProd1.add(p2);
        lgProd1.add(p3);

        List<Produkt> lgProd2 = new ArrayList<Produkt>();
        lgProd2.add(p4);
        lgProd2.add(p5);
        lgProd2.add(p6);

        GemachteProdukte gp1 = new GemachteProdukte(2020, lgProd1);
        GemachteProdukte gp2 = new GemachteProdukte(2021, lgProd2);

        List<GemachteProdukte> lgp1 = new ArrayList<GemachteProdukte>();
        lgp1.add(gp1);
        lgp1.add(gp2);

        List<Produkt> lvProd1 = new ArrayList<Produkt>();
        lvProd1.add(p1);
        lvProd1.add(p2);
        lvProd1.add(p3);

        List<Produkt> lvProd2 = new ArrayList<Produkt>();
        lvProd1.add(p2);
        lvProd2.add(p2);
        lvProd2.add(p5);
        lvProd2.add(p6);

        VerkaufteProdukte vp1 = new VerkaufteProdukte(2020, lvProd1);
        VerkaufteProdukte vp2 = new VerkaufteProdukte(2021, lvProd2);

        List<VerkaufteProdukte> lvp1 = new ArrayList<VerkaufteProdukte>();
        lvp1.add(vp1);
        lvp1.add(vp2);

        Fabrik f1 = new Fabrik(lgp1, lvp1);

        Map<String,Integer> m = f1.sortProd(1);

        System.out.println(Arrays.asList(m));

        System.out.println("\n---------\n");

        System.out.println(f1.getKat(p2));
        System.out.println(f1.getKat(p4));

        System.out.println("\n---------\n");

        System.out.println(f1.ideal(p2));
    }

}