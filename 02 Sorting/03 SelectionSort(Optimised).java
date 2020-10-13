//package practice;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a[]={3,1,-2,7,4,0};
		int n=a.length;
		
		
		
		// search for the index which have min value among all
		// store index in one variable 
		// swap it with the other value and iterate it
		//print it at last
		
		for(int i=0;i<n;i++)
		{
			//setting i value to minIndex : It will update it after iterations 
		      //minIndex will store the index value which has min value among the elements
			int minIndex=i;    
			
			// here j==i beecause first element is sorted and iteration should be from next element
			// which is i right
			for(int j=i;j<n;j++)    
			{
					if(a[j] < a[minIndex])
					{
						minIndex=j;
					}
			}
					
					//swapping 
					int temp=a[i];
					a[i]=a[minIndex];
					a[minIndex]=temp;
	
		}
		
		//printing 
		for(int item:a)
		{
			System.out.print(item + "  ");
		}
		
		
	}

}
