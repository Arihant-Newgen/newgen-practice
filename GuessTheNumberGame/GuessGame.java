package play;
import java.io.*;
public class GuessGame 
{
	Player p1;
	Player p2;
	Player p3;
	public void startGame()
	{
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
//		Creating variables for holding the guesses of players
		int gp1=0;
		int gp2=0;
		int gp3=0;
//		for matching the players ans
		boolean p1ans=false;
		boolean p2ans=false;
		boolean p3ans=false;
//		Target no. that players will match from
		int min = 0;  
		int max = 10;  
		int targetNo= (int) (Math.random()*(max-min+1)+min);
		System.out.println("Guess the number from 0....9 both inclusive");
		while(true)
		{
			System.out.println("The number to guess is-:" + targetNo);
			p1.guess();
			p2.guess();
			p3.guess();
			gp1 = p1.number;
			 System.out.println("Player one guessed"+ gp1);
			 gp2 = p2.number;
			 System.out.println("Player two guessed" + gp2);
			 gp3 = p3.number;
//			 System.out.println(“Player three guessed “ + gp3)
			 System.out.println("Player three guessed " + gp3);
			 if (gp1 == targetNo) {
				 p1ans = true;
				 }
				 if (gp2 == targetNo) {
				 p2ans = true;
				 }
				 if (gp3== targetNo) {
				 p3ans= true;
				 }
				 if (p1ans || p2ans || p3ans) {

					 System.out.println("We have a winner!");
					 System.out.println("Player one got it right?"  + p1ans);
					 System.out.println("Player two got it right?"  + p2ans);
					 System.out.println("Player three got it right?" + p3ans);
					 System.out.println("Game Over");
					 break; // game over, so break out of the loop
					 } else {
					 // we must keep going because nobody got it right!
					 System.out.println("Players will have to try again.");
					 } 
					 } 
					 

		}
	
}


