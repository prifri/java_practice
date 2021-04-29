import java.util.Arrays;
import java.util.Random;

class test{
    public static void case1() {
        //int[] ar = new int[10];
        int[] iar = {1, 2, 3, 4, 5};
        char[] car = {'a', 'b', 'c', 'd', 'e'};
        byte[] bar = {'a', 'b', 'c', 'd', 'e'};
        // 자바는 c언어의 sizeof가 존재하지 않는다. 그래서 sizeof(type)이 안된다.
        // size와 length는 엄연히 다르다. 왜 이걸 자꾸 같이 혼용해서 말하는거야?
        // 기본 타입에 대해서만 Interger.BYTES 식으로 나오며, 구조체에 대해선 구하지 못한다.
        System.out.println("iar : " + Arrays.toString(iar) + ", length : " + iar.length + ", size : " + iar.length * Integer.BYTES);
        System.out.println("car : " + Arrays.toString(car) + ", length : " + car.length + ", size : " + car.length * Character.BYTES);
        System.out.println("bar : " + Arrays.toString(bar) + ", length : " + bar.length + ", size : " + bar.length * Byte.BYTES);

        //char 배열을 단독으로만 print하면 붙여서 보여준다.
        System.out.println(car);
        //다른거랑 붙이면 위처럼 안나오고 주소를 찍는다. compiler warnning도 나오네
        //System.out.println("car + : " + car);

        String[] sar = {"abc", "123", "ㄱㄴㄷ", "가나다"};

        System.out.println("sar : " + Arrays.toString(sar) + ", length : " + sar.length + ", size : " + sar.length * Integer.BYTES);

        //System.out.println("sar + : " + sar);
        //System.out.println(sar);

        StringBuilder out_sar = new StringBuilder();

        for (String member : sar) {
            out_sar.append(member).append("+");
        }

        //여기서 length는 문자열의 길이를 의미한다.
        //arrary에서 length는 멤버의 개수를 의미한다.
        //size는 다음과 같은식으로 구한다.
        //java에서는 String의 charset이 unicode가 기본이라고 한다. 그렇기 때문에 ascii에 대응되는 문자들은 1바이트로, 아닌것들은 3바비트로 되서 사이즈가 나오는것..
        System.out.println("sar member add : " + out_sar + " length : " + out_sar.length() + " size : " + out_sar.toString().getBytes().length);

        String only_abc = "abc";
        String only_korean = "가나다";
        System.out.println("abc member add : " + only_abc + " length : " + only_abc.length() + " size : " + only_abc.getBytes().length);
        System.out.println("korean member add : " + only_korean + " length : " + only_korean.length() + " size : " + only_korean.getBytes().length);

        //
        char ch;
        for (int i = 0; i < only_abc.length(); i++) {
            ch = only_abc.charAt(i);
            System.out.println("ch " + i + " : " + ch);
        }
    }

    public static void case2() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3, 4};

        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));

        int[][] arr2D1 = {{1,2}, {3,4}};
        int[][] arr2D2 = {{1,2}, {3,4}};
        int[][] arr2D3 = {{1,2}, {1,2}, {3,4}};

        //2차원 배열을 그냥 비교. compile warnning 발생
        //System.out.println(Arrays.equals(arr2D1, arr2D2));
        //System.out.println(Arrays.equals(arr2D1, arr2D3));

        //
        System.out.println(Arrays.deepEquals(arr2D1, arr2D2));
        System.out.println(Arrays.deepEquals(arr2D1, arr2D3));

        int[] arrCopy = Arrays.copyOf(arr1, 1);
        int[] arrCopy2 = Arrays.copyOf(arr1, 10);

        System.out.println("copy : " + Arrays.toString(arrCopy));
        System.out.println("copy2 : " + Arrays.toString(arrCopy2));

        int[] arrCopy3 = Arrays.copyOfRange(arr1, 1, 2);
        int[] arrCopy4 = Arrays.copyOfRange(arr1, 1, 10);

        System.out.println("copy3 : " + Arrays.toString(arrCopy3));
        System.out.println("copy4 : " + Arrays.toString(arrCopy4));

        int[] arrRand = new int[10];

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for (int i=0; i<arrRand.length ; i++)
        {
            int r = random.nextInt()%10;
            if (r < 0) {
                r *= -1;
            }
            arrRand[i] = r;
        }

        System.out.println("before : " + Arrays.toString(arrRand));
        Arrays.sort(arrRand);
        System.out.println("after : " + Arrays.toString(arrRand));
    }
}
public class array {
    public static void main(String[] args) {
        //test.case1();
        test.case2();
    }
}
