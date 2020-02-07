import java.util.*;
public class Gift {
	private static Scanner obj;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n;
			obj=new Scanner(System.in);
			System.out.println("Enter number of childrens");
			n=obj.nextInt();
			Gift1 g=new Gift1();
			Chacolates ch=new Chacolates();
			Sweet se=new Sweet();
			int b[]=new int[n];
			int a[]=new int[n];
			int gweig[]=new int[n];
			int cweigh[]=new int[n];
			gweig=g.gifts(n,b);
			cweigh=ch.chokies(n,a);
			int cand[]=new int[n];
			cand=se.calSweets(gweig,cweigh,n);
			System.out.println("Gift No.	Chocolates	Sweets	Total Weight");
			for(int i=0;i<n;i++)
			{
				if(cand[i]<=0)
				{
					System.out.print(i+1 +"		"+cweigh[i]+"		"+"0"+"		"+gweig[i]+"\n");
					continue;
				}
				System.out.print(i+1+"		"+cweigh[i]+"		"+cand[i]+"		"+gweig[i]+"\n");
			}
		}
}
