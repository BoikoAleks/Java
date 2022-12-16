package org.example.entities;

import java.util.Objects;

public class Saller {
    public String name, secondname;

    public Saller() {  //констуктор
    }

    public Saller(String name, String secondname) {
        this.name = name;
        this.secondname = secondname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Saller saller = (Saller) o;
        return name.equals(saller.name) && secondname.equals(saller.secondname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondname);
    }

    @Override
    public String toString() {
        return "Saller{" +
                "name='" + name + '\'' +
                ", secondname='" + secondname + '\'' +
                '}';
    }
}
