public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
        return subsets(input,0);

	}
    public static int[][] subsets(int input[],int index) 
    {
		 if(index>=input.length)
         {
            int[][] myAns = new int[1][0];
            return myAns;
         }
        int[][] smallAns = subsets(input,index+1);
        int[][] ans = new int[2*smallAns.length][];
        int k =0;
        int len = smallAns.length;
        for(int i=0;i<len;i++){
            ans[k] = new int[smallAns[i].length];
            for(int j=0;j<smallAns[i].length;j++){
                ans[k][j] = smallAns[i][j];
            }
            k++;
        }
        for(int i=0;i<len;i++){
            ans[k] = new int[smallAns[i].length+1];
            ans[k][0] = input[index];
            for(int j=1;j<=smallAns[i].length;j++){
                ans[k][j] = smallAns[i][j-1];
            }
            k++;
        }
        return ans;

	}
}
