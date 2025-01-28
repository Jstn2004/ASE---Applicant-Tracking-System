package com.ats.entities.criteria;

import com.ats.entities.EvaluationCriterion;
import com.ats.vo.Ability;

import java.util.List;
import java.util.Objects;

public class EvaluationAbilities extends EvaluationCriterion {

    //Es soll überprüft werden ob de Lebenslauf die an anegegebenen Fähgikeiten die gefordert werden enthält und vergibt dazu Punkte
    private List<Ability> listOfAbilities;
    private int weighting;

    public EvaluationAbilities(String name, int points, List<Ability> listOfAbilities, int weighting) {
        super(name, points);
        if(points < 1 || points > 100 ){
            throw new IllegalArgumentException("Points must be between 1 and 100");
        }
        if(weighting < 1 || weighting > 10){
            throw new IllegalArgumentException("Weighting must be between 1 and 10");
        }
        this.listOfAbilities = listOfAbilities;
        this.weighting = weighting;
    }

    public void addAbility(Ability ability)
    {
        listOfAbilities.add(ability);
    }

    public void removeAbility(Ability ability)
    {
        listOfAbilities.remove(ability);
    }

    public List<Ability> getListOfAbilities() {
        return listOfAbilities;
    }

    public void setListOfAbilities(List<Ability> listOfAbilities) {
        this.listOfAbilities = listOfAbilities;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EvaluationAbilities that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(listOfAbilities, that.listOfAbilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), listOfAbilities);
    }

    @Override
    public String toString() {
        return "EvaluationAbilities{" +
                "name=" + super.getName() +
                ", points=" + super.getPoints() +
                ", listOfAbilities=" + listOfAbilities +
                ", weighting=" + weighting +
                '}';
    }
}
