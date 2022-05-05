import java.util.Scanner;

class Sorting{
	static void inserttosort(int a1[]){
	int n = a1.length;
	int elementtoinsert =a1[n-1];
	for(int i = n-2; i>=0;i--){
		if(a1[i]>elementtoinsert)
		{
			a1[i+1]=a1[i];
            PrintArray(a1);
		}
        else
		{
		   a1[i+1] =elementtoinsert;
           PrintArray(a1);		
		   break;
		}
        if((i==0)&&(a1[i]>elementtoinsert))
		{
		    a1[i] = elementtoinsert;
            PrintArray(a1);			
		}			
	}
	}

static void PrintArray(int []a1)
	{
		for(int n: a1)
		{
			System.out.print(n +" ");
		}
	   System.out.println(" ");
	}
		
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int a1[] = new int [n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			a1[i]=sc.nextInt();
		}
		inserttosort(a1);
		
	}
	
	
}