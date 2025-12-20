package Heaps;

import java.util.*;

public class pg <T> {

    private Comparator<? super T> comp;
    private List< T> heap;

    public pg(Comparator<? super T> comp)
    {
        this.comp = comp;
        this.heap = new ArrayList<>();

    }

    public pg(Collection<? extends T> A  , Comparator<? super T> comp)
    {
        this.comp=comp;
        this.heap= new ArrayList(A);
    }

    public int parent(int i)
    {
        return (i-1)/2;
    }
    public int left(int i)
    {
        return 2*i+1;
    }
     public int right (int i)
     {
         return 2*i+2;
     }

    public void buildHeap()
    {
        for(int i=(heap.size()/2)-1; i>=0;i--)
        {
            downheapify(i);
        }

    }

    public void downheapify(int i)
    {
//        System.out.println("downheapify(" + i + ")");
        int best =i;
        int l =left(i);
        int r =right(i);
        if(l<heap.size() &&  comp.compare(heap.get(l), heap.get(best))<0 ) best=l;
        if(r<heap.size() && comp.compare(heap.get(r), heap.get(best))<0) best =r;
        if(best!=i)
        {
            swap(i , best);

            downheapify(best);
        }

    }

    public void swap(int i , int j)
    {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j , temp);
    }
    public void insert(T val)
    {
        heap.add(val);
        heapifyUp(heap.size()-1);


    }

     public void heapifyUp(int i)
     {
         int p =parent(i);
         while(i>0 && comp.compare(heap.get(i),heap.get(p))<0)
         {
            swap(i ,p);
            i=p;
            p=parent(i);
         }
     }
        public List<T> tolist()
        {
            return  Collections.unmodifiableList(heap);
        }
     public T extractbest()
     {

         if(heap.size()==0)  throw  new RuntimeException("heap is empty");
         if(heap.size()==1) return heap.remove(0);
         T best = heap.get(0);
         T last = heap.remove(heap.size()-1);
         heap.set(0, last);
         downheapify(0);
         return best;
     }


    public static  void main(String[] args)
    {
        List<Integer> A= new ArrayList<>(Arrays.asList(938,3,474, 9373, 73636));

        pg<Integer> p1 = new pg(A, Comparator.naturalOrder());

        List<Task1> tasks = List.of(
                new Task1("Design", 5, 3000),
                new Task1("Development", 8, 7000),
                new Task1("Testing", 3, 2000),
                new Task1("Deployment", 6, 4000)
        );

        pg<Task1> p = new pg<>(tasks, Comparator.comparingInt(Task1::getEffort)
                .thenComparingDouble(Task1::getCost).reversed());

        p.buildHeap();

        System.out.println( p.tolist());

    }
}



class Task1 {
    private final String name;
    private final int effort;
    private final double cost;

    public Task1(String name, int effort, double cost) {
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


