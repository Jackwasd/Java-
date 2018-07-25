package com.jack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历二叉树
 */
public class MidTree {
    /**
     * 中序遍历二叉树非递归
     * @param root
     * @return
     */
    public List<Integer> midTreeNot(TreeNode root){
        List<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return arrayList;
        }
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            TreeNode treeNode = stack.pop();
            arrayList.add(treeNode.val);
            root = treeNode.right;
        }
        return arrayList;
    }

    /**
     * 中序遍历二叉树递归
     * @param root
     * @return
     */
    List<Integer> arrayList = new ArrayList<>();
    public List<Integer> midTree(TreeNode root){
        if(root == null){
            return arrayList;
        }
        if(root.left != null){
            midTree(root.left);
        }
        if(root != null){
            arrayList.add(root.val);
        }
        if(root.right != null){
            midTree(root.right);
        }
        return arrayList;
    }
}
