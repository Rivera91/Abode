package nyc.c4q.capstone.payment_history_package;

/**
 * Created by D on 3/19/18.
 */

public class PaymentHistoryModel {

    private String month;
    private String amount_paid;


    public PaymentHistoryModel(String month, String amount_paid) {
        this.month = month;
        this.amount_paid = amount_paid;
    }

    public String getMonth() {
        return month;
    }


    public String getAmount_paid() {
        return amount_paid;
    }


}


