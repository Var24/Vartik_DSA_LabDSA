package bstPairSearch;

import java.util.HashSet;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSTPairSum {
    Node root;

    // Function to insert a new node in the BST
    void insert(int data) {
        root = insertUtil(root, data);
    }

    Node insertUtil(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertUtil(root.left, data);
        } else if (data > root.data) {
            root.right = insertUtil(root.right, data);
        }

        return root;
    }

    // Function to find a pair with the given sum using HashSet
    boolean findPairSum(Node root, int sum) {
        HashSet<Integer> set = new HashSet<>();
        return findPairSumUtil(root, sum, set);
    }

    // Helper function to find a pair with the given sum using HashSet
    boolean findPairSumUtil(Node root, int sum, HashSet<Integer> set) {
        if (root == null) {
            return false;
        }

        if (findPairSumUtil(root.left, sum, set)) {
            return true;
        }

        if (set.contains(sum - root.data)) {
            System.out.println("Pair found: " + (sum - root.data) + " + " + root.data + " = " + sum);
            return true;
        }

        set.add(root.data);

        return findPairSumUtil(root.right, sum, set);
    }

    
}




