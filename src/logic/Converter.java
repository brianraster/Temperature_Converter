package logic;

public class Converter {

    public double FToC (double temp) {
        temp = (temp - 32) * (5/9);
        return temp;
    }

    public double FToK (double temp) {
        temp = CToK(FToC(temp));
        return temp;
    }

    public double CToF (double temp) {
        temp = temp * (9/5) + 32;
        return temp;
    }

    public double CToK (double temp) {
        temp = temp + 273.15;
        return temp;
    }

    public double KToC (double temp) {
        temp = temp - 273.15;
        return temp;
    }

    public double KToF (double temp) {
        temp = CToF(KToC(temp));
        return temp;
    }
}
