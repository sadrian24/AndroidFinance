package com.adrian.androidfinance.core.interfaces;

import java.util.List;

/**
 * Created by Adrian on 2/16/2018.
 */

public interface TreeNode {
    long getId();

    void addChild(TreeNode child);

    void removeChild(TreeNode child);

    List<TreeNode> getChilda();

    TreeNode getChild();

    TreeNode getParent();

    void setParent(TreeNode parent);

}
