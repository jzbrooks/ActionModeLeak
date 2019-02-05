package com.example.android.codelabs.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class FlowStepFragmentArgs {
  private int flowStepNumber = 2;

  private FlowStepFragmentArgs() {
  }

  @NonNull
  public static FlowStepFragmentArgs fromBundle(Bundle bundle) {
    FlowStepFragmentArgs result = new FlowStepFragmentArgs();
    bundle.setClassLoader(FlowStepFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("flowStepNumber")) {
      result.flowStepNumber = bundle.getInt("flowStepNumber");
    }
    return result;
  }

  public int getFlowStepNumber() {
    return flowStepNumber;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putInt("flowStepNumber", this.flowStepNumber);
    return __outBundle;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    FlowStepFragmentArgs that = (FlowStepFragmentArgs) object;
    if (flowStepNumber != that.flowStepNumber) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + flowStepNumber;
    return result;
  }

  @Override
  public String toString() {
    return "FlowStepFragmentArgs{"
        + "flowStepNumber=" + flowStepNumber
        + "}";
  }

  public static class Builder {
    private int flowStepNumber = 2;

    public Builder(FlowStepFragmentArgs original) {
      this.flowStepNumber = original.flowStepNumber;
    }

    public Builder() {
    }

    @NonNull
    public FlowStepFragmentArgs build() {
      FlowStepFragmentArgs result = new FlowStepFragmentArgs();
      result.flowStepNumber = this.flowStepNumber;
      return result;
    }

    @NonNull
    public Builder setFlowStepNumber(int flowStepNumber) {
      this.flowStepNumber = flowStepNumber;
      return this;
    }

    public int getFlowStepNumber() {
      return flowStepNumber;
    }
  }
}
