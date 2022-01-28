package SearchSort.program;

public class BinarySearch {

	public static void main(String[] args) {
		 int[] arr = {1,5,6,4,8,9,2,7,3};
	        int key = 6;
	        int arrlength = (arr.length-1); 
	        binarySearch(arr,0,key,arrlength);
	    }

	public static void binarySearch(int[] arr, int start, int key, int length){

	        int midValue = (start+length)/2;       
	        while(start<=length){

	            if(arr[midValue]<key){
	                start = midValue + 1;
	            } else if(arr[midValue]==key){
	                System.out.println("Element is found at index :"+midValue);
	                break;
	            }else {

	                length=midValue-1;
	            }
	            midValue = (start+length)/2;
	        }
	            if(start>length){

	                System.out.println("Element is not found");
	            }    
	}

}
