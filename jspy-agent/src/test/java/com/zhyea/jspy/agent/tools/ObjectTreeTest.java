package com.zhyea.jspy.agent.tools;

import com.zhyea.jspy.commons.model.ObjectNode;
import junit.framework.TestCase;

public class ObjectTreeTest extends TestCase {


    public void testDump() throws IllegalAccessException {
        ObjectNode root = ObjectTree.build(new Integer(36));
        ObjectTree.dump(root, 0);
    }


}
