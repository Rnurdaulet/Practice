/*https://www.hackerearth.com/problem/algorithm/frodo-and-ring/
*The middle earth is in danger as Sauron has prepared an army of Orcs to destroy the men. To kill Sauron and save the world we need to destroy his Ring and it is only possible if the ring is thrown in the lava ( Magma ). Gandalf and Frodo accepted this challenge and decided to save the world at any cost. Gandalf found one map which shows the way to lava. The Map is represented as a matrix which shows the locations of Dragons, Trees and Lava (located at bottom-right corner). Frodo can enter in the matrix only at the cell ( 1 , 1)(top-left corner) and he has to reach the cell ( N , M ).

The matrix has N rows and M columns. It starts with ( 1 , 1). Lava is in ( N , M)th cell. Rest of the cells are occupied either by Trees or Dragons. He can only move right or down from current position.

He starts with zero energy. If he enters in a cell that has Tree (T), he can eat some fruits and gain 150 units energy. But If he enters in Dragon's (D) cell, then he needs 100 units energy to kill Dragon. If he doesn't have the required energy then Dragon will kill Frodo.

Gandalf and Frodo have not studied Algorithm Techniques from Sir Zaveri ( :P ). But they know you studied from him. So help Frodo and Gandalf in destroying the Ring and save the world.*/
package sevennationarmy;

import java.util.Scanner;

public class Frodo{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char a[][] = new char[201][201];
		int energy[][] = new int[201][201];
		
		int t = scan.nextInt();

		    while(t!=0) {
		        int n = scan.nextInt();
		        int m = scan.nextInt();
		        for(int i=1 ; i<=n ; i++) {
		            for(int j=1 ; j<=m ; j++) {
		                a[i][j] = scan.next().charAt(0);
		            }
		        }
		        //if 1st cell dragon
		        if(a[1][1]=='D') {
		        	System.out.println("-1");
		            continue;
		        }
		        //if matrix 1x1
		        if(n==1 && m==1) {
		        	System.out.println("0");
		            continue;
		        }

		        for(int i=0;i<=n;i++) {
		            energy[i][0]=0;
		        }

		        for(int j=0;j<=m;j++) {
		            energy[0][j]=0;
		        }

		        for(int i=1;i<=n;i++) {
		            for(int j=1;j<=m;j++) {
		            	//tree
		                if(a[i][j]=='T') {
		                    if(i==1 && j==1) {
		                    	energy[i][j]=150;
		                    } else {
		                    	energy[i][j]=0;

		                    	if(energy[i-1][j]>=0)
		                    		energy[i][j]=Math.max(energy[i-1][j] + 150 , energy[i][j]);
		                    	if(energy[i][j-1]>=0)
		                    		energy[i][j]=Math.max(energy[i][j-1] + 150 , energy[i][j]);
		                    }
		                }
		                //dragon
		                else if(a[i][j]=='D') {
		                 		energy[i][j]=0;

		                    	if(energy[i-1][j]>=100)
		                    		energy[i][j]=Math.max(energy[i-1][j] - 100 , energy[i][j]);
		                    	if(energy[i][j-1]>=100)
		                    		energy[i][j]=Math.max(energy[i][j-1] - 100 , energy[i][j]);
		                }
		                //lava
		                else {
		                    energy[i][j]=Math.max(energy[i][j-1] , energy[i-1][j]);
		                }
		            }
		        }
		        if(energy[n][m]>=0) {
		            System.out.println(energy[n][m]);
		        } else {
		            System.out.println("-1");
		        }
		        	t--;
		    }
	}

}
