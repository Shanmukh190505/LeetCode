class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res = new ArrayList<>();
        List<String>s=new ArrayList<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sor=new String(arr);

            int i=0;
            for(;i<s.size();i++){
                if(s.get(i).equals(sor)){
                    res.get(i).add(str);
                    break;
                }
            }
            if(i==s.size()){
                res.add(new ArrayList<>(Arrays.asList(str)));
                s.add(sor);
            }
        }

        return res;
    }
}