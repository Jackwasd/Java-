package com.jack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树的层序遍历
 */
public class FloorTree {
    /**
     * 层序遍历二叉树非递归
     * @param root
     * @return
     */
    public List<List<Integer>> floorTreeNot(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> arrayList = new ArrayList<>();
            int length = queue.size();
            for(int i = 0; i < length; i++){
                TreeNode treeNode = queue.remove();
                arrayList.add(treeNode.val);
                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }
            list.add(arrayList);
        }
        return list;
    }

    /**
     * 二叉树的层序遍历递归
     * @param root
     * @return
     */
    public List<List<Integer>> floorTree(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        level(list, root, 1);
        return list;
    }
    private void level(List<List<Integer>> list, TreeNode root, int num){
        if(root == null){
            return;
        }
        List<Integer> arrayList = new ArrayList<>();
        if(num > list.size()){
            list.add(arrayList);
        }
        list.get(num-1).add(root.val);
        level(list, root.left, num+1);
        level(list, root.right, num+1);
    }
}
