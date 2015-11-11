/*
Reorder an array according to given indexes
Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. 
It is not allowed to given array arr’s length.
*/

class reorderArray

{
public static void reorder(int arr1[],int index1[])
{
for (int i=0 ; i<index1.length; i++)
{
while(index1[i]!=i)
{
//swap index
int old = index1[index1[i]];

index1[index1[i]] = index1[i];

index1[i] = old;

//swap arr
int oldE = arr1[index1[i]];

arr1[index1[i]] = arr1[i];

arr1[i]=oldE;

} //while end

} //for end

//just printing both arrays

System.out.println("Sorted arr array");
for (int k : arr1)
{
System.out.print(k+" ");
}

System.out.println();
System.out.println("Sorted index array");

for(int l: index1)
{
System.out.print(l+" ");
}

System.out.println();

}

public static void main(String[] args)

{

int arr[] = {53,43,33,23,13};

int index[]={1,0,4,3,2};

reorder(arr,index);

}

}