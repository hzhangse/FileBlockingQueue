package com.train.profiler.queue;

/**
 * 消息包装类，从文件中读到内容后，封装成MessageWrapper对象，丢到blockingQueue
 * @author ryan.
 */
public class MessageWrapper {
    private final byte[] content;
    private final boolean firstMessage;
    private final int endPos;
    private final String currentFile;
    private  String message;

    public MessageWrapper(byte[] content, boolean firstMessage, int endPos, String currentFile) {
        this.content = content;
        this.firstMessage = firstMessage;
        this.endPos = endPos;
        this.currentFile = currentFile;
    }

    public byte[] getContent() {
        return content;
    }

    public boolean isFirstMessage() {
        return firstMessage;
    }

    public int getEndPos() {
        return endPos;
    }

    public String getCurrentFile() {
        return currentFile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
