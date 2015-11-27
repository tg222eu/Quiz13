import java.util.ArrayList;

public class Questions {

    public ArrayList<Quote> quoteList;

    public Questions(){
        quoteList = new ArrayList<Quote>();

    }

    public void addQuoteObject(Quote q){
        quoteList.add(q);
    }

    public Quote getQuoteObject(int i){
        return quoteList.get(i);
    }

    public void fillQuotes(){
        addQuoteObject(new Quote("\"Jag �r baske mig ingen ohederlig person! Jag �r ingen fifflare.\"", "Mona Sahlin (S)", "Alf Svensson (KD)", "Jimmie �kesson (SD)"));
        addQuoteObject(new Quote("P� fr�gan om vem som �r roligast i riksdagen: \"Det �r en s�llsynt tr�kig f�rsamling, m�ste jag s�ga.\" ", "G�ran Persson (S)", "Gustav Fridolin (MP)", "Margot Wallstr�m (S)"));
        addQuoteObject(new Quote("\"Detta �r en h�lsning till den samlande v�nstern: V�ga inte kalla mig h�rd, kall och nyliberal.\" ", "Annie L��f (C)", "Kent Ekeroth (SD)", "Carl Bildt (M)"));
        addQuoteObject(new Quote("Om kungens p�st�dda fortk�rning: \"Folk kan skadas och till och med d�das. S�dan h�r fortk�rning �r inte ett acceptabelt beteende.\"", "G�ran H�gglund (KD)", "Gudrun Schyman (FI)", "Jan Bj�rklund (FP)"));
        addQuoteObject(new Quote("\"Sanningen kommer alltid fram.\"", "Erik Almqvist (SD)", "Ali Esbati (V)", "�sa Romson (MP)"));
        addQuoteObject(new Quote("\"Jag kommer svara p� samma s�tt, det �r inte l�nt att du forts�tter st�lla fr�gan.\"", "Maud Olofsson (C)", "Fredrik Reinfeldt (M)", "Maria Wetterstrand (MP)"));
        addQuoteObject(new Quote("\"Pengar �r �verskattade.\" ", "Gudrun Schyman (FI)", "Magdalena Andersson (S)", "Anders Borg (M)"));
        addQuoteObject(new Quote("\"I v�ldets Sverige s� f�r hederliga medborgare flytta �t sidan. I r�dsla f�r att vara n�sta som \n" +
                "drabbas av v�ldsverkaren, med vapen i hand, med drog�gon mitt i ansiktet, s� vet vi inte vad den \n +" +
                "h�r personen �r kapabel att g�ra.\" ", "Fredrik Reinfeldt (M)", "Bj�rn S�der (SD)", "Laila Freivalds (S)"));
        addQuoteObject(new Quote("Under ett m�te i Rinkeby d� lasermannen h�rjade. \"En friktionsyta uppst�r f�rvisso, men det �r \n "
                + "denna motsatsernas fredliga dynamik som med mitt s�tt att se betyder oerh�rt mycket f�r att \n "
                + "vitalisera det svenska samh�llet.\"", "Carl Bildt (M)", "H�kan Juholt (S)", "Lars Leijonborg (FP)"));
        addQuoteObject(new Quote("\"Rysk gas har tv� nackdelar. Den ena �r att den �r gas, och den andra �r att den �r rysk.\" ", "Jan Bj�rklund (FP)", "H�kan Juholt (S)", "Lars Ohly (V)"));
        addQuoteObject(new Quote("\"N�r jag h�r Jimmie �kesson prata om milj�fr�gan, b�rjar jag t�nka p� ett s�nt h�r flaskskepp, hur kom du in hit egentligen?\" ", "Jonas Sj�stedt (V)", "Maud Olofsson (C)", "Peter Eriksson (MP)"));
        addQuoteObject(new Quote("\"H�lsa honom att den svenska utrikespolitiken inte �r n�gra pajaskonster. Det �r inte h�, h� och hep, hep.\"", "Olof Palme (S)", "Bo Lundgren (M)", "Carl Bildt (M)"));
        addQuoteObject(new Quote("\"K�rnkraften skall avvecklas, men aldrig om industrin inte klarar av det.\"", "Stefan L�fven (S))", "Annie L��f (C)", "�sa Romson (MP)"));

    }

}
