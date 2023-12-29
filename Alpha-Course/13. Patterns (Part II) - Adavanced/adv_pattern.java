public class adv_pattern {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows;i++){//outer loop
            for(int j=1; j<=totCols;j++){//inner loop
                if(i==1 || i==totRows || j==1 || j==totCols ) System.out.print("* ");//boundary condition
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) { 
        hollow_rectangle(4,5);
    }
}