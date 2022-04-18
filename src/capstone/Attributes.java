package capstone;

import static capstone.CharacterClass.HERO;

/**
 *
 * @author Marvin
 */
public class Attributes {
    
    private int level;
    private int totalRunes;
    private int nextLevel;
    
    
    private int vigor;
    private int mind;
    private int endurance;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int faith;
    private int arcane;
    
    public Attributes (CharacterClass type) {
        
        switch (type) {
            
            case HERO:
                level = 7;
                vigor = 14;
                mind = 9;
                endurance = 12;
                strength = 16;
                dexterity = 9;
                intelligence = 7;
                faith = 8;
                arcane = 11;
                break;
                
            case BANDIT:
                level = 5;
                vigor = 10;
                mind = 11;
                endurance = 10;
                strength = 9;
                dexterity = 13;
                intelligence = 9;
                faith = 8;
                arcane = 14;
                break;
                
            case ASTROLOGER:
                level = 6;
                vigor = 9;
                mind = 15;
                endurance = 9;
                strength = 8;
                dexterity = 12;
                intelligence = 16;
                faith = 7;
                arcane = 9;
                break;
                
            case WARRIOR:
                level = 8;
                vigor = 11;
                mind = 12;
                endurance = 11;
                strength = 10;
                dexterity = 16;
                intelligence = 10;
                faith = 8;
                arcane = 9;
                break;
                
            case PRISONER:
                level = 9;
                vigor = 11;
                mind = 12;
                endurance = 11;
                strength = 11;
                dexterity = 14;
                intelligence = 14;
                faith = 6;
                arcane = 9;
                break;
                
            case CONFESSOR:
                level = 10;
                vigor = 10;
                mind = 13;
                endurance = 10;
                strength = 12;
                dexterity = 12;
                intelligence = 9;
                faith = 14;
                arcane = 9;
                break;
                
            case WRETCH:
                level = 1;
                vigor = 10;
                mind = 10;
                endurance = 10;
                strength = 10;
                dexterity = 10;
                intelligence = 10;
                faith = 10;
                arcane = 10;
                break;
                
            case VAGABOND:
                level = 9;
                vigor = 15;
                mind = 10;
                endurance = 11;
                strength = 14;
                dexterity = 13;
                intelligence = 9;
                faith = 9;
                arcane = 7;
                break;
                
            case PROPHET:
                level = 7;
                vigor = 10;
                mind = 14;
                endurance = 8;
                strength = 11;
                dexterity = 10;
                intelligence = 7;
                faith = 16;
                arcane = 10;
                break;
                
            case SAMURAI:
                level = 9;
                vigor = 12;
                mind = 11;
                endurance = 13;
                strength = 12;
                dexterity = 15;
                intelligence = 9;
                faith = 8;
                arcane = 8;
                break;
                
        }
        
        System.out.println("Type: " + type + "\n"
                        + "Level: " + getLevel() + "\n"
                        + "Vigor: " + getVigor() + "\n"
                        + "Mind: " + getMind() + "\n"
                        + "Endurance: " + getEndurance() + "\n"
                        + "Strength: " + getStrength() + "\n"
                        + "Dexterity: " + getDexterity() + "\n"
                        + "Intelligence: " + getIntelligence() + "\n"
                        + "Faith: " + getFaith() + "\n"
                        + "Arcane: " + getArcane() + "\n");
        
    }
    
    public int nextLevelCalc(int level) {
//        this.level = level;
        level++;
        nextLevel = (int) ((0.02 * Math.pow(level, 3))
                + (3.06 * Math.pow(level, 2))
                + ((105.6 * level) - 895));
        System.out.println("Level: " + --level + "= " + nextLevel);
        return nextLevel;
    }
    
    public void totalRuneCalc() {
        totalRunes = 0;
        for (int i = 0; i < level; i++) {
            int value = nextLevelCalc(i);
            if (value > 0) {
                totalRunes += value;
            }
        }
        System.out.println("Total Runes are: " + totalRunes);
    }

    public String getLevel() {
        return String.valueOf(level);
    }

    public void setLevel(int level) {
        this.level = level;
        nextLevelCalc(level);
        totalRuneCalc();
        System.out.println("Level Updated");
    }

    public String getTotalRunes() {
        return String.valueOf(totalRunes);
    }

    public void setTotalRunes(int totalRunes) {
        this.totalRunes = totalRunes;
    }

    public String getNextLevel() {
        return String.valueOf(nextLevel);
    }

    public void setNextLevel(int nextLevel) {
        this.nextLevel = nextLevel;
    }
    
    

    public String getVigor() {
        return String.valueOf(vigor);
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
        System.out.println("Vigor Updated");
    }

    public String getMind() {
        return String.valueOf(mind);
    }

    public void setMind(int mind) {
        this.mind = mind;
        System.out.println("Mind Updated");
    }

    public String getEndurance() {
        return String.valueOf(endurance);
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
        System.out.println("Endurance Updated");
    }

    public String getStrength() {
        return String.valueOf(strength);
    }

    public void setStrength(int strength) {
        this.strength = strength;
        System.out.println("Strength Updated");
    }

    public String getDexterity() {
        return String.valueOf(dexterity);
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
        System.out.println("Dexterity Updated");
    }

    public String getIntelligence() {
        return String.valueOf(intelligence);
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        System.out.println("Intelligence Updated");
    }

    public String getFaith() {
        return String.valueOf(faith);
    }

    public void setFaith(int faith) {
        this.faith = faith;
        System.out.println("Faith Updated");
    }

    public String getArcane() {
        return String.valueOf(arcane);
    }

    public void setArcane(int arcane) {
        this.arcane = arcane;
        System.out.println("Arcane Updated");
    }   

}
