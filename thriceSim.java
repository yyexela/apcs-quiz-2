import java.util.Scanner;

class thriceSim{
public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int value = 0, count = 0, round2Rolls, round2Mult = 1, triplet1, die1, die2, die3;
		double power3 = 1, tally = 0, totalSum = 0;

		for(int j = 1; j <= 1000; j++){
		
			die1 = (int) (Math.random()*6 + 1);
			die2 = (int) (Math.random()*6 + 1);
			die3 = (int) (Math.random()*6 + 1);
			
			count++;
			tally = tally + die1 + die2 + die3;
			
			while(!(die1 == die2 && die2 == die3)){
				count++;
				
				die1 = (int) (Math.random()*6 + 1);
				die2 = (int) (Math.random()*6 + 1);
				die3 = (int) (Math.random()*6 + 1);
				
				if(count % 3 == 0){
					tally = tally - die1 - die2 - die3;
				} else {
					tally = tally + die1 + die2 + die3;
				}

			}
			
			triplet1 = die1;
			
			round2Rolls = die1;
			
			for(int i = 1; i <= round2Rolls; i++){
				die1 = (int) (Math.random()*6 + 1);
				round2Mult = die1 * round2Mult;
			}
			tally = tally + round2Mult;
			
			die1 = -1;
			power3 = 1;
			while(!(die1 == die2 && die2 == die3)){
				die1 = (int) (Math.random()*6 + 1);
				die2 = (int) (Math.random()*6 + 1);
				die3 = (int) (Math.random()*6 + 1);
				tally = tally + power3;
				power3 = power3 * 3;
			}
			if(triplet1 == die1){
				tally = tally * tally * tally;
			} else {
				tally = die1;
			}
		
			System.out.println("Player " + j + " scored " + tally);
			totalSum = totalSum + tally;
		
		}
		
		System.out.println("Average total = " + (totalSum/1000.0));
		value = 0; count = 0;
		power3 = 1; tally = 0;
	}
}