package dev.alex.leetcode;

import dev.alex.leetcode.entity.TreeNode;
import org.junit.Before;
import org.junit.Test;

public class _449Test {
    private _449 instance;

    @Before
    public void setup() {
        instance = new _449();
    }

    @Test
    public void serialize() {
        TreeNode root = new TreeNode(4);
        TreeNode firstChildOfRoot = new TreeNode(2);
        TreeNode secondChildOfRoot = new TreeNode(6);
        root.left = firstChildOfRoot;
        root.right = secondChildOfRoot;

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        String str = instance.serialize(root);
        System.out.println(str);
    }

    @Test
    public void deserialize () {
        String data = "4,2,6,-1,-1,5,7,-1,-1,-1,-1";
        TreeNode root = instance.deserialize(data);

        String str = instance.serialize(root);
        System.out.println("反序列化 => " + str);
    }
}