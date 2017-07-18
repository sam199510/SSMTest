package com.ssm.model;

import java.util.Date;

public class Indent {
    private Integer id;

    private Integer buyerid;

    private Integer bookid;

    private Date bargaintime;

    private String buyeraddress;

    private String bookname;

    private String bookcover;

    private Float bookprice;

    private String bookpublisher;

    private Integer commentstate;

    private Long buyermobile;

    private String buyername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public Date getBargaintime() {
        return bargaintime;
    }

    public void setBargaintime(Date bargaintime) {
        this.bargaintime = bargaintime;
    }

    public String getBuyeraddress() {
        return buyeraddress;
    }

    public void setBuyeraddress(String buyeraddress) {
        this.buyeraddress = buyeraddress == null ? null : buyeraddress.trim();
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    public String getBookcover() {
        return bookcover;
    }

    public void setBookcover(String bookcover) {
        this.bookcover = bookcover == null ? null : bookcover.trim();
    }

    public Float getBookprice() {
        return bookprice;
    }

    public void setBookprice(Float bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookpublisher() {
        return bookpublisher;
    }

    public void setBookpublisher(String bookpublisher) {
        this.bookpublisher = bookpublisher == null ? null : bookpublisher.trim();
    }

    public Integer getCommentstate() {
        return commentstate;
    }

    public void setCommentstate(Integer commentstate) {
        this.commentstate = commentstate;
    }

    public Long getBuyermobile() {
        return buyermobile;
    }

    public void setBuyermobile(Long buyermobile) {
        this.buyermobile = buyermobile;
    }

    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername == null ? null : buyername.trim();
    }
}