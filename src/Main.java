public class Main {

    private static void print(int[] arr) {
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] test1 = {3,6,4,-2,23,1,64,-33,4,800,32,-2000,0,0,432,5,5893,7};
        int[] test2 = {3,6,4,-2,23,1,64,-33,6,78,7965,-22,-346,54,57836,33,24,800,32,-2000,0,0,432,5,5893,7};

        int[] test3 = new int[100000];
        for (int i = 0; i < test3.length; i++) {
            test3[i] = (int) (Math.random() * 20000);
        }

        int[] test4 = new int[24653];
        for (int i = 0; i < test4.length; i++) {
            test4[i] = (int) (Math.random() * 100000);
        }

        SortAlg.insertionSort(test1);
        print(test1);

        System.out.println();

        SortAlg.bubbleSort(test2);
        print(test2);

        System.out.println();

        SortAlg.selectionSort(test3);
        print(test3);

        System.out.println();

        SortAlg.insertionSort(test4);
        print(test4);
    }
}