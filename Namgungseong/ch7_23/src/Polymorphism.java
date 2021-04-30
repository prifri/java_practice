class Tv {
    boolean power;
    int channel;
    public void Up_channel() {
        System.out.println("Tv Up");

    }
    public void Down_channel() {
        System.out.println("Tv Down");
    }

}

class SmartTv extends Tv {
    String text;

    public void Up_channel() {
        System.out.println("smart up");
    }

    public void Down_channel() {
        System.out.println("smart down");
    }

    public void caption() {
        System.out.println("caption");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        Tv tv;

        smartTv.Up_channel();

        tv = smartTv;

        //자식 -> 부모로 형변환됫어도 실제는 자식을 가리킨다는게 중요한점.
        tv.Up_channel();

        Tv tv2 = new Tv();

        tv2.Up_channel();
        //smartTv = (SmartTv)tv2; //runtime error

        //always true, false compile warnning이 뜨므로 주석처리한다.
        //객체의 형변환시 메모리에 대한 개념을 잡기 위한 연습
        /*
        if (tv2 instanceof SmartTv) {
            System.out.println("tv2->smartTv true");
        }else {
            System.out.println("tv2->smartTv false");
        }

        if (smartTv instanceof Tv) {
            System.out.println("smartTv->tv true");
        }else {
            System.out.println("smartTv->tv false");
        }
        */

        SmartTv smartTv2 = new SmartTv();

        /*
        Tv tv3;

        tv3 = smartTv2;
        if (tv3 instanceof  SmartTv) {
            System.out.println("tv3->SmartTv true");
        }else {
            System.out.println("tv3->SmartTv false");
        }
         */
    }
}
