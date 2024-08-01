class Solution {
    public int countSeniors(String[] details) {
        int counter=0;
        for(String n:details){
            int age=Integer.parseInt(n.substring(11,13));
            if(age>60){
                ++counter;
            }
        }
        return counter;
    }
}
