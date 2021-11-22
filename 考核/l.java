public class l {
    public static void main(String[] args){
        int[] scores = {59, 64, 86, 48, 76};
        int sum1=0 ;          //该学生这几次的成绩之和
        int n1=0;              //接受该学生n次成绩
        for (int score : scores) {
            sum1 = sum1 + score;
            n1 = n1 + 1;


        }

        double average=printAverage((double)sum1,(double)n1);
        System.out.println(average);
        int max=printMax(scores);     //这组数据的最大值为max
        System.out.println(max);
        int sub=printSub(scores);//这组数据的最大值对应下标为sub
        System.out.println(sub);

    }
    public static double printAverage(double sum,double n){
        double average=sum/n;
        return average;
    }
    public static int printMax(int[] scores){



        int max=0;
        for (int score : scores) {
            max = Math.max(score, max);
        }
        return max;
    }
    public static int printSub(int[] scores){
        int max=0;
        int sub=0;
        for(int y=0;y<scores.length;y++){
            if (scores[y]>max) {
                max=scores[y];
                sub=y;
            }else{
                max=max;
                sub=sub;

            }
        }
        return sub;}
}




