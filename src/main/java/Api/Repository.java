package Api;

public interface Repository {
    String get(String familyTree);

void add(String name, String gender, FamilyMember mother, FamilyMember father);
}
