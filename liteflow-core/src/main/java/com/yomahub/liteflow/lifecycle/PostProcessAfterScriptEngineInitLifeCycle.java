package com.yomahub.liteflow.lifecycle;

/**
 * 生命周期接口
 * 在初始化Script执行器后执行，如果有实现的话
 *
 * @author Bryan.Zhang
 * @since 2.12.4
 */
public interface PostProcessAfterScriptEngineInitLifeCycle extends LifeCycle{

    void postProcessAfterScriptEngineInit(Object engine);
}
