package homework2;
import java.util.Scanner;
public class homework2{
	public static void main(String[] args) {
		int a=0,b=0;
		String c="";
		try (Scanner scanner = new Scanner(System.in)) {
			a=scanner.nextInt();
			b=scanner.nextInt();
			scanner.nextLine();
			c=scanner.nextLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		String A="",B="";
		switch (a) {
			case 0:
				A="zero";
				break;
			case 1:
				A="one";
				break;
			case 2:
				A="two";
				break;
			case 3:
				A="three";
				break;
			case 4:
				A="four";
				break;
			case 5:
				A="five";
				break;
			case 6:
				A="six";
				break;
			case 7:
				A="seven";
				break;
			case 8:
				A="eight";
				break;
			case 9:
				A="nine";
				break;
			default:
				break;
		}
		switch (b) {
			case 0:
				B="zero";
				break;
			case 1:
				B="one";
				break;
			case 2:
				B="two";
				break;
			case 3:
				B="three";
				break;
			case 4:
				B="four";
				break;
			case 5:
				B="five";
				break;
			case 6:
				B="six";
				break;
			case 7:
				B="seven";
				break;
			case 8:
				B="eight";
				break;
			case 9:
				B="nine";
				break;
			default:
				break;
	}
		switch (c) {
			case "+":
				if(a<0 || a>9) System.out.println("invalid number");
				else {
					if(b<0 || b>9) System.out.println("invalid number");
					else {
						int sum=a+b;
						System.out.println(A+" plus "+B+" is "+sum);
					}
				}
				break;
			case "-":
				if(a<0 || a>9) System.out.println("invalid number");
				else {
					if(b<0 || b>9) System.out.println("invalid number");
					else {
						int sum=a-b;
						System.out.println(A+" minus "+B+" is "+sum);
					}
				}
				break;
			case "*":
				if(a<0 || a>9) System.out.println("invalid number");
				else {
					if(b<0 || b>9) System.out.println("invalid number");
					else {
						int sum=a*b;
						System.out.println(A+" multiplied by "+B+" is "+sum);
					}
				}
				break;
			case "/":
				if(a<0 || a>9) System.out.println("invalid number");
				else {
					if(b<0 || b>9) System.out.println("invalid number");
					else if(b==0) System.out.println("division by zero is not allowed");
					else {
						int sum=a/b;
						System.out.println(A+" divided by "+B+" is "+sum);
					}
				}
				break;
			case "^":
				if(a<0 || a>9) System.out.println("invalid number");
				else {
					if(b<0 || b>9) System.out.println("invalid number");
					else {
						int sum=a;
						if(b==0) sum=1;
						else {
							for(int i=1;i<b;i++) sum*=a;
						}
						System.out.println(A+" to the power "+B+" is "+sum);
					}
				}
				break;
		}
	}
}