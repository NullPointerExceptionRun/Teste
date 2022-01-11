package main;

public class Sequence {

	public static void main(String[] args) {

        int[] firstArray = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] secondArray = {1, 8, 22, 10};

        System.out.println(isSubsequent(firstArray, secondArray));
    }

    private static boolean isSubsequent(int[] firstArray, int[] secondArray) {
        int index = 0;
        boolean answer= false;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[index]) {
                index++;
                if (index == secondArray.length) {
                    answer= true;
                }
            }
        }
        return answer;
    }
}