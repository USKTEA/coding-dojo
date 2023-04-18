public class Solution {
    public int solution(String skill, String[] skillTrees) {
        int answer = 0;

        for (int i = 0; i < skillTrees.length; i += 1) {
            if (possible(skill, skillTrees[i])) {
                answer += 1;
            }
        }

        return answer;
    }

    public boolean possible(String skill, String skillTree) {
        for (int i = 0; i < skillTree.length(); i += 1) {
            char wantLearn = skillTree.charAt(i);

            String learned = learned(skillTree, wantLearn);
            String haveToLearned = haveToLearned(skill, wantLearn);

            for (int j = 0; j < haveToLearned.length(); j += 1) {
                if (notLearnedPreSkill(learned, haveToLearned, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean notLearnedPreSkill(String learned, String haveToLearned, int j) {
        return learned.indexOf(haveToLearned.charAt(j)) == -1;
    }

    public String haveToLearned(String skill, char wantLearn) {
        if (skill.indexOf(wantLearn) == -1) {
            return "";
        }

        return skill.substring(0, skill.indexOf(wantLearn));
    }

    public String learned(String skillTree, char skill) {
        return skillTree.substring(0, skillTree.indexOf(skill));
    }
}
