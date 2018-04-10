package com.example.Test0304.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="ITEM")
public class Item implements java.io.Serializable {

    private String hash;

    private String format;

    private String url;

    private String title;

    private String documentOf;

    private String datePublished;

    private String dateModified;

    private String relatedItem;

    private String id;

    public Item() {
        this.id = "42";
    }

    public Item(String hash, String format, String url, String title, String documentOf, String datePublished, String dateModified, String relatedItem, String id) {
        this.hash = hash;
        this.format = format;
        this.url = url;
        this.title = title;
        this.documentOf = documentOf;
        this.datePublished = datePublished;
        this.dateModified = dateModified;
        this.relatedItem = relatedItem;
        this.id = id;
    }

    @Column (name = "HASH")
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Column (name = "FORMAT")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Column (name = "URL")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column (name= "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column (name = "DOCUMENTOF")
    public String getDocumentOf() {
        return documentOf;
    }

    public void setDocumentOf(String documentOf) {
        this.documentOf = documentOf;
    }

    @Column (name = "DATEPUBLISHED")
    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @Column (name = "DATEMODIFIED")
    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @Column (name = "RELATEDITEM")
    public String getRelatedItem() {
        return relatedItem;
    }

    public void setRelatedItem(String relatedItem) {
        this.relatedItem = relatedItem;
    }

    @Id
    @Column (name = "ITEM_ID", unique = true, nullable = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
