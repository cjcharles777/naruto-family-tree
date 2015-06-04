package com.donkeigy.objects;

import java.util.Set;

/**
 * Created by cedric on 6/4/15.
 */
public class Person
{
    Integer id;
    String name;
    Set<Person> parents;
    Set<Person> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getParents() {
        return parents;
    }

    public void setParents(Set<Person> parents) {
        this.parents = parents;
    }

    public Set<Person> getChildren() {
        return children;
    }

    public void setChildren(Set<Person> children) {
        this.children = children;
    }
}
