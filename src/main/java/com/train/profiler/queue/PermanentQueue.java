package com.train.profiler.queue;

import com.train.profiler.exception.QueueException;

/**
 * @author ryan.
 */
public class PermanentQueue {

    private static QueueFactory queueFactory = QueueFactory.getInstance();

    /**
     * write string data to queue
     * @param queueCategory 队列名称
     * @param data 数据
     * @throws QueueException
     */
    public static void offer(String queueCategory, String data) throws QueueException {
        queueFactory.getQueue(queueCategory).offer(data);
    }

    /**
     * write byte array data to queue
     * @param queueCategory 队列名称
     * @param data 数据
     * @throws QueueException
     */
    public static void offer(String queueCategory, byte[] data) throws QueueException {
        queueFactory.getQueue(queueCategory).offer(data);
    }
    /**
     * pop byte array data from queue
     * @param queueCategory 队列名称
     * @throws QueueException
     */
    public static byte[] popData(String queueCategory) throws QueueException {
        return queueFactory.getQueue(queueCategory).popData();
    }
    
    /**
     * pop String  array data from queue
     * @param queueCategory 队列名称
     * @throws QueueException
     */
    public static String pop(String queueCategory) throws QueueException {
        return queueFactory.getQueue(queueCategory).pop();
    }

    /**
     * take string type data from queue
     * @param queueCategory 队列名称
     * @throws QueueException
     */
    public static String take(String queueCategory) throws QueueException {
        return queueFactory.getQueue(queueCategory).take();
    }

    /**
     * take data from queue
     * @param queueCategory 队列名称
     * @throws QueueException
     */
    public static byte[] takeData(String queueCategory) throws QueueException {
        return queueFactory.getQueue(queueCategory).takeData();
    }
}
