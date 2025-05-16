public class Album extends Group {
    private int numSongs;
    private int numSales;
    private String name;
    private String releaseDate;
    private String inclusions;
    private String artist;

    public Album() {
        name = "null";
        numSongs = 0;
        numSales = 0;
        releaseDate = "null";
        inclusions = "null";
    }

    public Album(String na, int ns, int nsa, String rd, String inc) {
        name = na;
        numSongs = ns;
        numSales = nsa;
        releaseDate = rd;
        inclusions = inc;
        artist = super.getName();
        
    }

    public int getNumSongs() {
        return numSongs;
    }

    public int getNumSales() {
        return numSales;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getInclusions() {
        return inclusions;
    }

    public String getArtist() {
        return artist;
    }

    public void setNumSongs(int ns) {
        numSongs = ns;
    }

    public void setNumSales(int nsa) {
        numSales = nsa;
    }

    public void setName(String na) {
        name = na;
    }

    public void setReleaseDate(String rd) {
        releaseDate = rd;
    }

    public void setInclusions(String inc) {
        inclusions = inc;
    }
    
    public void setArtist() {
        artist = super.getName();
    }

    public toString toString() {
        return "Album Name: " + name + " Number of Songs: " + numSongs + " Number of Sales: " + numSales + " Release Date: " + releaseDate + " Inclusions: " + inclusions + " Artist: " + artist;
    }

}
