public class Main

{
    public static void main(String[] args)
    {
        LightBoard sim1 = new LightBoard(7, 5);
        System.out.println(sim1.getboard());
        boolean[][] disco =
        {{true, true, false, true, true},
        {true, false, false, true, false},
        {true, false, false, true, true},
        {true, false, false, false, true},
        {true, false, false, false, true},
        {true, true, false, true, true},
        {false, false, false, false, false}};
        LightBoard sim2 = new LightBoard(disco);
        System.out.println(sim2.evaluateLight(0, 3));
        System.out.println(sim2.evaluateLight(6, 0));
        System.out.println(sim2.evaluateLight(4, 1));
        System.out.println(sim2.evaluateLight(5, 4));


    }
}