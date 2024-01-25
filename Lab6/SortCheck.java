public class SortCheck {
    public static void main(String[] args) {
        String[] nums = { "99", "-10", "100123", "18", "-978", "5623", "463", "-9", "287", "49" };
        int a, b;
        int size;
        int c = 0;
        size = 10; // number of elements to sort
        System.out.println();
        // This is the Bubble sort.
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1].length() > nums[b].length()) { // if out of order
                    c = 1;
                    break;
                }
            }
        // display sorted array
        if (c == 0) {System.out.println("Sorted");}
        else{System.out.println("Not sorted");}
    }
}
