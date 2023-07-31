package bstPairSearch;

public class DriverClass {
	public static void main(String[] args) {
        BSTPairSum bst = new BSTPairSum();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        bst.insert(50);
        bst.insert(70);

        int targetSum = 130;
        boolean pairFound = bst.findPairSum(bst.root, targetSum);

        if (!pairFound) {
            System.out.println("No pair found with the sum " + targetSum);
        }
    }

}
