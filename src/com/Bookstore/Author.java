package com.Bookstore;

public class Author{
    private String authorName;
    private String penName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public Author(String authorName, String penName)
    {
        this.authorName = authorName;
        this.penName = penName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorName='" + authorName + '\'' +
                ", penName='" + penName + '\'' +
                '}';
    }
}
