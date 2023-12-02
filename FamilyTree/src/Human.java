import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    //поля
    private int id;
    private String name;
    private List<Human> parent;
    private List<Human> child;
    private int birn;
    private int die;
    private Human pair;
//***********************************конструкторы
    public Human(String name, int birn, int die) {
        id=0;
        this.name = name;
        this.birn = birn;
        this.die = die;
        this.child = new ArrayList<Human>();
        this.parent = new ArrayList<Human>();
        //this.pair=
    }
    public Human(String name, int birn) {
        id=0;
        this.name = name;
        this.birn = birn;
        this.die = 0;
        this.child = new ArrayList<Human>();
        this.parent = new ArrayList<Human>();
    }
    public Human(String name) {
        id=0;
        this.name = name;
        this.birn = 0;
        this.die = 0;
        this.child = new ArrayList<Human>();
        this.parent = new ArrayList<Human>();
    }
//*************************************GET
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public List<Human> getParent() {
        return parent;
    }
    public List<Human> getChild() {
        return child;
    }
    public int getBirn() {
        return birn;
    }
    public int getDie() {
        return die;
    }
    public Human getPair() {
        return pair;
    }


    //******************SET//add
    public void setId(int id) {
        this.id = id;
    }

    public void setBirn(int birn) {
        this.birn = birn;
    }
    public void setDie(int die) {
        this.die = die;
    }

    public void setPair(Human partner) {
        this.pair=partner;
        partner.pair=this;
    }

    public void addChild(Human ch) {
        if (!this.child.contains(ch)){
            this.child.add(ch);
            ch.parent.add(this);
        }
    }

    public void addParent(Human pa) {
        if (!this.parent.contains(pa)){
            this.parent.add(pa);
            pa.child.add(this);
        }
    }
    //*************************************************ВЫВОД ИНФОРМАЦИИ
    @Override
    public String toString() {
        return outputHuman();
    }

    public String outputHuman(){
        StringBuilder sb = new StringBuilder();
        sb.append("id: ");
        sb.append(id);
        sb.append(" имя: ");
        sb.append(name);
        if (getBirn()>0){
            sb.append(" родился : "+birn);
        }

        if (getDie()>0){
            sb.append(" умер: "+die);
        }

        if (child.size()!= 0){
            sb.append(" дети: ");
            sb.append(child.get(0).getName());
            for (int i = 1; i < child.size(); i++) {
                sb.append(", "+child.get(i).getName());
            }
        }

        if (parent.size()!= 0){
            sb.append(" родители: ");
            sb.append(parent.get(0).getName());
            for (int i = 1; i < parent.size(); i++) {
                sb.append(", "+parent.get(i).getName());
            }
        }

        if (pair!=null){
            sb.append(" в браке с: ");
            sb.append(pair.getName());
        }
        return sb.toString();
    }



}

