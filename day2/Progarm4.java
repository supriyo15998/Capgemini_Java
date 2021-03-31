package day2;
import java.util.*;
public class Progarm4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		System.out.println("Enter "+ arr1.length +" values for arr1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		sc.close();
		arr2 = getUniqueArrayElements(arr1);
		printArray(arr2);
	}
	private static int[] getUniqueArrayElements(int[] oldArr)
	{
		int[] toReturn = new int[oldArr.length];
		int in = 0;
		for(int i=0;i<oldArr.length;i++)
		{
			boolean flag = false;
			for(int j=0;j<i;j++)
			{
				if(oldArr[i] == oldArr[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				toReturn[in] = oldArr[i];
				in++;
			}
		}
		return toReturn;
	}
	private static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0)
				break;
			System.out.print(arr[i] + " ");
		}
	}

}
