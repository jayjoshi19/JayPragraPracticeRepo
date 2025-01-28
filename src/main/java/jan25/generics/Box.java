package jan25.generics;

public class Box<T,R> {

    T length;
    R width;

    public Box(T length, R width) {
        this.length = length;
        this.width = width;
    }

    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public R getWidth() {
        return width;
    }

    public void setWidth(R width) {
        this.width = width;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Box{");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }

    public void getDetails(){
        System.out.println("Box created with length = " + length + " and width = " + width);
    }
}
