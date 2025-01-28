package com.ats.entities.criteria;

import com.ats.entities.EvaluationCriterion;

import java.util.Objects;

public class EvaluationExperience extends EvaluationCriterion {
    private int experienceInYears;
    private int weighting;

    public EvaluationExperience(String name, int punkte, int experienceInYears, int weighting) {
        super(name, punkte);
        this.experienceInYears = experienceInYears;
        this.weighting = weighting;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }
    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof EvaluationExperience that)) return false;
        if (!super.equals(o)) return false;
        return experienceInYears == that.experienceInYears;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experienceInYears);
    }
}
