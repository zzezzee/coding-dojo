class Solution
{
    public int solution(int n, int a, int b)
    {
        test();

        return tournament(a, b, 0);
    }

    public int tournament(int a, int b, int answer) {
        if(a == b){
            return answer;
        }

        a = a / 2 + a % 2;
        b = b / 2 + b % 2;

        return tournament(a, b, answer + 1);
    }

    public void test() {
        System.out.println("tournament(4, 7, 0) : 3 = "
                + tournament(4, 7, 0));
    }
}
