package logic;

/**
 * This class provides the methods to convert temperatures of different scales
 */
public class Converter {

    /**
     * Converts Fahrenheit to Celsius
     * @param temp The temperature in Fahrenheit to convert
     * @return Temperature in Celsius
     */
    public static double FToC (double temp)
    {
        return (temp - 32) * 5/9;
    }

    /**
     * Converts Fahrenheit to Kelvin
     * @param temp The temperature in Fahrenheit to convert
     * @return Temperature in Kelvin
     */
    public static double FToK (double temp)
    {
        temp = CToK(FToC(temp));
        return temp;
    }

    /**
     * Converts Celsius to Fahrenheit
     * @param temp The temperature in Celsius to convert
     * @return Temperature in Fahrenheit
     */
    public static double CToF (double temp)
    {
        return ((9 * temp)/5) + 32;
    }

    /**
     * Converts Celsius to Kelvin
     * @param temp The temperature in Celsius to convert
     * @return Temperature in Kelvin
     */
    public static double CToK (double temp)
    {
        temp = temp + 273.15;
        return temp;
    }

    /**
     * Converts Kelvin to Celsius
     * @param temp The temperature in Kelvin to convert
     * @return Temperature in Celsius
     */
    public static double KToC (double temp)
    {
        temp = temp - 273.15;
        return temp;
    }

    /**
     * Converts Kelvin to Fahrenheit
     * @param temp The temperature in Kelvin to convert
     * @return Temperature in Fahrenheit
     */
    public static double KToF (double temp)
    {
        return CToF(KToC(temp));
    }
}
