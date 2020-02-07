//import java.util.*;
public class Sweet extends Gift1 {
	int sweetweightt;
	public int setSweetWeight(int sweetweight){
		this.sweetweightt=sweetweight;
		return 1;
	}
	public int getSweetweight(){
		return sweetweightt;
	}
	public int[] calSweets(int[] ng,int[] nc,int size)
	{
		int candies[]=new int[size];
		for (int i=0;i<size;i++)
		{
			candies[i]=ng[i]-nc[i];
		}
		return candies;
	}
}
