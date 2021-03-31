package day2;
import java.util.*;
public class Progarm4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Progarm4 p = new Progarm4();
		int arr1[] = new int[10];
		int arr2[] = new int[10];
		System.out.println("Enter "+ arr1.length +" values for arr1");
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = sc.nextInt();
		}
		
		arr2 = getUniqueArrayElements(arr1);
		System.out.println("Unique elements in the array are:");
		printArray(arr2);
		System.out.println("Enter the element to be searched in the array:");
		int searchKey = sc.nextInt();
		int searchIndex = p.searchElement(arr1, searchKey);
		System.out.println("Value " + searchKey + " found ar index: " + searchIndex);
		int[] minMaxArray = p.getMinMax(arr1);
		System.out.println("Minimum and Maximum Element in the array is:");
		printArray(minMaxArray);
		System.out.println("Enter the value for which the multiples has to be found");
		int multiples = sc.nextInt();
		sc.close();
		int[] multiplesArray = p.getMultiplesOf(arr1, multiples);
		printArray(multiplesArray);
		if(multiplesArray[0] == 0) {
			System.out.println("No Multiples Found");
		}
	}
	// This method accept an array and the element to be searched and return the index value if element found
	// otherwise return -1;
	// as well as return -2 if array is empty
	public int searchElement(int[] arrSearch,int key) {
		if(arrSearch.length == 0) {
			return -2;
		}
		for(int i=0;i<arrSearch.length;i++) {
			if(arrSearch[i] == key)
			{
				return i;
			}
		}
		return -1;
	}

	/*
	 * this method returns an array of size 2, containing min and max number of the
	 * given array, and below method cannot invoke any other method Note:- display
	 * the returned array using printArray() method
	 */
	public int[] getMinMax(int arr[]) {
		int[] toReturn = new int[2];
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		toReturn[0] = min;
		toReturn[1] = max;
		return toReturn;
	}

	/*
	 * this method returns an array which contains the multiples of x, and below
	 * method cannot invoke any other method Note:- display the returned array using
	 * printArray() method
	 */
	public int[] getMultiplesOf(int arr[], int x) {
		int[] toReturn = new int[arr.length];
		int in = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%x == 0)
			{
				toReturn[in] = arr[i];
				in++;
			}
		}
		return toReturn;
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
		System.out.println();
	}

}
