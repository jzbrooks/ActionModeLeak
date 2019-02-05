package com.example.android.codelabs.navigation;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class DeepLinkFragmentArgs {
  @NonNull
  private String myarg = "Android!";

  private DeepLinkFragmentArgs() {
  }

  @NonNull
  public static DeepLinkFragmentArgs fromBundle(Bundle bundle) {
    DeepLinkFragmentArgs result = new DeepLinkFragmentArgs();
    bundle.setClassLoader(DeepLinkFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("myarg")) {
      result.myarg = bundle.getString("myarg");
      if (result.myarg == null) {
        throw new IllegalArgumentException("Argument \"myarg\" is marked as non-null but was passed a null value.");
      }
    }
    return result;
  }

  @NonNull
  public String getMyarg() {
    return myarg;
  }

  @NonNull
  public Bundle toBundle() {
    Bundle __outBundle = new Bundle();
    __outBundle.putString("myarg", this.myarg);
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
    DeepLinkFragmentArgs that = (DeepLinkFragmentArgs) object;
    if (myarg != null ? !myarg.equals(that.myarg) : that.myarg != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (myarg != null ? myarg.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DeepLinkFragmentArgs{"
        + "myarg=" + myarg
        + "}";
  }

  public static class Builder {
    @NonNull
    private String myarg = "Android!";

    public Builder(DeepLinkFragmentArgs original) {
      this.myarg = original.myarg;
    }

    public Builder() {
    }

    @NonNull
    public DeepLinkFragmentArgs build() {
      DeepLinkFragmentArgs result = new DeepLinkFragmentArgs();
      result.myarg = this.myarg;
      return result;
    }

    @NonNull
    public Builder setMyarg(@NonNull String myarg) {
      if (myarg == null) {
        throw new IllegalArgumentException("Argument \"myarg\" is marked as non-null but was passed a null value.");
      }
      this.myarg = myarg;
      return this;
    }

    @NonNull
    public String getMyarg() {
      return myarg;
    }
  }
}
