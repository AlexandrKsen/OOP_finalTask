package Api;

import java.util.ArrayList;
import java.util.List;

public class FamilyMember {
    private String name;
    private String gender;
    private FamilyMember mother;
    private FamilyMember father;
    private List<FamilyMember> childrens;

    public FamilyMember(String name, String gender, FamilyMember mother, FamilyMember father) {
        this.childrens = new ArrayList<>();
        this.name = name;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        if (mother != null){
            mother.getChildrens().add(this);
        }

        if (father != null) {
            father.getChildrens().add(this);
        }
    }

    public FamilyMember(List<FamilyMember> familyMembers) {

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

    public List<FamilyMember> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<FamilyMember> childrens) {
        this.childrens = childrens;
    }

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

    @Override
    public String toString() {
        String res = "FamilyMember{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' ;
        if (mother != null){
            res +=  ", mother= " + mother.getName();
        }
        else {
            res +=  ", mother=null" ;
        }
        if (father != null){
            res +=  ", father= " + father.getName();
        }
        else {
            res +=  ", father=null" ;
        }

        //код до конца не реализован, планирую доделать...
//        if (mother != null) {
//            if (mother.mother != null) {
//
//            }
//        }
//
//
//        res+= "grandma= " + getFather().getMother().getName() + ", " + getMother().getMother().getName();
//
//        res+= "grandpa= " + getFather().getFather().getName() + ", " + getMother().getFather().getName();



        res += "\n childrens= " + childrens + '}';


        return res;


    }
}
