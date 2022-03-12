package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum
{
    final List<ForumUser> userList = new ArrayList<>();

    public Forum()
    {
        userList.add(new ForumUser(17025, "marika", 'F',
                1996, 2, 19, 14));
        userList.add(new ForumUser(19027, "angela", 'F',
                1989, 6, 12, 4));
        userList.add(new ForumUser(23072, "jaro", 'M',
                2005, 10, 22, 6));
        userList.add(new ForumUser(21158, "mati", 'M',
                1995, 7, 2, 9));
        userList.add(new ForumUser(17563, "domi", 'F',
                2003, 3, 30, 11));
        userList.add(new ForumUser(25478, "sebek", 'M',
                2001, 11, 10, 3));
        userList.add(new ForumUser(25356, "krzychu", 'M',
                1977, 1, 17, 0));
    }

    public List<ForumUser> getUserList()
    {
        return new ArrayList<>(userList);
    }
}
