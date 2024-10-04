class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        
        int left = 0; 
        int right = skill.length-1;
        long sum = 0;
        int reqSkill = skill[left] + skill[right];
        
        while(left < right){
            if(skill[left] + skill[right] == reqSkill){
                sum = sum + (skill[left] * skill[right]);
                left++;
                right--;
            }else return -1;
        }
        return sum;
    }
}