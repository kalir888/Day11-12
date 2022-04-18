package stockaccount;

import java.sql.Time;
import java.util.Date;

public class CompanyShare {
    String stockSymbol;
    long numberOfShares;
    long sharePrice;

    public CompanyShare(String stockSymbol, long numberOfShares, long sharePrice) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }
}
