import java.util.Scanner;

class cipher{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String msg, complete = "";
		int msgChar, shft;

		System.out.println("Enter message");
		msg = scan.nextLine();
		
		System.out.println("Enter amount to shift");
		shft = scan.nextInt();

		for(int i = 0; i < msg.length(); i++){
			msgChar = (int) msg.charAt(i) + shft;
			if(msgChar > 122){
				msgChar -= 26;
			}
			complete = complete + ((char) msgChar);
		}
		System.out.println("------" + '\n' + complete);
	}
}