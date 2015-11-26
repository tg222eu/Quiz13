
public class Quote {

    private String quote;   //Quote by a politiction
    private String[] list = new String[2];

    public Quote(String q, String s, String s2, String s3){
        quote = q;
        list[0] = s;
        list[1] = s2;
        list[2] = s3;
    }

    public String getQuote(){
        return quote;
    }

    public String getPerson(int i){
        return list[i];
    }

}
