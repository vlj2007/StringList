package pro.sky.StringList;

import java.util.Arrays;
import java.util.Objects;

public class StringListImpl implements StringList{

    final String[] list;
    int size;
    private int capacity;


    public StringListImpl(int size) {
        this.size = size;
        this.list = new String[size];
        this.capacity = 0;
    }

    public StringListImpl() {
        this.list = new String[100];
        size = 100;
        capacity = 0;
    }


    @Override
    public String toString() {
        return "list=" + Arrays.toString(list);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringListImpl that = (StringListImpl) o;
        return size == that.size && capacity == that.capacity && Arrays.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, capacity);
        result = 31 * result + Arrays.hashCode(list);
        return result;
    }

    public void element(String str) {
        if (str == null) {
            throw new NullPointerException("The element is null");

        }


        public void ifBadIndex(int index) {
            if (index < 0 || index > (list.length - 1)) {
                throw new ArrayIndexOutOfBoundsException("The index exceeds list size limits");
            }
        }


    @Override
    public String add(String item){
        element(item);
        if (capacity == size){
            throw new ArrayIsFullException("лист заполнен");
        }
        list[capacity] = item;
        capacity++;
        return item;

        }



    }

    @Override
    public String set(int index, String item){
        return null;
    }

    @Override
    public String remove(String item){
        return null;
    }
    @Override
    public String remove(int index){
        return null;
    }
    @Override
    public boolean contains(String item){
        return false;
    }
    @Override
    public int indexOf(String item){
        return 0;
    }

    @Override
    public int lastIndexOf(String item){
        int i = capacity - 1;
        for (i = capacity - 1; i > -1; i--) {
            if (list[i].equals(item)) break;
        }
        return i;


    }

    @Override
    public String get(int index){
        return null;
    }

    @Override
    public boolean equals(StringList otherList){
        return false;
    }

    @Override
    public int size(){
        return 0;
    }

    @Override
    public boolean isEmpty(){
        return false;
    }

    @Override
    public void clear(){

    }

    @Override
    public String[] toArray(){
        return null;
    }


}
