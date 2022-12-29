package Api;

public class Person {
    private String name;
    private String gender;
    private FamilyMember mother;
    private FamilyMember father;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public FamilyMember getMother() {
        return mother;
    }

    public void setMother(FamilyMember mother) {
        this.mother = mother;
    }

    public FamilyMember getFather() {
        return father;
    }

    public void setFather(FamilyMember father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + '\n' +
                "gender=" + gender + '\n' +
                "FamilyMember mother= + mother" + '\n' +
                "FamilyMember father= + father";
    }
}
