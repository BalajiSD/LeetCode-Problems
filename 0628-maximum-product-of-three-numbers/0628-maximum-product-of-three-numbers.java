class Solution {
    public int maximumProduct(int[] nums) {
        int lenOfArr=nums.length-1;
        quickSort(nums,0,lenOfArr);
        int value=nums[lenOfArr]*nums[lenOfArr-1]*nums[lenOfArr-2];
        if(nums[0]<0 && nums[1]<0 && value<(nums[0]*nums[1]*nums[lenOfArr])){
            return (nums[0]*nums[1]*nums[lenOfArr]);
        }
        else{
            return value;
        }        
    }

    public void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quickSort(arr,low,pivot-1);
            quickSort(arr,pivot+1,high);
        }
    }

    public int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}