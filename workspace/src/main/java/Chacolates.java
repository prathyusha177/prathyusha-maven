import java.util.*;
public class Chacolates extends Gift1 {
	int no_of_chokies,temp;
	Scanner s=new Scanner(System.in);
	int[] chokies(int chocos,int[] arr){
		//int a[chocos]=new int[];
		no_of_chokies=chocos;
		System.out.println("Enter chocolate weights");
		for(int i=0;i<no_of_chokies;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<no_of_chokies;i++)
		{
			for(int j=i+1;j<no_of_chokies;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}
