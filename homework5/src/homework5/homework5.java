package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class homework5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int index=-1;
		int[] text=new int [2000];
		Arrays.fill(text, -1001);
		String str=new String();
		str=sc.next();
		String result=new String();
		int x=0,y=0;
		for(int i=0;;i++) {
			if(str.charAt(i)==']' && str.charAt(i+1)==']') break;
			else if(str.charAt(i)!='[' && str.charAt(i)!=',' && str.charAt(i)!=']') {
				x=i;
				for(int j=i;;j++) {
					if(str.charAt(j)==']' || str.charAt(j)==',') {
						y=j;
						break;
					}
				}
				i=y-1;
				if(x==y) result=String.valueOf(str.charAt(x));
				else result=str.substring(x,y);
				index++;
				text[index]=Integer.decode(result).intValue();
			}
		}
		double length=0;
		for(int i=0;;i++) {
			if(text[i] != -1001) length++;
			else break;
		}
		double row=Math.sqrt(length);
		double column=Math.sqrt(length);
		int[][] array=new int[(int)row][(int)column];
		index=0;
		for(int i=(int)column-1;i>=0;i--) {
			for(int j=0;j<(int)row;j++) {
				array[j][i]=text[index];
				index++;
			}
		}
		System.out.print("[");
		for(int i=0;i<(int)row;i++) {
			System.out.print("[");
			for(int j=0;j<(int)column;j++) {
				System.out.print(array[i][j]);
				if(j!=(int)column-1) System.out.print(",");
				else System.out.print("]");
			}
			if(i!=(int)row-1) System.out.print(",");
			else System.out.print("]");
		}
	}
}
