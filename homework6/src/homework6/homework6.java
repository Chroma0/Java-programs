package homework6;
import java.util.Scanner;
public class homework6 {
	public static void main(String args[]) {
		int num=0;
		try (Scanner scanner = new Scanner(System.in)) {
			num=scanner.nextInt();
		}catch(Exception e) {
			e.printStackTrace();
		}
		int[][] array=new int[num][num];
		int direction=0;
		int left=num-1;
		int right=0;
		int top=1;
		int botton=num-1;
		int x=0;
		int y=0;
		for(int i=1;i<=num*num;i++) {
			array[x][y]=i;
			if(direction==0) {
				y++;
				if(y==left) {
					left--;
					direction=1;
				}
			}
			else if(direction==1) {
				x++;
				if(x==botton) {
					botton--;
					direction=2;
				}
			}
			else if(direction==2) {
				y--;
				if(y==right) {
					right++;
					direction=3;
				}
			}
			else if(direction==3) {
				x--;
				if(x==top) {
					top++;
					direction=0;
				}
			}
		}
		System.out.print("[");
		for(int i=0;i<num;i++) {
			System.out.print("[");
			for(int j=0;j<num;j++) {
				System.out.print(array[i][j]);
				if(j<num-1) {
					System.out.print(",");
				}
				else {
					System.out.print("]");
				}
			}
			if(i<num-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
}
