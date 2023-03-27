public class LargestSmallest
{
    public static void main(String args[])
    {
        int arr[] = new int[]{55,32,45,98,82,11,9,39,50};
        int smallest = arr[0];
  int large = arr[0];

  for (int i = 1; i < arr.length; i++) {
   if (arr[i] > large)
    large= arr[i];
   else if (arr[i] < smallest)
    smallest = arr[i];
  }

  System.out.println("Largest Number is : " + large);
  System.out.println("Smallest Number is : " + smallest);


    }
    
}
