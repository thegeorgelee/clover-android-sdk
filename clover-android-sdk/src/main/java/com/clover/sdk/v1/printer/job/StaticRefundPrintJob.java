package com.clover.sdk.v1.printer.job;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clover.sdk.v1.printer.Category;
import com.clover.sdk.v3.order.Order;

/**
 * This class is broken, despite the name and parameters it doesn't print a refund, it prints all the refunds for a
 * given payment id. Instead use {@link StaticPaymentPrintJob} with FLAG_REFUND set.
 */
@Deprecated
public class StaticRefundPrintJob extends StaticReceiptPrintJob implements Parcelable {
  private static final String BUNDLE_KEY_REFUND_ID = "r";

  @Deprecated
  public static class Builder extends StaticReceiptPrintJob.Builder {
    private String refundId;

    public Builder staticRefundPrintJob(StaticRefundPrintJob pj) {
      staticReceiptPrintJob(pj);
      this.refundId = pj.refundId;

      return this;
    }

    public Builder refundId(String refundId) {
      this.refundId = refundId;
      return this;
    }

    public StaticRefundPrintJob build() {
      flags |= FLAG_REFUND;
      return new StaticRefundPrintJob(this);
    }
  }

  public final String refundId;

  @Deprecated
  public StaticRefundPrintJob(Order order, String refundId, int flags) {
    super(order, flags);
    this.refundId = refundId;
  }

  protected StaticRefundPrintJob(Builder builder) {
    super(builder);
    this.refundId = builder.refundId;
  }

  public static final Creator<StaticRefundPrintJob> CREATOR = new Creator<StaticRefundPrintJob>() {
    public StaticRefundPrintJob createFromParcel(Parcel in) {
      return new StaticRefundPrintJob(in);
    }

    public StaticRefundPrintJob[] newArray(int size) {
      return new StaticRefundPrintJob[size];
    }
  };

  protected StaticRefundPrintJob(Parcel in) {
    super(in);
    Bundle bundle = in.readBundle(((Object)this).getClass().getClassLoader()); // needed otherwise BadParcelableException: ClassNotFoundException when unmarshalling
    refundId = bundle.getString(BUNDLE_KEY_REFUND_ID);
    // Add more data here, but remember old apps might not provide it!
  }

  @Override
  public Category getPrinterCategory() {
    return Category.RECEIPT;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    super.writeToParcel(dest, flags);
    Bundle bundle = new Bundle();
    bundle.putString(BUNDLE_KEY_REFUND_ID, refundId);

    dest.writeBundle(bundle);
  }
}
