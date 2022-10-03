package org.example;

public class ThreeDimensionalShapes {
    private int id;
    private String name;

    public ThreeDimensionalShapes(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ThreeDimensionalShapes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
