package presenter;

import Api.Repository;
import UserInterface.View;

public class Presenter {
    View view;
    Repository repository;

    public Presenter(View view, Repository repository) {
        this.view = view;
        this.repository = repository;
    }

    public void start(){
        String familyTree = view.scan();
        String answer = repository.get(familyTree);
        view.print(answer);

    }
}
