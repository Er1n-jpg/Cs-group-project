public class Group extends Company {
      private String name;
    private int numMembers;
    private int numSongs;
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

    public boolean getIsActive() {
        return isActive;
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

    public void setIsActive(boolean ia) {
        isActive = ia;
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
        int sales = (int) (Math.random() * 1000000);
        System.out.println("Album: " + albumName + " has been released with " + numSongs + " songs and has sold "
                + sales + " copies.");
    }
  
}
