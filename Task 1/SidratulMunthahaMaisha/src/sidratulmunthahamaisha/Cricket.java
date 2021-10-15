/*
Name:Sidratul Munthaha Maisha, ID:2012020307, Sec:5G, Email: cse_2012020307@lus.ac.bd ,Date:9/15/2021
 */
package sidratulmunthahamaisha;

public class Cricket extends Sports  {
    String matchType;
    int over;
    Player player;
    Cricket(String matchType, int over, Player player)
    {
        this.matchType= matchType;
        this.over=over;
        this.player=player;
    }
     void display()
    {
    System.out.println("Match type :" +matchType);
     System.out.println("Over the match :" +over);
     System.out.println("Name of a Player :" +player.playerName);
       System.out.println("Jersy number of a player:" +player.jersyNumber);
    }
}
