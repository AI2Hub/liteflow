package com.yomahub.liteflow.test.fallback.cmp;

import com.yomahub.liteflow.annotation.FallbackCmp;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeBooleanComponent;

@LiteflowComponent("wn2")
@FallbackCmp
public class WhileCmp2 extends NodeBooleanComponent {
    
    @Override
    public boolean processBoolean() throws Exception {
        return false;
    }
}
