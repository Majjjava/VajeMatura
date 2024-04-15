public class TestMetod {

    public void Izpis(){
        int x =15;
        if(x==15){
            System.out.println("Jaz sem izpis");
            return;
        }
        System.out.println("x ni 15");
    }

    public int vracanje()
    {
        System.out.println("Jaz sem vracanje");
        //obvezen return+vrednost se mora ujemati z napovedanim tipom
        return -2;
    }

    public void test1(int x){
        System.out.println("Vrednost x je"+x);
    }

    public void test2(int y, int x){
        System.out.println("Vsota je  "+(y+x));
    }
}
