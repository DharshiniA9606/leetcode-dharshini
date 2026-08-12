// Last updated: 8/12/2026, 8:40:33 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>map=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                map.add(i);
            }
        }
        return map;
    }
}