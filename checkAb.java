public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
        return checkAB(input,input.length()-1);

	}
    public static boolean checkAB(String s,int a)
    {
		if(a<=0)
        {
            if(s.charAt(a)=='a')
            return true;
            else
            return false;
        }
        boolean ans=checkAB(s,a-1);
        if(ans==false)
        {
            return false;
        }
        else if(s.charAt(a)=='b')
        {
            if(a+1<s.length())
            {
            if(s.charAt(a+1)=='b')
            {
                if(a+2<s.length())
                {
                    if(s.charAt(a+2)=='a')
                    {
                        return true;
                        
                    }
                    else
                        return false;
                    
                }
            }
            }
        }
        else if(s.charAt(a)=='a')
        {
            if(a+1<s.length())
            {
            if(s.charAt(a+1)=='b')
            {
                if(a+2<s.length())
                {
                    if(s.charAt(a+2)=='b')
                    {
                        return true;
                        
                    }
                    else
                        return false;
                    
                }
                else
                    return false;
            }
                
            }
        }
        
        return ans;
    }
    
}
