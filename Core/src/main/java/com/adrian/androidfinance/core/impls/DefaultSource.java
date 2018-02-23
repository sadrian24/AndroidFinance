package com.adrian.androidfinance.core.impls;


import com.adrian.androidfinance.core.abstracts.AbstractTreeNode;
import com.adrian.androidfinance.core.interfaces.Source;
import com.adrian.androidfinance.core.interfaces.TreeNode;
import com.adrian.androidfinance.core.objects.OperationType;

import java.util.List;

public class DefaultSource extends AbstractTreeNode implements Source {
    private OperationType operationType;

    public DefaultSource(long id, String name, List<TreeNode> childs, TreeNode parrent) {
        super(id, name, childs, parrent);
    }

    public DefaultSource() {
    }

    public DefaultSource(String name) {
        super(name);
    }

    public DefaultSource(List<TreeNode> childs) {
        super(childs);
    }

    public DefaultSource(long id, String name) {
        super(id, name);
    }

    public DefaultSource(long id, String name, OperationType operationType) {
        super(id, name);
        this.operationType = operationType;
    }

    @Override
    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    @Override
    public void addChild(TreeNode child) {

        //TODO de folosit patern
        if (child instanceof DefaultSource){
            ((DefaultSource) child).setOperationType(operationType);
        }
        super.addChild(child);
    }
}
