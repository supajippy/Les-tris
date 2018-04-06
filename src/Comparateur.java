import java.util.Comparator;

public class Comparateur implements Comparator<Livre>{

    public int compare(Livre un, Livre deux) {
        int maEdcomparee = un.getMaisonEdition().compareTo(deux.getMaisonEdition());
        if (maEdcomparee == 0) {
            int auteurCompare = un.getAuteur().compareTo(deux.getAuteur());
            if (auteurCompare == 0) {
                int titreComparer = un.getTitre().compareTo(deux.getTitre());
                if (titreComparer == 0) {
                    int anneeComparee = un.getAnneePublication().compareTo(deux.getAnneePublication());
                    return anneeComparee;
                } else
                    return titreComparer;
            } else
                return auteurCompare;
        } else return maEdcomparee;
    }
}


