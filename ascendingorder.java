
public class ascendingorder {
	public static void main(String args[]) {
		int temp=0;
		System.out.println("Elements of array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("elemnts after scending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
			
		}
	}

}
