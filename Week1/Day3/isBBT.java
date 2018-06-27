import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }
    }
    class Height
    {
        int height = 0;
    }
    public boolean isBalanced(BinaryTreeNode root,Height h) {
        if(root==null)
        {
            h.height=0;
            return true;
        }
        Height lh=new Height();
        Height rh=new Height();

        boolean LST=isBalanced(root.left,lh);
        boolean RST=isBalanced(root.right,rh);

        h.height=(lh.height>rh.height?lh.height:rh.height)+1;

        if((lh.height-rh.height>=2)||(rh.height-lh.height>=2))
        {
            if((lh.height!=0)&&(rh.height!=0))
                return false;
        }
        return LST & RST;
    }


















    // tests

    @Test
    public void fullTreeTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(5);
        final BinaryTreeNode a = root.insertLeft(8);
        final BinaryTreeNode b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        final boolean result = isBalanced(root,height);
        assertTrue(result);
    }

    @Test
    public void bothLeavesAtTheSameDepthTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(3);
        root.insertLeft(4).insertLeft(1);
        root.insertRight(2).insertRight(9);
        final boolean result = isBalanced(root,height);
        assertTrue(result);
    }

    @Test
    public void leafHeightsDifferByOneTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(6);
        root.insertLeft(1);
        root.insertRight(0).insertRight(7);
        final boolean result = isBalanced(root,height);
        assertTrue(result);
    }

    @Test
    public void leafHeightsDifferByTwoTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(6);
        root.insertLeft(1);
        root.insertRight(0).insertRight(7).insertRight(8);
        final boolean result = isBalanced(root,height);
        assertFalse(result);
    }

    @Test
    public void bothSubTreesSuperbalancedTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(1);
        root.insertLeft(5);
        final BinaryTreeNode b = root.insertRight(9);
        b.insertLeft(8).insertLeft(7);
        b.insertRight(5);
        final boolean result = isBalanced(root,height);
        assertFalse(result);
    }

    @Test
    public void onlyOneNodeTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(1);
        final boolean result = isBalanced(root,height);
        assertTrue(result);
    }

    @Test
    public void treeIsLinkedListTest() {
        Height height = new Height();
        final BinaryTreeNode root = new BinaryTreeNode(1);
        root.insertRight(2).insertRight(3).insertRight(4);
        final boolean result = isBalanced(root,height);
        assertTrue(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}