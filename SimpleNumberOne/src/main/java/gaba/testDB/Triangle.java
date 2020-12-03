package gaba.testDB;

public class Triangle {
public static void main(String[] args) {
int row=5;
int column=10;
int[][] pole=new int[row][column];
for(int i=0; i<=row-1; i++) {
	for(int j=0; j<=column/2 ; j++) {
pole[i][j]=1;
	}
}
for(int i=0; i<=row-1; i++) {
	for(int j=0; j<=column-1; j++) {
		System.out.print(pole[i][j]);
}
	System.out.println();
}
}
}

