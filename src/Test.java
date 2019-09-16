public class Test {
    public static void main(String[] args) {
        String str2="....X";
        String[]strarrays=str2.split("X");
        for (int j = 0; j <strarrays.length ; j++) {
            System.out.println(strarrays[j]);
        }
//        System.out.println(strarrays.length);

        int sum=0;
        for (int j = 0; j <strarrays.length ; j++) {
            System.out.println(strarrays[j].length());
            if (strarrays[j].length()==0){
                sum+=0;
            }else if(strarrays[j].length()<=3){
                sum+=1;
            }else {
                if (strarrays[j].length()%3==0){
                    sum+=strarrays[j].length()/3;
                }else {
                    sum+=(strarrays[j].length()/3+1);
                    System.out.println(sum);
                    System.out.println("zhixing");
                }
            }

        }
        System.out.println(sum);
    }
}
