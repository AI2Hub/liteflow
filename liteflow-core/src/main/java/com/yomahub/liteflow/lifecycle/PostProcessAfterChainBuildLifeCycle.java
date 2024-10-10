package com.yomahub.liteflow.lifecycle;

import com.yomahub.liteflow.flow.element.Chain;

/**
 * 生命周期接口
 * 在Chain构造后执行，如果有实现的话
 *
 * @author Bryan.Zhang
 * @since 2.12.4
 */
public interface PostProcessAfterChainBuildLifeCycle extends LifeCycle {

    void postProcessAfterChainBuild(Chain chain);
}
