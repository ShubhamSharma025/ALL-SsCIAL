public class SumOfNumbers1  
{  
    public static int secondlargest(int[]a,int total){
    int temp;
    for(int i=0; i<a.length ; i++)
    {
        for(int j =i+1;j< a.length;j++)
        {
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    return a[total-2];

}
 public static void main(String args[]){
    int a[] = {4,9,3,6,7,8};
    System.out.println(secondlargest(a, 6));
 }
}
