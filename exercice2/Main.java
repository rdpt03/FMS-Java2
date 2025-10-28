package exercice2;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		ArrayList<Integer> numbers = new ArrayList<>();
		if(args.length > 0){
			for(String argument : args){
				if(stringToInt(argument)){
					numbers.add(Integer.parseInt(argument));
				}
			}
		}else{
			Scanner s = new Scanner(System.in);
			System.out.println("Inserer un numero: ");
			if(s.hasNextInt()){
				numbers.add(s.nextInt());
			}
		}	
			
		if(numbers.size() > 0){ //solution pour question 2.3
			for(int number : numbers){
				if(number != 0){
					String positiveOrNegative = "", evenOrOdd = "";
					
					//check positive or negative
					if(number > 0){
						positiveOrNegative = "positif";
					}
					else if(number < 0){
						positiveOrNegative = "negatif";
					}
					
					//check even or odd
					if(number % 2 == 0){
						evenOrOdd = "pair";
					}
					else{
						evenOrOdd = "impair";
					}
					System.out.println(number + " est " + positiveOrNegative + " et "+evenOrOdd); 
				}
				else{
					System.out.println("est 0");
				}
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