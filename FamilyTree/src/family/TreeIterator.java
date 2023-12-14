package family;
import human.Human;
import java.util.Iterator;
import java.util.List;


public class TreeIterator<T> implements Iterator<T>{
    private List<T> family;
    private int index;

    public TreeIterator(List<T> family){
        this.family = family;
        this.index = 0;
    }

    @Override
    public boolean hasNext(){
        return index < family.size();
    }

    @Override
    public T next(){
        if(hasNext()){
            T member = family.get(index);
            index++;
            return member;
        } else {
            return null;
        }
    }
}