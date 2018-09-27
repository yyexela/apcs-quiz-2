import java.util.Scanner;

class thriceSim{
public static void main(String[] args){
		//System.out.println("Thrice game" + '\n' + "Round 1:");
		Scanner scan = new Scanner(System.in);
		
		int count = 0, round2Rolls, round2Mult = 1, triplet1, die1, die2, die3;
		double power3 = 1.0, tally = 0.0, sum = 0.0;
		
		for(int j = 1; j <= 1000; j++){
			//System.out.println("Rolling die");
			die1 = (int) (Math.random()*6 + 1);
			die2 = (int) (Math.random()*6 + 1);
			die3 = (int) (Math.random()*6 + 1);
			//System.out.println(die1 + " | " + die2 + " | " + die3);
			//System.out.println("Adding");
			
			count++;
			tally = tally + die1 + die2 + die3;
			
			while(!(die1 == die2 && die2 == die3)){
				//System.out.println('\n' + "Rerolling");
				
				count++;
				
				die1 = (int) (Math.random()*6 + 1);
				die2 = (int) (Math.random()*6 + 1);
				die3 = (int) (Math.random()*6 + 1);
				//System.out.println(die1 + " | " + die2 + " | " + die3);
				
				if(count % 3 == 0){
					tally = tally - die1 - die2 - die3;
					//System.out.println("Subtracting");
				} else {
					tally = tally + die1 + die2 + die3;
					//System.out.println("Adding");
				}

			}
			
			triplet1 = die1;
			
			//System.out.println("Tally = " + tally + " Count = " + count);
			//System.out.println("------END ROUND 1--------");
			
			round2Rolls = die1;
			
			for(int i = 1; i <= round2Rolls; i++){
				//System.out.println("Rolling single die");
				die1 = (int) (Math.random()*6 + 1);
				//System.out.println("Die value = " + die1);
				round2Mult = die1 * round2Mult;
			}
			//System.out.println("Multiplication of round 2 = " + round2Mult);
			tally = tally + round2Mult;
			//System.out.println("Tally = " + tally);
			
			//System.out.println("------END ROUND 2--------");
			
			die1 = -1;
			power3 = 1;
			while(!(die1 == die2 && die2 == die3)){
				//System.out.println("Rolling");
				die1 = (int) (Math.random()*6 + 1);
				die2 = (int) (Math.random()*6 + 1);
				die3 = (int) (Math.random()*6 + 1);
				//System.out.println("Die 1 = " + die1 + " Die 2 = " + die2 + " Die 3 = " + die3);
				
				
				tally = tally + power3;
				//System.out.println("Roll worth: " + power3 + " Tally = " + tally);
				power3 = power3 * 3;
				
			}
			if(triplet1 == die1){
				//System.out.println("Tally before: " + tally);
				tally = tally * tally * tally;
				//System.out.println("Tally after: " + tally);
			} else {
				tally = die1;
			}
			
			System.out.println("Player " + j + " scored " + tally);
			sum = sum + tally;
			count = 0; round2Mult = 0; power3 = 1.0; tally = 0.0;
		}
		//double max = Double.MAX_VALUE;
		//System.out.println("Max double value: " + max);
		//long max1 = Long.MAX_VALUE;
		//System.out.println("Max long value: " + max);
		
		System.out.println("Average: " + sum / 1000.0);
	}
}