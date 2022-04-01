public class Problem4{
    public static void main(String[] args){
        int a = (int)(Math.random()*4)+1;
        String cards = "";
        switch (a){
            case 1:
                cards = "clubs";break;
            case 2:
                cards = "diamond";break;
            case 3:
                cards = "heart";break;
            case 4:
                cards = "spades";break;
        }
        int b = (int)(Math.random()*13)+1;
        String Numbers = "";
        switch (b){
            case 1:
                Numbers = "Ace";break;
            case 2:
                Numbers = "two";break;
            case 3:
                Numbers = "Trey";break;
            case 4:
                Numbers = "four";break;
            case 5:
                Numbers = "five";break;
            case 6:
                Numbers = "six";break;
            case 7:
                Numbers = "seven";break;
            case 8:
                Numbers = "eight";break;
            case 9:
                Numbers = "nine";break;
            case 10:
                Numbers = "ten";break;
            case 11:
                Numbers = "Jack";break;
            case 12:
                Numbers = "Queen";break;
            case 13:
                Numbers = "King";break;
        }
        System.out.println(cards +" "+ Numbers);
    }
}
