package homework3;
import java.util.Scanner;
public class homework3 {
	public static void main(String arg[]) {
		int num=0;
		try (Scanner scanner = new Scanner(System.in)) {
			num=scanner.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<(num/2+1);i++) {
			System.out.printf("%d",calculate(i+1,num));
			System.out.print(" ");
		}
		if(num%2==0) {
			for(int i=num/2;i>0;i--) {
				if(i==1) {
					System.out.printf("%d",calculate(i,num));
				}
				else {
					System.out.printf("%d",calculate(i,num));
					System.out.print(" ");
				}
			}
		}
		else {
			for(int i=num/2+1;i>0;i--) {
				if(i==1) {
					System.out.printf("%d",calculate(i,num));
				}
				else {
					System.out.printf("%d",calculate(i,num));
					System.out.print(" ");
				}
			}
		}
	}
	public static int calculate(int a,int b) {
		int result=0;
		if(a==1 || a==(b+1)) {
			result=1;
		}
		else {
			if(b>2) {
				int sum=calculate(a-1,b-1)+calculate(a,b-1);
				result=sum;
			}
			else if(b==2) {
				if(a==2) result=2;
				else result=1;
			}
		}
		return result;
	}
}