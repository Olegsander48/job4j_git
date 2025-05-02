package model;

public class Car {
    private int year;
    private String mark;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
