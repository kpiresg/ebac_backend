package generic;

public class GenericEntry<T> {

    T data;

    public GenericEntry(T data) {
        this.data = data;
    }


    public T getData() {
        return data;
    }

}
