package Api;

public class ApiRepository implements Repository {

    //Formatter formatter;

    public FamilyTree<FamilyMember> tree;

    public ApiRepository(FamilyTree<FamilyMember> tree) {
        this.tree = tree;
        }



    @Override
    public String get(String familyTree){
        FamilyMember familyMember = tree.getFamilyMemberByName(familyTree);
        return familyMember.toString();
    }

    public  void add(String name, String gender, FamilyMember mother, FamilyMember father){
        FamilyMember familyMember = new FamilyMember(name, gender, mother, father);
        tree.add(familyMember);
    }

}
