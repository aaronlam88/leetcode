package com.example.tree.util;

import java.util.Scanner;

public class Deserialize {
    public static TreeNode deserialize(String treeStr) {
        Scanner scanner = new Scanner(treeStr);
        scanner.useDelimiter(",");
        return deserialize(scanner);
    }

    private static TreeNode deserialize(Scanner scanner) {
        if (!scanner.hasNext())
            return null;
        String data = scanner.next();
        if ("#".equals(data))
            return null;
        TreeNode n = new TreeNode();
        n.val = Integer.valueOf(data);
        n.left = deserialize(scanner);
        n.right = deserialize(scanner);
        return n;
    }

}
