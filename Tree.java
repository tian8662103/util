package com.changgou.util;

import java.util.List;
import java.util.Objects;

public class Tree<T> {




    private T T;

    public T getT() {
        return T;
    }

    public void setT(T t) {
        T = t;
    }

    private List<Tree> treeList;


    public List<Tree> getTreeList() {
        return treeList;
    }

    public void setTreeList(List<Tree> treeList) {
        this.treeList = treeList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tree{");
        sb.append("category=").append(T);
        sb.append(", treeList=").append(treeList);
        sb.append('}');
        return sb.toString();
    }
}
