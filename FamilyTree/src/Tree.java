import java.util.ArrayList;
import java.util.List;


public class Tree {
    private List<Human> treeMan;
    private int num;

    //Конструктор
    public Tree() {
        this.treeMan=new ArrayList<Human>();
    }

    //Получение
    public int getNum() {
        return num;
    }

    //Методы
    public void addPeople(List <Human> newpeople){
        for (Human h : newpeople ){
            this.treeMan.add(h);
        }
        this.num=treeMan.size();
        //return this;
    }

    public void addHuman(Human Man){
        this.treeMan.add(Man);
        this.num=+1;
        //return this;
    }


    @Override
    public String toString() {
        return outputTree();
    }
    public String outputTree(){
        StringBuilder sb = new StringBuilder();
        int j=0;
        for (Human h : treeMan ){
            j++;
            sb.append(j+" "+h.outputHuman()+"\n");
        }
        return sb.toString();
    }

}
