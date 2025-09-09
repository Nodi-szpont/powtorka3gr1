public class Uczen extends osoba{
    private static int LiczbaUczniow = 0;
    private int nrUcznia;

    public Uczen(String imie, String nazwisko) {
        super(imie, nazwisko);
        LiczbaUczniow++;
        nrUcznia = LiczbaUczniow;
    }

    public static int getLiczbaUczniow() {
        return LiczbaUczniow;
    }

    public static void setLiczbaUczniow(int liczbaUczniow) {
        LiczbaUczniow = liczbaUczniow;
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public void setNrUcznia(int nrUcznia) {
        this.nrUcznia = nrUcznia;
    }

    @Override
    public String toString() {
        return "Uczen{ imie:" + getImie() + "nazwisko" + getNazwisko()+
                "nrUcznia=" + nrUcznia +
                '}';
    }
}
