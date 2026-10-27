package currecyconverter;

import java.util.HashMap;

public class APIDTO {
    final public String result;
    final public String documentation;
    final public String terms_of_use;
    final public String time_last_update_unix;
    final public String time_last_update_utc;
    final public String time_next_update_unix;
    final public String time_next_update_utc;
    final public String base_code;
    final public HashMap<String, Double> conversion_rates;

    public APIDTO(
            String result,
            String documentation,
            String termsOfUse,
            String timeLastUpdateUnix,
            String timeLastUpdateUtc,
            String timeNextUpdateUnix,
            String timeNextUpdateUtc,
            String baseCode,
            HashMap<String, Double> conversionRates
    ) {
        this.result = result;
        this.documentation = documentation;
        terms_of_use = termsOfUse;
        time_last_update_unix = timeLastUpdateUnix;
        time_last_update_utc = timeLastUpdateUtc;
        time_next_update_unix = timeNextUpdateUnix;
        time_next_update_utc = timeNextUpdateUtc;
        base_code = baseCode;
        conversion_rates = conversionRates;
    }
}
