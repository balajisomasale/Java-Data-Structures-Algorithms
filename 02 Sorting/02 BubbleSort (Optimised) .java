//package practice;

public class BubbleSort_Optimised {

	public static void main(String[] args) {
		

		int a[] = {2,1,8,-3,6,4,12};
		
		int n=a.length;
		
		
		for(int i=0;i<n-1;i++)
		{
			// checking for edge case : if array is sorted already then
			boolean sorted=true;
			
			
			// changing "j<n-1" to => "j<n-i-1" : because that last items is sorted everytime
			for(int j=0;j<n-1;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
				
			}
			if(sorted) break;
		}
		
		
		for(int item:a)
		{
			System.out.print(item+" ");
		}
		
		
		
	}
}
