package presenter;
//import model.human.Gender;

import model.Service;
import view.View;
import view.ConsoleUI;


public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, Enum gender, int birn, int die) {
        service.addHuman(name,gender,birn,die);
        outputTree();
    }

    public void outputTree() {
        String answer = service.outputTree();
        view.print(answer);
    }

    public void sortByBirnTree() {
        String answer = service.SortByBirnTree();
        view.print(answer);
    }
}
