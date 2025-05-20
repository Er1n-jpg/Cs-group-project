public class Group extends Company implements fan{
    private String name;
    private int numMembers;
    private int numSongs;
    private int hateMetre;
    private int numAlbums;
    private String fandomName;
    private int numFans;
    private boolean isActive;
    private Idol[] members; // TRUST ME ON THIS -> array to store group members
    

    // Accessor methods
    public Group() {
        this("", 0, 0, null);
    }

    public Group(String na) {
        this(na, 0, 0, null);
    }

    public Group(String na, int nm, int ns, Idol[] m) {
        name = na;
        numMembers = nm;
        numSongs = ns;
        members = m;
    }

    public String getName() {
        return name;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public int getNumSongs() {
        return numSongs;
    }

    public int getHateMetre() {
        return hateMetre;
    }

    public int getNumAlbums() {
        return numAlbums;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String getFandomName() {
        return fandomName;
    }

    private int getNumFans(){
        return numFans;
    }

    public Idol[] getMembers() {
        return members;
    }

    // Mutator methods
    public void setName(String na) {
        name = na;
    }

    public void setNumMembers(int nm) {
        numMembers = nm;
    }

    public void setNumSongs(int ns) {
        numSongs = ns;
    }

    public void setHateMetre(int hm) {
        hateMetre = hm;
    }

    public void setNumAlbums(int na) {
        numAlbums = na;
    }

    public void setIsActive(boolean ia) {
        isActive = ia;
    }

    public void setFandomName(String fn) {
        fandomName = fn;
        
    }

    public void setNumFans(int nf) {
        if(nf>0){
         numFans = nf;
        }
    }

    public void setMembers(Idol[] m) {
        members = m;
    }


    public void getMemberStats(String na) {
        for (int i = 0; i < members.length; i++) {
            if (members[i].getName().equals(na)) {
                System.out.println(members[i].toString());
                break;
            }
        }

    }

    public void publishAlbum(String albumName, int numSongs) {
        int copiesSold = (int) (Math.random() * 1000000);
        int sales = copiesSold * 35;


    }

    public void performConcert(String concertName, String concertLocation) {
        int ticketsSold = (int) (Math.random() *(1000-70000 - 1));
        System.out.println("Concert: " + concertName + " has been performed with " + ticketsSold + " tickets sold at" + concertLocation);
        int randomIdol =  (int) (Math.random() * members.length);
        members[randomIdol].randomCancel();
        int moneyMade = (int) (Math.random() * 2000000- -1000000);
        System.out.println(members[randomIdol].getName() + " has been cancelled");
        System.out.println(name + " has performed a concert at " + concertLocation + " with " + ticketsSold + " tickets sold and made " + moneyMade + " dollars");
    }

    public String toString(){
        return "Group name: " + name + "|| Number of Members: " + numMembers + "|| Fandom Name: " + fandomName + "|| Number of songs: " + numSongs + "|| Number of albums: " + numAlbums + "|| Hate Metre: " + hateMetre + "|| Is Active: " + isActive; 
    }

    public void newDay(){
        hateMetre = hateMetre + (int) (Math.random() * 20 -10);
        if(hateMetre > 100){
            isActive = false;
        }

        
    }

}
    







