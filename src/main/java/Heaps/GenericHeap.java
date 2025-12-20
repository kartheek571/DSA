package Heaps;

import java.util.*;

public class GenericHeap<T> {


    private  List<T> heap;
    private  Comparator<? super T> comp;
// ================ Constructors=================
    public GenericHeap(Comparator<T> comp)
    {
        this.heap = new ArrayList<>();
        this.comp=comp;
    }

    public GenericHeap(Collection<?  extends T> A, Comparator<? super T> comp)
    {
        this.heap = new ArrayList<>(A);
        this.comp=comp;

    }
    // ================helper methods=================
    public int parent(int i)
    {
        return (i-1)/2;
    }
    public int left(int i)
    {
        return 2*i+1;
    }
    public int right(int i)
    {
        return 2*i+2;
    }
    // swap
    public void swap(int i ,int j)
    {
        T temp =heap.get(i);
        heap.set(i , heap.get(j));
        heap.set(j , temp);
    }

   // =============build heap with TC(N)
    public void buildHeap()
    {


        int n =heap.size();

        for(int i=n/2-1;i>=0;i++)
        {
            downheapify(i);
        }
    }
// downheapify used in building a heap

    public void downheapify(int i)
    {
        int best=i;
        int left =left(i);
        int right =right(i);
        if(left<heap.size() &&  comp.compare(heap.get(left), heap.get(best))<0) best = left;
        if(right<heap.size() &&  comp.compare(heap.get(right), heap.get(best))<0) best = right;
        if(best!=i)
        {
            swap(best,i);
            downheapify(best);
        }

    }


    public T extractbest()
    {

        if(heap.isEmpty()) throw new RuntimeException("heap is empty");
        if(heap.size()==1) return heap.remove(0);
        T best = heap.get(0);
        T last =heap.remove(heap.size()-1);
        heap.set(0 , last);
        downheapify(0);
        return best;

    }

    public void insert(T val)
    {
        heap.add(val);
        heapifyup(heap.size()-1);

    }

    public void heapifyup(int i)
    {
        int p =parent(i);
        if(i>0 && comp.compare(heap.get(i), heap.get(p))<0);
        {
            swap(i,p);
            i=p;
            p=parent(i);

        }
    }

    public List<T> tolist()
    {
        return Collections.unmodifiableList(heap);
    }


    public static void main(String[] args)
    {
        GenericHeap g= new GenericHeap(Comparator.naturalOrder());
        List<Integer> A= new ArrayList<>(Arrays.asList(7, 3,9, 33, 2, 4949, 65));
        GenericHeap obj= new GenericHeap(A, Comparator.naturalOrder());
        List<Task> tasks = List.of(
                new Task("Design", 5, 3000),
                new Task("Development", 8, 7000),
                new Task("Testing", 3, 2000),
                new Task("Deployment", 6, 4000)
        );

        GenericHeap<Task> minHeap = new GenericHeap<>(tasks, Comparator
                .comparingInt(Task::getEffort)
                .thenComparingDouble(Task::getCost).reversed());

        System.out.println("MinHeap: " + minHeap.extractbest());
        System.out.println( minHeap.tolist());



    }


}




 class Task {
    private final String name;
    private final int effort;
    private final double cost;

    public Task(String name, int effort, double cost) {
        this.name = name;
        this.effort = effort;
        this.cost = cost;
    }

    public String getName() { return name; }
    public int getEffort() { return effort; }
    public double getCost() { return cost; }

    @Override
    public String toString() {
        return name + " [effort=" + effort + ", cost=" + cost + "]";
    }
}


