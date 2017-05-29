package me.anthonybruno.todo.transformer;

public class BasicPojo {

    private long id;
    private String name;
    private boolean hasCar;
    private int[] numbers;

    public BasicPojo() {
    }

    public BasicPojo(long id, String name, boolean hasCar, int[] numbers) {
        this.id = id;
        this.name = name;
        this.hasCar = hasCar;
        this.numbers = numbers;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
