package com.adrian.androidfinance.core.interfaces;

import java.util.List;

/**
 * Created by Adrian on 2/16/2018.
 */

public interface TreeNode {
    String getName();

    long getId();

    void addChild(TreeNode child);

    void removeChild(TreeNode child);

    List<TreeNode> getChilds();

    TreeNode getChild(long id);

    TreeNode getParent();

    void setParent(TreeNode parent);

}
