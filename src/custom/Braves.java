package custom;

public class Braves {

    private String pitchers;
    private String outfield;
    private String infield;
    private int homeRuns;
    private int runsBattedIn;
    private int battingAverage;
    private int stolenBases;
    private boolean homeGame;

    public Braves(){

    }

    public Braves(String outfield, int homeRuns){
        this.outfield=outfield;
        this.homeRuns=homeRuns;
    }
    public Braves(boolean homeGame, int homeRuns, int battingAverage){
        this.homeGame=homeGame;
        this.homeRuns=homeRuns;
        this.battingAverage=battingAverage;
    }

    public String getPitchers(){
        return pitchers;}
    public String getOutfield(){
        return outfield;}
    public int getHomeRuns(){
        return homeRuns;}

    public void setPitchers(String pitchers){this.pitchers=pitchers;}
    
    public void setOutfield(String outfield){this.outfield=outfield;}
    public void setHomeRuns(int homeRuns){this.homeRuns=homeRuns;}

    public boolean isHomeGame(){return false;}

    public String rightHandedPitchers(String List){
        return "Here are all the right handed pitchers for the braves." + List;
    }

    public static void main(String[] args){
        Braves freddieFreeman = new Braves();
    }

}
