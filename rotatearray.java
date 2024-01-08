public class rotatearray {

public static void main(String args[])
{
    int Array[]={1,2,3,4,5};
    int N =Array.length;
    int k=2;
    rightrotate(Array,N,k);
}
    static void rightrotate(int a[],int n, int k)
    {
        k=k%n;
        for(int i=0;i<n;i++)
        {
            if(i<k)
            {
                System.out.print(a[n+i-k]+"");
            }
            else
            {
                System.out.println(a[i-k]+"");
            }

        } 

    }
}
