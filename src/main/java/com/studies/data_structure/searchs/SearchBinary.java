package com.studies.data_structure.searchs;

public class SearchBinary {

    public static void main(String[] args) {

        int[] nums = new int[100000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = i * 2;
        }

        int num = searchNum(nums, nums[1000]);

        System.out.println(num);

    }

    public static int searchNum(int[] arr, int num) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int middleIndex;
        int count = 0;

        while (firstIndex <= lastIndex) {
            middleIndex = (int) ((firstIndex + lastIndex) / 2);
            count++;

            if (arr[middleIndex] == num) {
                System.out.println("Testes: " + count);
                System.out.println("Posição: " + middleIndex);
                return arr[middleIndex];
            } else if (arr[middleIndex] < num) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }
        System.out.println("Testes: " + count);
        throw new RuntimeException("Not found element with search binary");
    }

}
