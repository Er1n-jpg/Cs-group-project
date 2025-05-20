import java.util.Scanner;
public class main{
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("You have started a k-pop company! Hello CEO! pls enter your name");
        String ceo = console.nextLine();
        System.out.println("Please enter your company name");
        String name = console.nextLine();
        
        Company c = new Company(ceo, name);

        System.out.println("Would you like to make a group? (yes/no)");
        String answer = console.nextLine();
        if (answer.equals("yes")){
            System.out.println("please enter how many members you want in your group");
            int numMembers = console.nextInt();
            System.out.println("what is the desired debut year of your group?");
            int debutYear = console.nextInt();
            console.nextLine(); // Consume the newline character
            String idolName;
            Idol[] members = new Idol[numMembers]; // Declare the array to store members
            for (int i = 0; i < numMembers; i++){
                int randomizer = (int) (Math.random() * 12 + 1);
                switch (randomizer){
                    case 1: 
                    idolName = "Mina";
                    break;

                    case 2:
                    idolName = "Sana";
                    break;

                    case 3:
                    idolName = "Nayeon";
                    break;

                    case 4: 
                    idolName = "Chaewon";
                    break;

                    case 5:
                    idolName = "Yuna";
                    break;

                    case 6:
                    idolName = "Yujin";
                    break;

                    case 7: 
                    idolName = "Miyeon";
                    break;

                    case 8:
                    idolName = " Minji";
                    break;

                    case 9: 
                    idolName = "Haerin";
                    break;

                    case 10:
                    idolName = "Wonyoung";
                    break;

                    case 11:
                    idolName = "Jisoo";
                    break;

                    case 12:
                    idolName = "Yena";
                    break;

                    default:
                    idolName = "N/A";
                    break;


                        
                }
                int randomAge = (int) (Math.random() * 10 + 15);
                int randomHeight = (int) (Math.random() * 10 + 160);
                members[i] = new Idol(idolName, randomAge, randomHeight, debutYear);
            }
            System.out.println("please enter a name for your group");
            String groupName = console.nextLine();
            Group g = new Group(groupName, numMembers, 0, members);
            System.out.println(g.toString());
            System.out.println("Here are all the members of your group");
            for(int i = 0; i < members.length; i++){
                System.out.println(members[i].toString());
            }

            System.out.println();
            System.out.println("would you like to change any members of your group? (yes/no)");
            if (console.nextLine().equals("yes")){
                System.out.println("Please enter the name of the member you would like to change");
                String memberName = console.nextLine();
                for (int i = 0; i < members.length; i++){
                    if (members[i].getName().equals(memberName)){
                        System.out.println("Please enter the new name of the member");
                        String newName = console.nextLine();
                        members[i].setName(newName);
                        System.out.println("Please enter the new age of the member");
                        members[i].setAge(console.nextInt());
                        System.out.println("Please enter the new height of the member");
                        members[i].setHeight(console.nextInt());
                    }
                }
            }

            boolean stillPlaying = true;

            while (stillPlaying){
            System.out.println();
            System.out.println("what would you like to do? \n" + "publish an album (enter 1) \n" + "practice (enter 2) \n" + "get member stats and group stats(enter 3) \n" + "perform a concert (enter 4) \n" + "Cancelled status? (enter 5)\n" + "exit game (enter 6)");
            int choice = console.nextInt();

            switch (choice){
                case 1:
                console.nextLine();
                System.out.println("please enter the name of the album");
                String albumName = console.nextLine();
                System.out.println("please enter the number of songs in the album");
                int numSongs = console.nextInt();
                g.publishAlbum(albumName, numSongs);
                System.out.println("Your album has been published!");
                System.out.println();
                break;

                case 2:

                for (int i = 0; i < members.length; i++){
                        members[i].practice();
                    }
                
                System.out.println("the members of " + g.getName() + "have sucessfully practiced!");
                System.out.println();
                break;

                case 3:
                console.nextLine();
                System.out.println("Please enter the name of the member you would like to get stats for");
                String memberName = console.nextLine();
                g.getMemberStats(memberName);
                g.toString();
                System.out.println();
                break;

                case 4:
                console.nextLine();
                System.out.println("please enter a name for your concert/tour");
                String concertName = console.nextLine();
                System.out.println("please enter a location for your concert/tour");
                String concertLocation = console.nextLine();
                g.performConcert(concertName, concertLocation);
                System.out.println("your concert has been performed!");
                break;

                case 5:
                System.out.println("I see you want to see how many members of your group have been cancelled :3");
                for (int i = 0; i < members.length; i++){
                    if (members[i].getCancelled() == true){
                        System.out.println(members[i].getName() + " has been cancelled");
                    }
                    else{
                        System.out.println(members[i].getName() + " has not been cancelled");
                    }
                }
                break;

                case 6:
                System.out.println("thank you for playing! goodbye!");
                stillPlaying = false;
                break;

                default: 
                System.out.println("please enter another option");
                break;
            }
            System.out.println();
            System.out.println("a new day has started!");
            c.newDay();
            g.newDay();

            for (int i = 0; i < members.length; i++){
                members[i].newDay();
            }

       }             
            
            
        } else {
            System.out.println("see you later CEO  :)");
        }
    }
}

