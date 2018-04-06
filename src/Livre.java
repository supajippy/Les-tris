public class Livre implements Comparable<Livre> {


    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSoustitre() {
        return soustitre;
    }

    public void setSoustitre(String soustitre) {
        this.soustitre = soustitre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getMaisonEdition() {
        return maisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        this.maisonEdition = maisonEdition;
    }

    public String getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(String anneePublication) {
        this.anneePublication = anneePublication;
    }

    String isbn;
    String titre;
    String soustitre;
    String auteur;
    String maisonEdition;
    String anneePublication;


    String [] iSBNs={"6546546543","3653169833","3652345987","2312654985","3216523240","1322648598","1323654820","2652032514",
    "2355569878","2365203216"};
    String [] titres={"La meute","L'Animal","Le Voyou","Le Poil","L'Insulte","La chose","Le Ligre","La chaine","La riposte",
    "La Pustule"};
    String[] sousTitres={"Enchantee","Imposant","Robuste","Tenace","Decrepit","Du Diable","De Satan","Malveillant","Narquois","Moqueur"};
    String[] auteurs={"Ti-Joe Lamothe","Pinpin","Ponpon","Marcel","Martau","Joe Gage","Crispy crisp","Stephane King",
    "Gerald Ford","L'Homme"};
    String[] maisonsEdition={"La plume","La pile","La file","La queueleuleu","Le petit escabeau","La meche courte",
    "La bonne femme","Pape edition","Le Quotidien","La derniere"};
    String[] anneesPublication={"1989","1543","2012","1124","1989","2011","2000","1325","2003","1991"};

    public Livre() {
        this.isbn = iSBNs[(int)(Math.random()*9)+1];
        this.titre = titres[(int)(Math.random()*9)+1];;
        this.soustitre = sousTitres[(int)(Math.random()*9)+1];;
        this.auteur = auteurs[(int)(Math.random()*9)+1];;
        this.maisonEdition = maisonsEdition[(int)(Math.random()*9)+1];;
        this.anneePublication = anneesPublication[(int)(Math.random()*9)+1];;
    }
    public int compareTo(Livre autre){
        return this.getAnneePublication().compareTo(autre.getAnneePublication());
    }
    public String toString(){
        return "("+this.getMaisonEdition()+","+this.getAuteur()+","+this.getTitre()+","+this.getAnneePublication();
    }
}
