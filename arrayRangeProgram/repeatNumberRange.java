package arrayRangeProgram;

public class repeatNumberRange {

	public static void main(String[] args) {

		String numbers = "1,1,2,2,3,4,2,2,2,2,2,2,7,8,9,1";
		numbers = numbers.replace(",", "");
		int[] num = new int[numbers.length()];

		for (int i = 0; i < numbers.length(); i++) {
			num[i] = numbers.charAt(i) - '0';
		}

		int start = 0;
		int end = 0;
		int diff = 0, currentdiff = 0;

		start = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					diff = (j - i) + 1;
					if (diff > currentdiff) {
						currentdiff = diff;
						start =i;
						end = j;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(start + "," + end);


	}

}
