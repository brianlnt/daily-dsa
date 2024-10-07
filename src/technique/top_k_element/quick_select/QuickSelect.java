package technique.top_k_element.quick_select;

public class QuickSelect {
    public static int partition(int[] a, int pivotIndex, int endIndex){

        int swapIndex = pivotIndex;
        for(int i = pivotIndex + 1; i < endIndex + 1; i++){
            if(a[i] < a[pivotIndex]){
                swapIndex++;
                swap(a, swapIndex, i);
            }
        }
        swap(a, pivotIndex, swapIndex);

        return swapIndex;
    }

    public static void swap(int[] a, int index1, int index2){
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static int quickSelectHelper(int[] a, int left, int right, int k){
        int pivot = partition(a, left, right);

        if(pivot == k - 1){
            return a[pivot];
        } else if (pivot > k - 1){
            return quickSelectHelper(a, left, pivot - 1, k);
        } else {
            return quickSelectHelper(a, pivot + 1, right, k);
        }
    }

    public static int quickSelect(int[] a, int k){
        return quickSelectHelper(a, 0, a.length - 1, k);
    }

    public static void main(String[] args) {
        int[] a = {5,8,1,4,9,10,6};
        System.out.println(quickSelect(a, 3)); //1,4,5,6,8,9,10 => output: 5
    }
}
