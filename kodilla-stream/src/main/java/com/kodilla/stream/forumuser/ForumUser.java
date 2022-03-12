package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser
{
    private final int userID;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int quantityOfPublishedPosts;

    public ForumUser(int userID, String username, char sex, int year, int month, int dayOfMonth, int quantityOfPublishedPosts)
    {
        this.userID = userID;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, dayOfMonth);
        this.quantityOfPublishedPosts = quantityOfPublishedPosts;
    }

    public int getUserID()
    {
        return userID;
    }

    public String getUsername()
    {
        return username;
    }

    public char getSex()
    {
        return sex;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public int getQuantityOfPublishedPosts()
    {
        return quantityOfPublishedPosts;
    }

    @Override
    public String toString()
    {
        return "ForumUser{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", quantityOfPublishedPosts=" + quantityOfPublishedPosts +
                '}';
    }
}
