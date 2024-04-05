package org.makeitup.weatherforecast.client.view;

import org.apache.commons.lang3.StringUtils;
import org.makeitup.weatherforecast.model.Forecast;

public class ForecastDisplay {
    private Forecast currentForecast;

    public static void process(String URL) {
        if (StringUtils.isEmpty(URL)) { // REPLACE (URL == null || URL.equals("")) with apache.commons 'isEmpty' method
            throw new IllegalArgumentException("no URL provided");
        }
    }
}
