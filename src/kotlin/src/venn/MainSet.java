package venn;

public class MainSet {


    public static void main(String[] args) {
        final Set A = new Set(new Integer[] {0, 3, 6, 7, 9 });
        final Set B = new Set(new Integer[] {0, 1, 2, 4, 5, 6, 7, 9});
        final Set AnB = A.intersection(B);

        System.out.println("A ∪ B : " + AnB);
    }
}
