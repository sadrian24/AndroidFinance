package com.adrian.androidfinance.core.abstracts;

import com.adrian.androidfinance.core.interfaces.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian on 2/16/2018.
 */

public abstract class AbstractTreeNode implements TreeNode {
    private long id;
    private String name;

    private List<TreeNode> childs = new ArrayList<>();

    private TreeNode parrent;

    public AbstractTreeNode(long id, String name, List<TreeNode> childs, TreeNode parrent) {
        this.id = id;
        this.name = name;
        this.childs = childs;
        this.parrent = parrent;
    }

    public AbstractTreeNode() {
    }

    public AbstractTreeNode(String name) {
        this.name = name;
    }

    public AbstractTreeNode(List<TreeNode> childs) {
        this.childs = childs;
    }

    public AbstractTreeNode(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void addChild(TreeNode child) {
        child.setParent(this);
        childs.add(child);
    }

    @Override
    public void setParent(TreeNode parent) {
        this.parrent = parent;
    }

    @Override
    public List<TreeNode> getChilds() {
        return childs;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public TreeNode getChild(long id) {
        for (TreeNode child : childs){
            if (child.getId() == id) {
                return child;
            }
        }

        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractTreeNode that = (AbstractTreeNode) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public TreeNode getParent() {
        return parrent;
    }

    @Override
    public void removeChild(TreeNode child) {
        childs.remove(child);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean hasChilds(){
        return !childs.isEmpty();
    }

    @Override
    public String toString() {
        return name;
    }
}
