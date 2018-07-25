package com.jack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 后序遍历二叉树
 */
public class BackTree {
    /**
     * 后序遍历二叉树的非递归
     * @param root
     * @return
     */
    public List<Integer> backTreeNot(TreeNode root){
        List<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stackTemp = new Stack<>();
        if(root == null){
            return arrayList;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            if(treeNode.left != null){
                stack.add(treeNode.left);
            }
            if(treeNode.right != null){
                stack.add(treeNode.right);
            }
            stackTemp.push(treeNode.val);
        }
        while(!stackTemp.isEmpty()){
            arrayList.add(stackTemp.pop());
        }
        return arrayList;
    }

    /**
     * 后序遍历二叉树的递归解法
     * @param root
     * @return
     */
    List<Integer> arrayList = new ArrayList<>();
    public List<Integer> backTree(TreeNode root){
        if(root == null){
            return arrayList;
        }
        if(root.left != null){
            backTree(root.left);
        }
        if(root.right != null){
            backTree(root.right);
        }
        if(root != null){
            arrayList.add(root.val);
        }
        return arrayList;
    }
}
