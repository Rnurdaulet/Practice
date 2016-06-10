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


