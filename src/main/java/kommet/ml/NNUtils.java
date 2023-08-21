package kommet.ml;

import org.nd4j.linalg.api.ndarray.INDArray;

import java.util.Map;

public class NNUtils
{
    /**
     * This method is to show how to convert the INDArray to a float array. This
     * is to provide some more examples on how to convert INDArray to types that
     * are more Java-centric.
     *
     * @param rowSlice
     * @return
     */
    public static float[] getFloatArrayFromSlice(INDArray rowSlice)
    {
        float[] result = new float[rowSlice.columns()];
        for (int i = 0; i < rowSlice.columns(); i++)
        {
            result[i] = rowSlice.getFloat(i);
        }
        return result;
    }

    public static String getLibPath() {
        return System.getProperty("java.library.path");
    }
}
