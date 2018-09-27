import java.util.Scanner;

class cipher2{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String code, msg, complete = "";
        int shft, msgChar;

		System.out.println("Enter code");
	    code = scan.nextLine();
		
		System.out.println("Enter message");
        msg = scan.nextLine();
        
		for(int i = 0, j = 0; i < msg.length(); i++, j++){
            
            if(j > code.length()-1){
                j = 0;
            }

            shft = (int) code.charAt(j) - 96;
            msgChar = (int) msg.charAt(i) + shft;

			if(msgChar > 122){
				msgChar -= 26;
            }
            
            complete = complete + ((char) msgChar);
            System.out.println(msg.charAt(i) + " " + code.charAt(j) + " " + shft + " " + (char) msgChar );
        }
        System.out.println("--------" + '\n' + complete);
	}
}