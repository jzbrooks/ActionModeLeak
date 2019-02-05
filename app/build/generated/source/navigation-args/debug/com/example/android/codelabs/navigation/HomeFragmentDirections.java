package com.example.android.codelabs.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class HomeFragmentDirections {
  @NonNull
  public static NextAction nextAction() {
    return new NextAction();
  }

  public static class NextAction implements NavDirections {
    private int flowStepNumber = 1;

    public NextAction() {
    }

    @NonNull
    public NextAction setFlowStepNumber(int flowStepNumber) {
      this.flowStepNumber = flowStepNumber;
      return this;
    }

    @NonNull
    public Bundle getArguments() {
      Bundle __outBundle = new Bundle();
      __outBundle.putInt("flowStepNumber", this.flowStepNumber);
      return __outBundle;
    }

    public int getActionId() {
      return com.example.android.codelabs.navigation.R.id.next_action;
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      NextAction that = (NextAction) object;
      if (flowStepNumber != that.flowStepNumber) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = super.hashCode();
      result = 31 * result + flowStepNumber;
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "NextAction(actionId=" + getActionId() + "){"
          + "flowStepNumber=" + flowStepNumber
          + "}";
    }
  }
}
