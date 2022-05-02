package projeto;

public class Ohce {
    public Boolean ohce(String str) {
        StringBuilder strb = new StringBuilder(str);
        String plavra = strb.reverse().toString();
        if (str.equals(plavra)){
            return  true;
        }else{
            return false;
        }

        
    }
}
