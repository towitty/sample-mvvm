package com.yjkim.mvvmweather.model;

public class NotifyData {
    private String title;
    private String content;
    private String writer;
    private String date;

    public NotifyData(String title, String content, String writer, String date) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public String getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
