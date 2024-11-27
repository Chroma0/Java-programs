package homework4;
import java.util.Scanner;
public class homework4 {
	public static void main(String arg[]) {
		double num=0;
		try (Scanner scanner = new Scanner(System.in)) {
			num=scanner.nextDouble();
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=(int)num-1;i>1;i--) {
			int sqrtnum=(int)Math.sqrt((double)i);
			if(i%2==0 && i!=2) continue;
			else if(i==2) {
				System.out.printf("%d",i);
				System.out.println();
				break;
			}
			else {
				if(IsPrime(i,sqrtnum)==1) {
					System.out.printf("%d",i);
					System.out.println();
					break;
				}
			}
		}
	}
	public static int IsPrime(int x,int y) {
		int result=0;
		int count=0;
		if((x%2)!=0) {
			for(int i=y;i>1;i--) {
				if((x%i)==0) {
					count++;
					break;
				}
			}
			if(count==0) {
				result=1;
			}
		}
		return result;
	}
}
