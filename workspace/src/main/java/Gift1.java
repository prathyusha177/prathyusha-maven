import java.util.*;
public class Gift1 {
	Scanner gif=new Scanner(System.in);
	int weight,temp;
	int[] gifts(int num,int[] G){
		int no_of_gifts=num;
		System.out.println("Enter weights of the gifts");
		for(int i=0;i<no_of_gifts;i++)
		{
			G[i]=gif.nextInt();
		}
		for(int i=0;i<no_of_gifts;i++)
		{
			for(int j=i+1;j<no_of_gifts;j++)
			{
				if(G[i]<G[j])
				{
					temp=G[i];
					G[i]=G[j];
					G[j]=temp;
				}
			}
		}
		return G;
	}
	static void print(int [] arr,int n){
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
