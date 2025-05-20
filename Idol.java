public class Idol extends Group {
    private String name;
    private int age;
    private int height;
    private int debutYear;
    private boolean cancelled;
    private boolean isActive;
    private static int numIdol;

    public Idol(){
        name  = "null";
        age = 0;
        height = 0;
        debutYear = 0;
        numIdol++;
    }

    public Idol(String na, int ag){
      this(na,ag, 0, 0 );
        numIdol++;
    }

    public Idol(String na, int ag, int ht, int dy){
        name = na;
        age = ag;
        height = ht;
        debutYear = dy;
        numIdol++;
    }

    //acessor methods
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;

    }

    public int getDebutYear(){
        return debutYear;
    }

    public boolean getCancelled(){
        return cancelled;
    }

    public boolean getIsActive(){
        return isActive;
    }
    

    //mutator methods
    public void setName(String n){
        name = n;
    }

    public void setAge(int a){
        age = a;
    }

    public void setHeight(int h){
        height = h;
    }

    public void setDebutYear(int dy){
        debutYear = dy;
    }

    public void setCancelled(boolean c){
        if (c == true){
            cancelled = "Not yet!";
        }else{
            cancelled = "Cancelled!";
        }
    }

    public void setIsActive(boolean ia){
        isActive = ia;
    }


    public String toString(){
        return "name: " + name + "|| age: " + age + "|| height: " + height + "|| debut year: " + debutYear + "|| cancelled: " + cancelled + "|| is active: " + isActive; 
    }
}
