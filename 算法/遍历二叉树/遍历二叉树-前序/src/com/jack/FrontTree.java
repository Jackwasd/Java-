package com.jack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 */
public class FrontTree {
    /**
     * 前序遍历的非递归解法
     * @param root
     * @return
     */
    public List<Integer> frontTreeNot(TreeNode root){
        List<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return arrayList;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            if(treeNode.right != null){
                stack.push(treeNode.right);
            }
            if(treeNode.left != null){
                stack.push(treeNode.left);
            }
            arrayList.add(treeNode.val);
        }
        return arrayList;
    }

    /**
     * 二叉树前序遍历的递归解法
     * @param root
     * @return
     */
    List<Integer> arrayList = new ArrayList<>();
    public List<Integer> frontTree(TreeNode root){
        if(root == null){
            return arrayList;
        }
        arrayList.add(root.val);
        if(root.left != null){
            frontTree(root.left);
        }
        if(root.right != null){
            frontTree(root.right);
        }
        return arrayList;
    }
}
