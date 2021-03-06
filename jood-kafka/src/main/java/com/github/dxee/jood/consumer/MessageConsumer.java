package com.github.dxee.jood.consumer;

/**
 * Consumer of a kafka record, must not throw any exception if the record has been consumed successfully.
 *
 * @author bing.fan
 * 2018-08-02 14:45
 */
public interface MessageConsumer<T> {
    /**
     * Accept the record, should not throw any exception.
     * @param t
     */
    void accept(T t);
}
