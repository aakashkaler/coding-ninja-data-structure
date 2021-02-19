public class solution {
	public static void printSubsets(int input[])
    {
		// Write your code here
        int [][]output=new int[1][0];

        
        printSubsets(input,input.length-1,output);

	}
    public static void printSubsets(int input[],int n,int [][]output)
    {
        if(n<0)
        {
            for(int i=0;i<output.length;i++)
        {
           for(int j=0;j<output[i].length;j++)
            {
                System.out.print(output[i][j]+" ");
            }
                System.out.println();
        }
            return ;
        }
               int ans[][]=new int[2*output.length][];
        
        int x=0;
        int len=output.length;
        for(int i=0;i<len;i++)
        {
            ans[x]=new int[output[i].length];
            for(int j=0;j<output[i].length;j++)
            {
                
                ans[x][j]=output[i][j];
            }
            x++;
        }
                 
        for(int i=0;i<len;i++)
        {
            ans[x]=new int[output[i].length+1];
            ans[x][0]=input[n];
            
            for(int j=1;j<=output[i].length;j++)
            {
                ans[x][j]=output[i][j-1];
            }
            x++;
        }
        
        printSubsets(input,n-1,ans);
        
        
	  
	}
}
