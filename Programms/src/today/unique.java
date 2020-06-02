package today;

public class unique {
	public static void main(String[] s1) {
		int[] a1 = { 4, 5, 4, 8, 2, 5 };

		for (int i = 0; i <= a1.length - 1; i++) {
			boolean unique = false;
			for (int j = i + 1; j <= a1.length - 1; j++) 
			{

				if (a1[i] == a1[j])
				{
					unique = true;
					break;

				}
			}
			if (!unique) {
				System.out.println(a1[i] + " ");
			}
		}
	}

}
