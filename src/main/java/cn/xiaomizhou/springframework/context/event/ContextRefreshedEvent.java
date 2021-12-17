package cn.xiaomizhou.springframework.context.event;

import cn.xiaomizhou.springframework.context.ApplicationEvent;

/**
 * @author Yaxi Zhang
 * @date 2021/12/17
 */
public class ContextRefreshedEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ContextRefreshedEvent(Object source) {
        super(source);
    }
}
