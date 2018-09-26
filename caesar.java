import java.util.Scanner;

class caesar{
public static void main(String[] args){
		System.out.println("Thrice game" + '\n' + "Round 1:");
		Scanner scan = new Scanner(System.in);
		
		int value = 0, count = 0, round2Rolls, round2Mult = 1, triplet1;
		double power3 = 1, tally = 0;
		
		System.out.println("Rolling die");
		int die1 = (int) (Math.random()*6 + 1);
		int die2 = (int) (Math.random()*6 + 1);
		int die3 = (int) (Math.random()*6 + 1);
		System.out.println("Die 1 = " + die1 + " Die 2 = " + die2 + " Die 3 = " + die3);
		
		count++;
		tally = tally + die1 + die2 + die3;
		
		while(!(die1 == die2 && die2 == die3)){
			System.out.println("Rerolling");
			
			count++;
			
			die1 = (int) (Math.random()*6 + 1);
			die2 = (int) (Math.random()*6 + 1);
			die3 = (int) (Math.random()*6 + 1);
			System.out.println("Die 1 = " + die1 + " Die 2 = " + die2 + " Die 3 = " + die3);
			
			if(count % 3 == 0){
				tally = tally - die1 - die2 - die3;
			} else {
				tally = tally + die1 + die2 + die3;
			}

		}
		
		triplet1 = die1;
		
		System.out.println("Tally = " + tally + " Count = " + count);
		System.out.println("------END ROUND 1--------");
		
		round2Rolls = die1;
		
		for(int i = 1; i <= round2Rolls; i++){
			System.out.println("Rolling single die");
			die1 = (int) (Math.random()*6 + 1);
			System.out.println("Die value = " + die1);
			round2Mult = die1 * round2Mult;
		}
		System.out.println("Multiplication of round 2 = " + round2Mult);
		tally = tally + round2Mult;
		System.out.println("Tally = " + tally);
		
		System.out.println("------END ROUND 2--------");
		
		System.out.println("Would you like to roll (1) or retire (0)?");
		int rollTire = scan.nextInt();
		
		if(rollTire == 1){
			die1 = -1;
			power3 = 1;
			while(!(die1 == die2 && die2 == die3)){
				System.out.println("Rolling");
				die1 = (int) (Math.random()*6 + 1);
				die2 = (int) (Math.random()*6 + 1);
				die3 = (int) (Math.random()*6 + 1);
				System.out.println("Die 1 = " + die1 + " Die 2 = " + die2 + " Die 3 = " + die3);
				
				
				tally = tally + power3;
				System.out.println("Roll worth: " + power3 + " Tally = " + tally);
				power3 = power3 * 3;
				
			}
			if(triplet1 == die1){
				tally = tally * tally * tally;
			} else {
				tally = die1;
			}
		}
		
		System.out.println("Finaly tally = " + tally);
	}
}