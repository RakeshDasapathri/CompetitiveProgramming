public class temperature_tracker {
    Integer size,sum,max,min,mode;
    int[] fahrenheit=new int[111];
    public temperature_tracker()
    {
        size=0;
        sum=0;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        mode=0;


    }
    public void insert(Integer temp)
    {
        if(temp>=0)
        {
            sum=sum+temp;
            if(max<temp)
            {
                max=temp;
            }
            if(min>temp)
            {
                min=temp;
            }
            fahrenheit[temp]++;
            if(fahrenheit[temp]>fahrenheit[mode])
            {
                mode=temp;
            }
            size++;
        }
    }
    public Integer get_min()
    {
        if(size>0)
            return min;
        else
            return null;
    }
    public Integer get_max()
    {
        if(size>0)
            return max;
        else
            return null;
    }
    public Integer get_mode()
    {
        if(size>0)
            return fahrenheit[mode];
        else
            return null;
    }
    public Double get_mean()
    {
        if(size>0)
        {
            return Double.parseDouble(sum/size+"");
        }
        else
            return 0.0;
    }
    public static void main(String[] args) {
        temperature_tracker t=new temperature_tracker();
        t.insert(80);
        t.insert(17);
        t.insert(15);
        t.insert(12);
        t.insert(17);

        System.out.println(t.get_max(),t.get_min(),t.get_mode(),t.get_mean());
    }
}