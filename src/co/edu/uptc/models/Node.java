package co.edu.uptc.models;

public class Node<T>{

    private T info;
    private Node<T> lower;
    private Node<T> higher;

    public Node(T value){
        this.info = value;
        lower = null;
        higher = null;
    }

    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }
    public Node<T> getLower() {
        return lower;
    }
    public void setLower(Node<T> lower) {
        this.lower = lower;
    }
    public Node<T> getHigher() {
        return higher;
    }
    public void setHigher(Node<T> higher) {
        this.higher = higher;
    }
}
