package com.example.tree.traversal;

import com.example.tree.util.TreeNode;

import java.util.List;

public class Traversal {
    public static void inOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public static void preOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        list.add(root.val);
        inOrder(root.left, list);
        inOrder(root.right, list);
    }

    public static void postOrder(TreeNode root, List<Integer> list) {
        if(root == null) return;
        inOrder(root.left, list);
        inOrder(root.right, list);
        list.add(root.val);
    }
}
