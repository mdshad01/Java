package Divide;

public class SortRevision {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void printString(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
public static void mergeSort(int arr[], int si, int ei){
    if(si >= ei){
        return;
    }
    int mid = si + (ei-si)/2;
    mergeSort(arr,si,mid);
    mergeSort(arr,mid+1,ei);
    merge(arr,si,mid,ei);
}
public static void merge(int arr[], int si, int mid, int ei){
    int temp[] = new int[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;

    while(i <= mid && j <= ei){
        if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
        } else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    while(i <= mid){
        temp[k++] = arr[i++];
    }
    while(j <= ei){
        temp[k++] = arr[j++];
    }
    for(k=0,i=si;k<temp.length;k++,i++){
        arr[i] = temp[k];
    }
}
public static void quickSort(int arr[], int si, int ei){
    if(si >= ei){
        return;
    }
    int pIdx = partation(arr,si,ei);
    quickSort(arr,si,pIdx-1);// why
    quickSort(arr,pIdx+1,ei);
}
public static int partation(int arr[], int si, int ei){
    int pivot = arr[ei];
    int i = si-1; //e
    for(int j=si;j<ei;j++){
        if(arr[j] < pivot){
            //Swap
            i++;
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp; // e
        }
    }
    i++;
    int temp = pivot;
    arr[ei] = arr[i];
    arr[i] = temp;
    return i;
}
// Time Complexity ->  O(n log n)
public static int rotatedSort(int arr[], int tar, int si, int ei){
    if(si > ei){
        return -1;
    }

    int mid = si + (ei-si)/2;

    if(arr[mid] == tar){
        return mid;
    }

    if(arr[si] <= arr[mid]){
        if(arr[si]<= tar && tar <= arr[mid-1]){
            return rotatedSort(arr,tar,si,mid-1);
        }
        else{
            return rotatedSort(arr,tar,mid+1,ei);
        }
    }
    else{
        if(arr[mid+1] <= tar && tar <= arr[ei]){
            return rotatedSort(arr,tar,mid+1,ei);
        }
        else{
            return rotatedSort(arr,tar,si,mid-1);
        }
    }
}
//Time Compelxity -> O(n)
public static int usingLoop(int arr[], int tar){
    for(int i=0;i<arr.length;i++){
        if(arr[i] == tar){
            return i;
        }
    }
    return -1;
}
public static void mergeSortString(String str[], int si, int ei){
    if(si >= ei){
        return;
    }

    int mid = si + (ei-si)/2;
    mergeSortString(str,si,mid);
    mergeSortString(str,mid+1,ei);
    mergeString(str,si,mid,ei);
}
public static void mergeString(String str[], int si, int mid, int ei){
    String newStr[] = new String[ei-si+1];
    int i = si;
    int j = mid+1;
    int k = 0;
    while(i <= mid && j <= ei){
        if(str[i].compareTo(str[j]) <= 0){   
            newStr[k] = str[i];
            i++;
        }
        else{
            newStr[k] = str[j];
            j++;
        }
        k++;
    }
    while(i <= mid){
        newStr[k++] = str[i++];
    }
    while(j <= ei){
        newStr[k++] = str[j++];
    }

    for(k=0,i=si;k<newStr.length;i++,k++){
        str[i] = newStr[k];
    }
}
public static int rotatedsort(int arr[], int tar, int si, int ei){
    if(si > ei){
        return -1;
    }
    int mid = si + (ei-si)/2;
    if(arr[mid] == tar){
        return mid;
    }
    if(arr[si] < arr[mid]){
        if(arr[si] <= tar && tar <= arr[mid]){
            return rotatedsort(arr,tar,si,mid-1);
        } else{
            return rotatedsort(arr,tar,mid+1,ei);
        }
    } else{
        if(arr[mid] <= tar && tar <= ei){
            return rotatedsort(arr,tar,mid+1,ei);
        } else{
            return rotatedsort(arr,tar,si,mid-1);
        }
    }
} 
//Time Complexity O(n^2)
public static int majorityElement(int arr[]){
    int majorityCount = arr.length/2;
    for(int i=0;i<arr.length;i++){
        int count = 0;
        for(int j=0;j<arr.length;j++){
            if(arr[j] == arr[i]){
                count++;
            }
        }

        if(count > majorityCount){
            return arr[i];
        }
    }
    return -1;
}
//public static 
    public static void main(String[] args) {
        //int arr[] = { 6, 3, 9, 5, 2, 8};
        // int arr[] = { 8, 9, 0, 1, 2, 3, 4, 5, 6, 7};
       // String str[] = {"sun", "earth", "mars", "mercury"};
        int arr[] = {1, 2, 1, 2, 4, 5, 2, 2, 2};
        //int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(majorityElement(arr));
    }
}
