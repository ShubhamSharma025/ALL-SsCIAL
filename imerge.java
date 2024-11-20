import java.util.ArrayList;

public class imerge {

    public static void merge(int arr[],int low,int high, int mid)
    {
          ArrayList<Integer> temp = new ArrayList<>(); // temporary array
          int left =low;
          int right= mid+1;

          while (left<=mid && right <=high)
          {
            if(arr[left]<=arr[right])
                      {
                        temp.add(arr[left]);
                      left++;
                    }
                    else{
                        temp.add(arr[right]);
                        right++;
                    }

        }

        while(left <= mid)
        {
            temp.add(arr[left]);
            left++;
        }

        while(right <= high)
        {
            temp.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
        arr[i]=temp.get(i-low);
        }
    }

    public static void mergeSort(int arr[],int low,int high)
    {
        if(low>=high)
        return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high,mid);
    }
 
    public static void main(String args[]) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using Merge Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        mergeSort(arr, 0, n-1);
        System.out.println("After Using Merge Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


