package part3;
import java.util.*;
//  70점/100점
//수정해서 100점만들기   ... https://programmers.co.kr/learn/courses/30/lessons/42889
class Stage implements Comparable<Stage>{
    
    private int tot,suc,index;
    private double fail;
    
    public Stage(int tot, int suc, int index, double fail){
        this.tot = tot;
        this.suc = suc;
        this.index=index;
        this.fail = fail;
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
            double fail = (double) (tot[i]-suc[i])/tot[i];
            list.add(new Stage(tot[i],suc[i],i,fail));
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).getIndex();
        }
        
        return answer;
    }
}
public class ch14_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
