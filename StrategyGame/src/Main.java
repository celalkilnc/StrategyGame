import java.util.Random;

public class Main {
    public static void main(String[] args){
        BaseClass baseClass = new BaseClass();
        int FirstPlyScore = 0,SecondPlyScore = 0,CharacterNum_ = 5;

        Character[] FstPlyrChrtrs = baseClass.CharacterPack(CharacterNum_);
        Character[] SndPlyrChrtrs = baseClass.CharacterPack(CharacterNum_);

        for(int i = 0;i<CharacterNum_;i++){
            Character First = FstPlyrChrtrs[i],Second = SndPlyrChrtrs[i];

            if(baseClass.CharctrFight(First, Second) == FightInfo.FirstPlayerWin)        { FirstPlyScore++; }
            else if (baseClass.CharctrFight(First, Second) == FightInfo.SecondPlayerWin) { SecondPlyScore++;}
        }
        if(FirstPlyScore>SecondPlyScore) { System.out.println("1st Player Win!"); }
        else if (FirstPlyScore<SecondPlyScore) { System.out.println("2nd Player Win!"); }
        else{ System.out.println("Scoreless"); }
        
        System.out.println("1st Score: "+ FirstPlyScore + "\n2nd Score: "+SecondPlyScore);
    }
}
