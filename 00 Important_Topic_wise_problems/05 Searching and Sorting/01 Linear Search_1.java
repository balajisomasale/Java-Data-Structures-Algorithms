public class Linear_Search_1 {

	
	//Returns the index
	public static int linear_search(int[] arr,int element)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		
		// predefined elements 
		 int[] a1= {10,20,30,50,70,90};    
	        int key = 75;    
	        System.out.println(key+" is found at index: "+linear_search(a1, key));   

	}

}
