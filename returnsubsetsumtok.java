public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
        return subsetsSumK(input,0,k);

	}
    public static int[][] subsetsSumK(int input[],int n,int k)
    {
        if(n==input.length)
        {
            if(k==0)
            {
               return new int[1][0]; 
            }
        else{
            return new int[0][0];
            }
        }
        int[][] temp1=subsetsSumK(input,n+1,k);
        int[][] temp2=subsetsSumK(input,n+1,k-input[n]);
        int[][] output=new int[temp1.length+temp2.length][];
        int x=0;
        for(int i=0;i<temp1.length;i++)
        {
            output[x++]=temp1[i];
        }
        for(int i=0;i<temp2.length;i++)
        {
          output[x]=new int[temp2[i].length+1];
          output[x][0]=input[n];
            for(int j=0;j<temp2[i].length;j++)
            {
                output[x][j+1]=temp2[i][j];
            }
            x++;
        }
        return output;
        
            
    }
}
