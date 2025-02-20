package day9;
public class WeatherForecast
{
    private String cityName;
    private double windSpeed;
    private int rainCoverage;
    private boolean isRaining;
    private boolean Cloudy;
    private boolean isSunny;

    public WeatherForecast(String cityName, double windSpeed, int rainCoverage, boolean isRaining, boolean isCloudy, boolean isSunny)
    {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainCoverage = rainCoverage;
        this.isRaining = isRaining;
        this.Cloudy = isCloudy;
        this.isSunny = isSunny;
    }

    // Getters and Setters
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getRainCoverage() {
        return rainCoverage;
    }

    public void setRainCoverage(int rainCoverage) {
        this.rainCoverage = rainCoverage;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }

    public boolean isCloudy() {
        return Cloudy;
    }

    public void setCloudy(boolean cloudy) {
        Cloudy = cloudy;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }
    }

