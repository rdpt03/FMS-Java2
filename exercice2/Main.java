package exercice2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Inserer un numero: ");
		if(s.hasNextInt()){ //solution pour question 2.3
			int number = s.nextInt();
			//check positive or negative
			if(number > 0){
				System.out.println(number+" est positif");
			}
			else if(number < 0){
				System.out.println(number+" est negatif");
			}
			else{
				System.out.println("est 0");
			}
			
			//check even or odd
			if(number % 2 == 0){
				System.out.println(number+" est pair");
			}
			else{
				System.out.println(number+" est impair");
			}
			
		}
		else{
			System.out.println("n'est pas un numero");
		}
	}
	
	private static boolean stringToInt(String n){
		Scanner sc = new Scanner(n);
		if(sc.hasNextInt()){
			sc.close();
			return true;
		}else{
			sc.close();
			return false;
		}
	}
}