package kommet.ml;

import org.tensorflow.SavedModelBundle;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        getLibPath();
        SavedModelBundle.load("D:\\ml\\kmt-ml-libs\\model_tutu\\pb", "serve");
    }

    private static void getLibPath() {

        String javaLibPath = System.getProperty("java.library.path");
        Map<String, String> envVars = System.getenv();
        //System.out.println(envVars.get("Path"));
        System.out.println(javaLibPath);
        /*for (String var : envVars.keySet()) {
            System.err.println("examining " + var);
            if (envVars.get(var).equals(javaLibPath)) {
                System.out.println(var);
            }
        }*/

    }

}
