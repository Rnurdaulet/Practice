/*
https://www.hackerearth.com/problem/algorithm/monk-in-the-grass-fields/
Our code monk, high on excitement after solving the rest of the problems , goes on a trek in the mountains . 
On his way, he encounters Janemba, the evil magician! Janemba takes our monk to a poison field and plays a game with him described as follows: 
The poison field is described as NxN matrix,divided into N * N cells. Each cell of the field has a value of discomfort in it pertaining to the poison content. Monk has been cursed with K curses. In each curse, the monk must do one of the following: 

1) Choose one row of the field and consume the poisonous fumes from all the cells in that row. The discomfort caused is the sum of discomfort from each cell in the row. After consuming, the discomfort of all cells in the row increases by one. 
2) Choose one column of the field and consume the poisonous fumes from all the cells in that column. The discomfort caused is the sum of discomfort from each cell in the column. After consuming, the discomfort of all cells in the column increases by one. 

Our monk has a level of tolerance. A very high level of discomfort will cause him to die! 
Help him out by finding the Minimum discomfort possible by optimally completing the curses.

*/

package sevennationarmy;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
 
public class Monk {
 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] N = new int[T]; //Matrix indieces
		int[] K = new int[T];; //curses
		int[][][] A = new int[T][][];
		
		
		for(int i=0;i<T;i++){
			String[] str = br.readLine().split(" ");
			N[i] = Integer.parseInt(str[0]);
			K[i] = Integer.parseInt(str[1]);
			A[i] = new int[N[i]+1][N[i]+1];
			int[] rowCount = new int[N[i]];
			int[] columnCount = new int[N[i]];
			for(int j=0;j<N[i];j++){
				String[] rowStr = br.readLine().split(" ");
				for(int k=0;k<N[i];k++){
					 A[i][j][k] = Integer.parseInt(rowStr[k]);
					 rowCount[j] = rowCount[j] + A[i][j][k] ;
					 columnCount[k] = columnCount[k] + A[i][j][k];
				}
			}
			
			
			int discomfortLevel = 0 ;
			Arrays.sort(rowCount);
			Arrays.sort(columnCount);
			for(int k=0;k<K[i];k++){
				
                //choose row or Column
				int minCount = rowCount[0];
				boolean isRow = true;
				
				if(minCount > columnCount[0]){
					minCount = columnCount[0];
					isRow = false;
				}
				
				//set discomfor and increase the values
				discomfortLevel  += minCount;
				if(isRow){
				rowCount[0] += N[i];
				Arrays.sort(rowCount);
			    for(int m=0;m<N[i];m++){
			    	columnCount[m]++;
			    }	
			    }
			    else{
				columnCount[0] += N[i];
				Arrays.sort(columnCount);
			    for(int m=0;m<N[i];m++){
			    	rowCount[m]++;
			    }			   }
			}
			
			    System.out.println(discomfortLevel);
		}		
	}
 
}


