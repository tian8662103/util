package com.changgou.util;

import com.changgou.goods.pojo.Category;



import java.util.ArrayList;
import java.util.List;

public class TreeUtil {

    public  static List<Tree> getTree(List<Category> categoryList) {
        List<Tree> treeList = new ArrayList<>();
        for (Category category : categoryList) {
            Tree tree = new Tree();
            //判断是不是顶级节点
            if (category.getParentId().equals(0)) {
                //获取子类节点
                List<Tree> TreeList = getZiLei(category.getId(), categoryList);
                tree.setT(category);
                tree.setTreeList(TreeList);
                treeList.add(tree);
            }
        }
        return treeList;
    }

    private static List<Tree> getZiLei(Integer id,List<Category> categoryList) {
        List<Tree> trees = new ArrayList<>();
        for (Category category : categoryList) {
            Tree tree = new Tree();
            if (category.getParentId().equals(id)) {
                //查找子节点的子节点
                List<Tree> ziLei = getZiLei(category.getId(), categoryList);
                tree.setT(category);
                tree.setTreeList(ziLei);
                trees.add(tree);
            }
        }
        return trees;
    }
}
