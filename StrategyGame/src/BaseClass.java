import java.util.Random;

public class BaseClass {

    public FightInfo CharctrFight(Character FstPlyr,Character SndPlyr){
        //Hiyerarşik karşılaştırma
        if(FstPlyr.getId()>SndPlyr.getId())       { return FightInfo.FirstPlayerWin;}
        else if (FstPlyr.getId()<SndPlyr.getId()) { return FightInfo.SecondPlayerWin;}
        else {
            //Güç karşılaştırması
            if (FstPlyr.getPower()>SndPlyr.getPower())      { return FightInfo.FirstPlayerWin; }
            else if (FstPlyr.getPower()<SndPlyr.getPower()) { return FightInfo.SecondPlayerWin; }
        }
        return FightInfo.Scoreless; //Eşitlik Sağlanırsa
    }

    public Character[] CharacterPack(int CharacterNum){ //Karakter destesi döndüren metod
        Character[] ListCharacter = new Character[CharacterNum];
        
        for(int i = 0; i<ListCharacter.length; i++){
            ListCharacter[i] = CreateCharacter();
        }
        
        return ListCharacter;
    }

    public Character CreateCharacter(){ //Karakter oluşturma
        Character character = new Character();
        Random random = new Random();
        
        character.setId(random.nextInt(1,3));
        character.setPower(random.nextInt(1,11));
        
        return character;
    }
}
