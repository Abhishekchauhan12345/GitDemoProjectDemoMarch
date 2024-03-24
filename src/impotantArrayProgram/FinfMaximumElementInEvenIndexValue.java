package impotantArrayProgram;

public class FinfMaximumElementInEvenIndexValue {

	

	    public static void main(String[] args) {
	        int[] a = {1, 7, 3, 12, 5, 9, 8, 4, 10, 6};

	        int max = a[0];  // Initialize max with the first element

	        System.out.println("Array elements at even indices:");

	        for (int i = 0; i < a.length; i += 2) {
	            System.out.print(a[i] + " ");

	            // Compare the current element with max inside the loop
	            if (a[i] > max) {
	                max = a[i];
	            }
	        }

	        System.out.println("\nMaximum element in even indices: " + max);
	    }
	}



