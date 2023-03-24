public class Main {
    public static void main(String[] args) {
        long[] k = new long [16];
        float[] x = new float[18];
        double[][] g = new double[16][18];
        for (int i=2;i < 18;i++)
        {
            k[i-2] = (short) i;
        }

        for (int i=0; i < 18; i++){
            x[i] = (float) (Math.random()*12 - 10);
        }

        for (int i = 0; i<16; i++){
            for (int j = 0; j<18; j++){
                if (k[i] == 15){
                    g[i][j] = Math.asin(Math.pow(Math.E, Math.cbrt(-Math.abs(x[j]))));
                }
                else if (k[i] == 2 || k[i] == 5 || k[i] == 7 || k[i] == 8 || k[i] == 10 || k[i] == 11 || k[i] == 14 || k[i] == 17){
                    g[i][j] = Math.tan(Math.pow((0.5 / (Math.pow(0.25 / (x[j] + 0.5), x[j]) + 0.75)), 3));
                }
                else {
                    g[i][j] = Math.pow(Math.pow((Math.log(Math.abs(x[j])) / 3), 3), 2*(0.25-(2 / Math.pow(Math.E, Math.pow(2*x[j], 2)))));
                }
            }

        }
        for(int i=0;i<16;i++)
        {
            for(int j =0; j<18;j++)
            {
                System.out.printf("%.3f", g[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
