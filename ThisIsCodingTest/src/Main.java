import java.util.*;

class Stage implements Comparable<Stage>{
    
    private int tot,suc,index;
    private double fail;
    
    public Stage(int tot, int suc, int index){
        this.tot = tot;
        this.suc = suc;
        this.index=index;
        this.fail = (double)(tot-suc)/tot;
    }
    public int getIndex(){
        return this.index;
    }
    
    public int compareTo(Stage o){
        if(o.fail== this.fail) {
        	return this.index - o.index;
        }
        return Double.compare(o.fail, this.fail);
    }
}

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int[] tot= new int[N+2];
        int[] suc= new int[N+1];
        
        for(int i=0; i<stages.length; i++){
            for(int j=1; j<=stages[i]; j++){
                tot[j]++;
            }
            for(int k=1; k<stages[i]; k++){
                suc[k]++;
            }
        }
        ArrayList<Stage> list = new ArrayList<Stage>();
        for(int i=1; i<=N; i++){
            list.add(new Stage(tot[i],suc[i],i));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).getIndex();
        }
        
        return answer;
    }
}

public class Main {
	
	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int ss[] = {2,1,2,6,2,4,3,3};
		int aa[] = sol.solution(5, ss);
		for(int i:aa) {
			System.out.println(i);
		}
	}
}

