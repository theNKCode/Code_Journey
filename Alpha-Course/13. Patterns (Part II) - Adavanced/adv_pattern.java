public class adv_pattern {
    public static void hollow_rectangle(int totRows, int totCols){
        System.out.println("Hollow Rectangle");
        for(int i=1; i<=totRows;i++){//outer loop
            for(int j=1; j<=totCols;j++){//inner loop
                if(i==1 || i==totRows || j==1 || j==totCols ) System.out.print("* ");//boundary condition
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    //MyLogic
    // public static void inverted_rotated_half_pyramid(int totRows, int totCols){
    //     System.out.println("Inverted & Rotated Half Pyramid");
    //     for(int i=1; i<=totRows;i++){
    //         for(int j=1; j<=totCols;j++){
    //             if(i>totCols-j) System.out.print("* ");
    //             else System.out.print("  ");
    //         }
    //         System.out.println();
    //     }
    // }
    
    // Shraddha Mam Logic
    public static void inverted_rotated_half_pyramid(int totRows, int totCols){
        System.out.println("Inverted & Rotated Half Pyramid");
        for(int i=1; i<=totRows;i++){
            //Spaces Print
            for(int j=1; j<=totRows-i;j++){
                System.out.print("   ");
            }
            //Stars Print
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }            
            System.out.println();
        }
    }   
    public static void main(String[] args) { 
        hollow_rectangle(4,5);

        inverted_rotated_half_pyramid(4,4);
    }
}