package moneyToString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moneyString m1 = new moneyString();
		
		try {
			System.out.println(""+m1.spell("11000000.01"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
