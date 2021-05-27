import java.util.*;

class Solution
{
    // 10 : 11 sol : 12 min
    public int solution(String s)
    { 
        LinkedList<Character> list = new LinkedList<Character>();
        
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }

        boolean flag = true;
        while(flag){
            flag = false;
            
            for(int i = 0; i < list.size()-1; i++){
                if(list.get(i) == list.get(i+1)){
                    list.remove(i+1);
                    list.remove(i);
                    flag = true;
                    break;
                }
            }    
        }
        
        if(list.size() == 0) return 1;
        else return 0;

    }
}