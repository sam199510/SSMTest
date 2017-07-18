package com.ssm.model;

public class Collection {
    private Integer id;

    private Integer collectorid;

    private Integer bookid;

    private String bookname;

    private Float bookprice;

    private String bookcover;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollectorid() {
        return collectorid;
    }

    public void setCollectorid(Integer collectorid) {
        this.collectorid = collectorid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public Float getBookprice() {
        return bookprice;
    }

    public void setBookprice(Float bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookcover() {
        return bookcover;
    }

    public void setBookcover(String bookcover) {
        this.bookcover = bookcover == null ? null : bookcover.trim();
    }
}