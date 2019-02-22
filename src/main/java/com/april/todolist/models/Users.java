package com.april.todolist.models;

import javax.persistence.*;

@Entity
@Table(name="user")

public class User {

    @Column(name = "cashonhand")
    private double cashonhand;

    public Customer()
    {
    }

    public Customer(String name, String todolist)
    {
        this.name = name;
        this.todolist = todolist;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getToDoList()
    {
        return todolist;
    }

    public void settodolist(double todolist)
    {
        this.todolist = todolist;
    }



}
