package gaba.testDB;

public class Cube {
public static void main(String[] args) {
int row=5;
int column=5;
int[][] pole=new int[row][column];
for(int i=0; i<=row-1; i++) {
 for(int j=0; j<=column-1; j++) {
if((i==pole.length-1)||((i>=1)&&(j==0))||((i>=1)&&(j==pole.length-1)||((i==0)&&(j>=0)))) {
	   pole[i][j]=1; 
 }
System.out.print(pole[i][j]);
}
System.out.println();
}
}
}
