package jan11.filedemo;

/*
Get the file type from the user. Take input of file type from the user
Use switch case to get various cases
If file type is pdf, jpg --> only readable should be true
If file type is doc, docx --> readable and writable both should be true

 */

public class FileDemo {

    boolean isReadable;
    boolean isWritable;

    public boolean isReadable() {
        return isReadable;
    }

    public void setReadable(boolean readable) {
        isReadable = readable;
    }

    public boolean isWritable() {
        return isWritable;
    }

    public void setWritable(boolean writable) {
        isWritable = writable;
    }
}
