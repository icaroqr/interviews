package com.interviews.fourSys;

public class BinarySearchTree {

    public static void main(String[] args){
        int val = 6;
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;

        System.out.println(search(node1, val).val);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val) { this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode search(TreeNode root, int value){
        while(root != null){
            if(value > root.val){
                root = root.right;
            }else if( value < root.val){
                root = root.left;
            }else{
                return root;
            }
        }
        return root;
    }
}