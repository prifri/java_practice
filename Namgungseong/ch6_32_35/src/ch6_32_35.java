//https://www.youtube.com/watch?v=HXh2ZSgg-oQ&list=PLW2UjW795-f6xWA2_MUhEVgPauhGl3xIp&index=66

//default
class cal {
    int value;
    cal(int value) {
        this.value = value;
    }
}

public class ch6_32_35 {
    public static void main(String[] args) {
        //error
        //cal test = new cal();
        //기본 생성자가 없어도 동작함.
        //기본 생성자가 무조건 생성되는게 아니라 없으면 생기는거 같다.
        //기본생성자가 없고 생성자만 있을때 생성자를 호출 한다면
        //기본생성자가 없으니까 에러가 뜨는거일뿐이다.(라고 생각한다.)
        //즉.
        //생성자가 하나도 없다 -> 기본생성자가 생긴다 (o)
        //생성자가 있을때 기본 생성자를 무조건 만들어 줘야 한다(x)
        cal test = new cal(1);
        System.out.println(test.value);
    }
}
