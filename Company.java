public class Company {
    private String ceo;
    private String name;
    private int numGroups;
    private int hatemetre;
    private boolean jypapi;
    private int numTrainees;
    private int netWorth;

    public Company() {
        this("", "", 0, 0 );
    }

    public Company(String c, String na) {
        this(c, na, 0, 0);
    }

    public Company(String c, String na, int ng, int hm) {
        c= ceo;
        na= name;
        ng= numGroups;
        hm= hatemetre;

    }
//acessor methods
    public String getCeo(){
        return ceo;
    }

    public String getName(){
        return name;
    }

    public int getNumGroups(){
        return numGroups;
    }

    public int getHatemetre(){
        return hatemetre;
    }

    public boolean getJypapi(){
        return jypapi;
    }

    public int getNumTrainees(){
        return numTrainees;
    }

    public int getNetWorth(){
        return netWorth;
    }

//mutator methods
    public void setCeo(String c){
        ceo = c;
    }
    public void setName(String na){
        name = na;
    }
    public void setNumGroups(int ng){
        numGroups = ng;
    }
    public void setHatemetre(int hm){
        hatemetre = hm;
    }
    public void setJypapi(boolean jp){
        jypapi = jp;
    }
    public void setNumTrainees(int nt){
        numTrainees = nt;
    }

    public void setNetWorth(int nw){
        netWorth = nw;
    }

    public void newDay(){
        hatemetre = hatemetre + 
    }




    public String toString(){
        return "company name : " + name + "\n" +
                "ceo : " + ceo + "\n" +
                "number of groups : " + numGroups + "\n" +
                "hatemetre : " + hatemetre + "\n" +
                "jypapi : " + jypapi; 
    }

    public void findTrainees(){
        int trainees = (int) (Math.random() * (100 - 5) + 5);
        numTrainees = numTrainees + trainees;
    }

    public void createGroup(){
        numGroups++;
    }



    





}
