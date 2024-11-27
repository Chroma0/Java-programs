package homework1;
import java.util.Scanner;
public class homework1{
	public static void main(String[] args) {
		double a=0.0,b=0.0,c=0.0;
		try (Scanner scanner = new Scanner(System.in)) {
			a=scanner.nextDouble();
			b=scanner.nextDouble();
			c=scanner.nextDouble();
		}catch(Exception e) {
			e.printStackTrace();
		}
		double sum=c/b*a/30*1000;
		System.out.printf("%.1f",sum);
	}
}