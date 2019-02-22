package com.april.todolist.models;

public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private int quantity;

    private double cost;

    @ManyToOne
    @JoinColumn(name ="vendingid", nullable=false)
    @JsonIgnore
    private VendingMachine vendingMachine;

    public ToDoList()
    {
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public long getId()
    {
        return id;
    }

    public String getDescription()
    {
        return name;
    }

    public void setDescription(String name)
    {
        this.name = name;
    }

    public int getDateStarted()
    {
        return datetime;
    }



    public double getCompleted()
    {
        return boolean;
    }




}
