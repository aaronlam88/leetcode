package com.example.tree.traversal;

import com.example.tree.util.Deserialize;
import com.example.tree.util.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TraversalTest {
    private static TreeNode tree = Deserialize.deserialize("1,2,#,#,3,4,#,5,6,#");
    @Test
    public void testInOrder() {
        System.out.println("Testing inOrder");
        List<Integer> result = new ArrayList<>();
        Traversal.inOrder(tree, result);
        result.forEach(val -> System.out.print(val + " "));
    }
    @Test
    public void testPostOrder() {
        System.out.println("Testing postOrder");
        List<Integer> result = new ArrayList<>();
        Traversal.postOrder(tree, result);
        result.forEach(val -> System.out.print(val + " "));
    }

    @Test
    public void testPreOrder() {
        System.out.println("Testing preOrder");
        List<Integer> result = new ArrayList<>();
        Traversal.preOrder(tree, result);
        result.forEach(val -> System.out.print(val + " "));
    }
}
