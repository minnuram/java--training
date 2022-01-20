import java.util.Arrays;

  public class array{
	public static void main(String[] args) {
	 int arr[] = {10, 334, 45, 90, 9999};
     int max = Arrays.stream(arr).max().getAsInt();
     System.out.println("Largest in given array is " +max);

	}



	}


