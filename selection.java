public class selection {

    static void selectionsort(int arr[],int n){
       
        for(int i=0;i<n-1;i++){
            int mini=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[mini])
                {
                    mini=j;
                }
            }
        

        int temp = arr[mini];
        arr[mini] = arr[i];
        arr[i] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        
        }
      }
      
      public static void main(String args[]) {

        int arr[] = {13, 146, 224, 552, 220, 49};
        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionsort(arr, n);
    }
} 
