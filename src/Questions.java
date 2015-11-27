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
        addQuoteObject(new Quote("\"Jag är baske mig ingen ohederlig person! Jag är ingen fifflare.\"", "Mona Sahlin (S)", "Alf Svensson (KD)", "Jimmie Åkesson (SD)"));
        addQuoteObject(new Quote("På frågan om vem som är roligast i riksdagen: \"Det är en sällsynt tråkig församling, måste jag säga.\" ", "Göran Persson (S)", "Gustav Fridolin (MP)", "Margot Wallström (S)"));
        addQuoteObject(new Quote("\"Detta är en hälsning till den samlande vänstern: Våga inte kalla mig hård, kall och nyliberal.\" ", "Annie Lööf (C)", "Kent Ekeroth (SD)", "Carl Bildt (M)"));
        addQuoteObject(new Quote("Om kungens påstådda fortkörning: \"Folk kan skadas och till och med dödas. Sådan här fortkörning är inte ett acceptabelt beteende.\"", "Göran Hägglund (KD)", "Gudrun Schyman (FI)", "Jan Björklund (FP)"));
        addQuoteObject(new Quote("\"Sanningen kommer alltid fram.\"", "Erik Almqvist (SD)", "Ali Esbati (V)", "Åsa Romson (MP)"));
        addQuoteObject(new Quote("\"Jag kommer svara på samma sätt, det är inte lönt att du fortsätter ställa frågan.\"", "Maud Olofsson (C)", "Fredrik Reinfeldt (M)", "Maria Wetterstrand (MP)"));
        addQuoteObject(new Quote("\"Pengar är överskattade.\" ", "Gudrun Schyman (FI)", "Magdalena Andersson (S)", "Anders Borg (M)"));
        addQuoteObject(new Quote("\"I våldets Sverige så får hederliga medborgare flytta åt sidan. I rädsla för att vara nästa som \n" +
                "drabbas av våldsverkaren, med vapen i hand, med drogögon mitt i ansiktet, så vet vi inte vad den \n +" +
                "här personen är kapabel att göra.\" ", "Fredrik Reinfeldt (M)", "Björn Söder (SD)", "Laila Freivalds (S)"));
        addQuoteObject(new Quote("Under ett möte i Rinkeby då lasermannen härjade. \"En friktionsyta uppstår förvisso, men det är \n "
                + "denna motsatsernas fredliga dynamik som med mitt sätt att se betyder oerhört mycket för att \n "
                + "vitalisera det svenska samhället.\"", "Carl Bildt (M)", "Håkan Juholt (S)", "Lars Leijonborg (FP)"));
        addQuoteObject(new Quote("\"Rysk gas har två nackdelar. Den ena är att den är gas, och den andra är att den är rysk.\" ", "Jan Björklund (FP)", "Håkan Juholt (S)", "Lars Ohly (V)"));
        addQuoteObject(new Quote("\"När jag hör Jimmie Åkesson prata om miljöfrågan, börjar jag tänka på ett sånt här flaskskepp, hur kom du in hit egentligen?\" ", "Jonas Sjöstedt (V)", "Maud Olofsson (C)", "Peter Eriksson (MP)"));
        addQuoteObject(new Quote("\"Hälsa honom att den svenska utrikespolitiken inte är några pajaskonster. Det är inte hä, hä och hep, hep.\"", "Olof Palme (S)", "Bo Lundgren (M)", "Carl Bildt (M)"));
        addQuoteObject(new Quote("\"Kärnkraften skall avvecklas, men aldrig om industrin inte klarar av det.\"", "Stefan Löfven (S))", "Annie Lööf (C)", "Åsa Romson (MP)"));

    }

}
