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
    public double FToC (double temp)
    {
        temp = (temp - 32) * (5/9);
        return temp;
    }

    /**
     * Converts Fahrenheit to Kelvin
     * @param temp The temperature in Fahrenheit to convert
     * @return Temperature in Kelvin
     */
    public double FToK (double temp)
    {
        temp = CToK(FToC(temp));
        return temp;
    }

    /**
     * Converts Celsius to Fahrenheit
     * @param temp The temperature in Celsius to convert
     * @return Temperature in Fahrenheit
     */
    public double CToF (double temp)
    {
        temp = temp * (9/5) + 32;
        return temp;
    }

    /**
     * Converts Celsius to Kelvin
     * @param temp The temperature in Celsius to convert
     * @return Temperature in Kelvin
     */
    public double CToK (double temp)
    {
        temp = temp + 273.15;
        return temp;
    }

    /**
     * Converts Kelvin to Celsius
     * @param temp The temperature in Kelvin to convert
     * @return Temperature in Celsius
     */
    public double KToC (double temp)
    {
        temp = temp - 273.15;
        return temp;
    }

    /**
     * Converts Kelvin to Fahrenheit
     * @param temp The temperature in Kelvin to convert
     * @return Temperature in Fahrenheit
     */
    public double KToF (double temp)
    {
        temp = CToF(KToC(temp));
        return temp;
    }
}
