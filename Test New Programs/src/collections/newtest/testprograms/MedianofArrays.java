package collections.newtest.testprograms;

public class MedianofArrays {
	public static double logic(int[] A, int[] B) {
		double sum =0;
		for(int i=0;i<A.length;i++) {
			sum = sum + A[i];
		}
		for(int i=0;i<B.length;i++) {
			sum = sum + B[i];
		}
		double median = sum/(double)(A.length+B.length);
		  return median;
		  //your code
		  }

		  public static boolean pass()
		  {
		  boolean result = true;
		  result = result && logic(new int[]{1, 3}, new int[]{2, 4}) == 2.5;
		  return result;
		  };

		  public static void main(String[] args)
		  {
		  if(pass())
		  {
		    System.out.println("pass");
		  }
		  else
		  {
		    System.out.println("some failures");
		  }
		  }

}
