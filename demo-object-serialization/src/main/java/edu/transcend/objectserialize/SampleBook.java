package edu.transcend.objectserialize;

import java.util.Date;

public class SampleBook {
    private String Title;
    private Date published;
    private int rating;
    private SampleAuthor author;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public SampleAuthor getAuthor() {
        return author;
    }

    public void setAuthor(SampleAuthor author) {
        this.author = author;
    }
}
