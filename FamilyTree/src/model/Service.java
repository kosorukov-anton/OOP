package model;

import model.family.Tree;
import model.family.TreeComparatorByBirn;
import model.human.Human;

public class Service {
    private int idHuman;
    private Tree<Human> family;

    public Service() {
        family = new Tree<Human>();
    }

    public void addHuman(String name, Enum gender, int birn, int die) {
        Human human = new Human(name,gender,birn,die);
        human.setId(idHuman++);
        family.addHuman(human);
    }

    public String outputTree() {
        return family.outputTree();

    }

    public String SortByBirnTree() {
        family.sortByBirn();
        return family.outputTree();
    }
}
