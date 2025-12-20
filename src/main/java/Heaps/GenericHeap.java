package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericHeap<T> {


    public List<T> heap;
    private  Comparator<T> comp;

    public GenericHeap(Comparator<T> comp)
    {
        this.heap = new ArrayList<>();
        this.comp=comp;
    }


}
