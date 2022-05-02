package projeto;

public class ScoreBoard {
    int time1 = 0;
    int time2 = 0;
    
    public int scoreTeamA1(){
        return this.time1 = this.time1 + 1;
    }
    public int scoreTeamA2(){
        return this.time1 = this.time1 + 2;
    }
    public int scoreTeamA3(){
        return this.time1 = this.time1 + 3;
    }
    
    public int scoreTeamB1(){
        return this.time2 = this.time2 + 1; 
    }
    public int scoreTeamB2(){
        return this.time2 = this.time2 + 2;
    }
    public int scoreTeamB3(){
        return this.time2 = this.time2 + 3;
    }
    
    public String getScore(){
        
        String placar1 = "000";
        String placar2 = "000";

        if (this.time1 > 9) {
            placar1  = "0" + this.time1;
           
        }
        if (this.time1 <= 9) {
            placar1  = "00" + this.time1;
           
        }
       
        if (this.time1 > 99) {
            placar1  = "" + this.time1;
          
        }
        if(this.time1 > 999){
            this.time1 = 999;
            placar1 = "" + this.time1;
            return "não poderá ultrapassar 999";

        }

        
        if (this.time2 > 9) {
            placar2  = "0" + this.time2;
           
        }
        if (this.time2 <= 9) {
            placar2  = "00" + this.time2;
            
        }
        if (this.time2 > 99) {
            placar2  ="" + this.time2;
       
        }
        if(this.time2 > 999){
            this.time2 = 999;
            placar2 = "0" + this.time2;
            return "não poderá ultrapassar 999";
        }
        
        return placar1 + ":" + placar2 ;
    }
}
