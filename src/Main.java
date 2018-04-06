import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        List<Livre> liste=new ArrayList<>();
        for(int i=0;i<10;i++){
            Livre livre=new Livre();
            liste.add(livre);
        }
        Collections.sort(liste);
        System.out.println(liste);

        Collections.sort(liste, new Comparateur());
        System.out.println(liste);

        TreeSet<Livre>liste2=new TreeSet<>();
        for(int i =0;i<10;i++){
            liste2.add(new Livre());
        }
        System.out.println(liste2);

        TreeSet<Livre>liste3=new TreeSet<>(new Comparateur());
        for(int i =0;i<10;i++){
            liste3.add(new Livre());
        }
        System.out.println(liste3);

        for(int i=1;i<10;i++){
            int k=i;
            for(int j=2;j<10;j++){
                if(liste.get(j).getAnneePublication().compareTo(liste.get(k).getAnneePublication())<0){
                    k=j;
                }
                else {
                    Livre tempo=liste.get(i);
                    liste.set(i,liste.get(k));
                    liste.set(k,tempo);
                }
            }
        }
        System.out.println(liste);



    }




}
