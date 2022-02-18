import java.util.Scanner;
public class GuguMain {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		GuGudan.guGu(number);
		scan.close();
	}
}
