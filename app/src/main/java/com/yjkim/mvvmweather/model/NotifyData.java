package com.yjkim.mvvmweather.model;

public class NotifyData {
    private String title;
    private String text;
    private String writer;
    private String date;

    public NotifyData(String title, String text, String writer, String date) {
        this.title = title;
        this.text = text;
        this.writer = writer;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
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

    public void setText(String text) {
        this.text = text;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
