import Api.ApiRepository;
import Api.FamilyMember;
import Api.FamilyTree;
import Api.Repository;
import UserInterface.UserInterface;
import UserInterface.View;
import presenter.Presenter;
import java.util.Iterator;
import java.util.Iterator;

public class Main {

        public static void main(String[] args) {
            FamilyTree<FamilyMember> familyTree = new FamilyTree<>();
            View view = new UserInterface();
            Repository repository = new ApiRepository(familyTree);
            Presenter presenter = new Presenter(view, repository);



            repository.add("Arkady", "male", null, null);
            repository.add("Lubov", "female", null, null);
            repository.add("Alex", "male", familyTree.getFamilyMemberByName("Lubov"), familyTree.getFamilyMemberByName("Arkady"));
            repository.add("Ivan", "male", null, familyTree.getFamilyMemberByName("Alex"));

            presenter.start();
        }
    }

