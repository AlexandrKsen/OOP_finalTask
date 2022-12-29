package Api;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree <T extends FamilyMember> implements Iterable<T> {
    private List<T> familyMembers;

    public FamilyTree() {
        familyMembers = new ArrayList<>();

    }

    public T getFamilyMemberByName(String name) {

        for (int i = 0; i < familyMembers.size(); i++) {
            if (familyMembers.get(i).getName().equals(name)) {
                return familyMembers.get(i);
            }
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return familyMembers.iterator();
    }

    public void add(T familyMember) {

        familyMembers.add(familyMember);
    }
}