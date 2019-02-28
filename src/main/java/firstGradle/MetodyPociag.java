package firstGradle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MetodyPociag {

    List<Pociag> list = new ArrayList<>();


    public MetodyPociag(List<Pociag> list) {
        this.list = list;
    }



    public void wypiszWszystkiePociagiStream(){
        list.stream().forEach(li -> System.out.println(li));
    }
    public void wypiszWszystkiePociagi() {
        for (Pociag z : list) {
            System.out.println(z);
        }
    }
    public void wypiszWszystkiePociagiEkonomiczne(){
        for (Pociag z: list){
            if (z.getKlasa().equals(KlasaPociagu.EKONOMIA))
            System.out.println(z);
        }
    }
    public List<Pociag> zwrocPociagKlasy(KlasaPociagu klasaPociagu){
        return list.stream().filter(a -> a.getKlasa().equals(klasaPociagu)).collect(Collectors.toList());
    }

    public List<Pociag> zwrocNajbardziejOpoziony(){
        return list.stream().sorted((((o2, o1) -> Integer.compare(o1.getMaxOpoznienie(), o2.getMaxOpoznienie())))).limit(1).collect(Collectors.toList());
    }
    public void zwrocNajbardziejOpozniony2(){
        for (Pociag  z:  list ) {
            if (z.getMaxOpoznienie()>15){
                System.out.println(z);
            }
        }
    }

    public Optional<Pociag> zworc3NajbardziejOplacalne(){
        return list.stream().sorted(((o1, o2) -> Integer.compare(o1.getCenaPodrozy()/o1.getDlugoscPodrozy(), o2.getCenaPodrozy()/o2.getDlugoscPodrozy()))).findFirst();

    }
    public Stream<Pociag> zwrocNajbardziejOplacalny() {
        return list.stream().sorted(Comparator.comparing(Pociag::getCenaPodrozy));
    }


}
