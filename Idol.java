public class Idol extends Group {
    private String name;
    private int age;
    private int height;
    private int debutYear;
    private static int numIdol;
    private boolean cancelled;
    private boolean isActive;
    private String position;
    private int experienceMeter;

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

    public String getPosition(){
        return position;
    }

    public int getExperienceMeter(){
        return experienceMeter;
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
        cancelled = c;
    }

    public void setIsActive(boolean ia){
        isActive = ia;
    }

    public void setPosition(String p){
        position = p;
    }

    public void setExperienceMeter(int em){
        experienceMeter = em;
    }

    
    public void practice(){
        experienceMeter += 1;
    }


    public void randomCancel(){
        int random = (int) (Math.random() * 8);
        if (random == 5){
            cancelled = true;
        }
    }


    public String toString(){
        return "name: " + name + "|| age: " + age + "|| height: " + height + "|| debut year: " + debutYear + "|| Position: " + position; 
    }

    


}
