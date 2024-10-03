import java.util.*;

public class Test2 {
    public static ArrayList<Card> CordGenerate() {
        String[] fourDecor = {"♥", "♠", "♣", "♦"};
        ArrayList<Card> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                Card card = new Card(fourDecor[i], j);
                list.add(card);
            }
        }
        return list;
    }

    public static ArrayList<Card> shuffle(ArrayList<Card> list){
        Random random=new Random();
        for (int i = 0; i <= 51; i++) {
            int randNum=random.nextInt(0,51);
            Card tmp=new Card("0",0);
            tmp=list.get(i);
            list.set(i,list.get(randNum));
            list.set(randNum,tmp);
        }
        return list;
    }


    public static ArrayList<ArrayList<Card>> deal(ArrayList<Card> list){
        ArrayList<ArrayList<Card>> lists=new ArrayList<>();
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();
        ArrayList<ArrayList<Card>> players=new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        for(int i=0;i<13;i++){
                for(int j=0;j<3;j++){
                    Card tmp=list.remove(0);
                    players.get(j).add(tmp);
                }
        }
        lists.add(players.get(0));
        lists.add(players.get(1));
        lists.add(players.get(2));
        return  lists;
    }


    public static void main(String[] args) {
        System.out.println("洗牌");
        ArrayList<Card> list=shuffle(CordGenerate());
        int sum=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                System.out.print(list.get(sum++)+" ");
            }
            System.out.println();
        }
        System.out.println("发牌");
        ArrayList<ArrayList<Card>> lists=deal(list);
        //System.out.println(Arrays.toString(lists.toArray()));
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(lists.get(i).toArray()));
        }
    }
}