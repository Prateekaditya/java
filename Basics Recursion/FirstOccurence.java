public class FirstOccurence {
    public static int fO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return fO(arr,key,i+1);
    }
    public static int lO(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lO(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={5,6,1,4,2,4};
        int key=4;
        System.out.println(lO(arr,key,0));
    }
}
