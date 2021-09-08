public class BowlingGame{
int frameVar = 0;
int score =  0;
int frame[] = new int[21];

public void setFrame(int pinsdown[]){
    for(int i=0;i<pinsdown.length;i++){
        frame[i]=pinsdown[i];
    }
    
}


public int Score(){
    int position =0;
   for(int i=0;i<10;i++){
       if(frame[position]==10){//strike
         score = score +10+ frame[position+1]+frame[position+2];  
         position = position+1;
       }
       else if((frame[position]+frame[position+1])==10){//spare
         score = score + 10+ frame[position+2];  
         position = position+2;
       }
       else{
            score = score+frame[position]+frame[position+1];
            position = position+2;
       }
   }
    System.out.println(score);
   return score;
  
}


}