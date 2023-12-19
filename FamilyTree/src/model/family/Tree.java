package model.family;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Tree<T extends TreeNode<T>> implements Serializable,Iterable<T> {
    private List<T> treeMan;

    //Конструктор
    public Tree() {
        treeMan=new ArrayList<T>();
    }


    //Методы
    /*
    public void addPeople(List <T> newpeople){
        for (T human: newpeople ){
            treeMan.add(human);
        }
    }
*/
    public void addHuman(T human){
        treeMan.add(human);
        //return this;
    }


    @Override
    public String toString() {
        return outputTree();
    }

    public String outputTree(){
        StringBuilder sb = new StringBuilder();
        for (T human : treeMan ){
            sb.append(human.outputHuman()+"\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator <T> iterator(){
        return new TreeIterator(this.treeMan);
    }

    public void sortByName(){
        treeMan.sort(new TreeComparatorByName());
    }

    public void sortByBirn(){
        treeMan.sort(new TreeComparatorByBirn());
    }

}
