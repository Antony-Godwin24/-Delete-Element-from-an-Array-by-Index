import java.util.*;
class delelemovanotharray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size 1:");
		int s1=sc.nextInt();
		int a[]=new int[s1];
		int b[]=new int[s1-1];
		System.out.println("Enter the array elements:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index to delete:");
		int index=sc.nextInt();
		for(int i=0;i<a.length-1;i++){
			if(i<index){
				b[i]=a[i];
			}
			else{
				b[i]=a[i+1];
			}
		}
		System.out.println("The elements are...:");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		}
	}