package array.company;


public class infinite_binary
{
    public static void main(String[] args)
    {
        int arr[]={1,2,4,5,6,7,8,9,12,44,65,78,90};
        int tgt=3;
        int start=0,end=1;
        while (tgt>arr[end])
        {
            int tend=end+1;
            end=end+(end-start+1)*2;
            start=tend;
        }
        System.out.println(bs(arr,start,end,tgt));
    }
    public static int bs(int arr[],int s,int e,int tgt)
    {
        int mid=((s+e)/2);
        while (s<=e)
        {
            mid=(s+e)/2;
            if(e==arr[mid])
                return mid;
            else if(e<arr[mid])
            {
                e=mid-1;
                s=s;
            }
            else
            {
                s=mid+1;
                e=e;
            }
        }
        return -1;
    }
}


