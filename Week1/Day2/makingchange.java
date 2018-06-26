import java.util.Arrays;

public class makingchange {
    public static int  count(int[] denom,int amount)
    {
        int[] change=new int[amount+1];
        change[0]=1;
        for(int i=0;i<denom.length;i++)
        {
            for(int j=denom[i];j<change.length;j++)
            {
                change[j]=change[j]+change[j-denom[i]];
            }
        }
        return change[change.length-1];
    }
    public static void main(String[] args) {
        int denom[] = {1,2,3,4,5};
        int amount = 10;
        System.out.println(count(denom,amount));

    }
}