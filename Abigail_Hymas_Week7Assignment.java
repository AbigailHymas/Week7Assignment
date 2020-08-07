//Abigail Hymas

import java.util.Scanner;
import java.util.Random;

public class Abigail_Hymas_Week7Assignment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----------------------------------------------------------");
		System.out.println("Football Team Randomized Season Scores");
		System.out.println("----------------------------------------------------------");
		System.out.print("Enter the number of Teams: ");
		int numberofTeams = input.nextInt();
		System.out.print("Enter the number of Games: ");
		int numberofGames = input.nextInt();
		
		input.close();

		Random random = new Random();
		int array[][] = new int[numberofTeams][numberofGames];
		
		//Random Scores within range (0-99)
	for(int i=0; i<numberofTeams; i++){	
		int total = 0;
	for(int j=0; j<numberofGames; j++){
		array[i][j] = random.nextInt(100);
		total = total+array[i][j];	
	}
}
	//Score report with nested loops
	System.out.println("----------------------------------------------------------");
	System.out.println("Football Scores Report");
	System.out.println("Team\tScores				Tot  Avg");
	System.out.println("----------------------------------------------------------");
		int topTeamScores = 0;
		int topTeam = 0;
	
	for(int i=0; i<numberofTeams; i++) {
		int total = 0;
		System.out.print((i+1) + ":\t");
	for(int j=0; j<numberofGames; j++) {
		System.out.print(array[i][j] + " ");
		total = total + array[i][j];
	}
	System.out.print("\t" + total + "  ");
	System.out.print((total/numberofGames) + "\n");

	
	//Top Teams
	if(topTeamScores<total) {
		topTeamScores = total;
		topTeam = i+1;
	}
}
	System.out.println("----------------------------------------------------------");
	System.out.println("Top Team: Team " +topTeam);
	System.out.println("----------------------------------------------------------");
}
}


